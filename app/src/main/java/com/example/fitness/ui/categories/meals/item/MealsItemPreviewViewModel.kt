package com.example.fitness.ui.categories.meals.item

import androidx.lifecycle.ViewModel
import com.example.fitness.common.Constant
import com.example.fitness.common.MealTime
import com.example.fitness.common.MyUtils
import com.example.fitness.domain.dto.MealsDto
import com.example.fitness.domain.dto.MealsProgressDto
import com.example.fitness.domain.dto.toMealsEntity
import com.example.fitness.domain.usecase.meals.GetMealsListUseCase
import com.example.fitness.domain.usecase.meals.GetMealsProgressUseCase
import com.example.fitness.domain.usecase.meals.InsertMealsProgressUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MealsItemPreviewViewModel(private val getMealsProgressUseCase: GetMealsProgressUseCase,
                                private val getMealsListUseCase: GetMealsListUseCase,
                                private val insertMealsProgressUseCase: InsertMealsProgressUseCase,
                                ) : ViewModel() {

    // Holds the UI state using MutableStateFlow for state management
    private val _uiState = MutableStateFlow(MealsPreviewUIState())
    val uiState: StateFlow<MealsPreviewUIState> = _uiState.asStateFlow()

    // Holds the current meal ("Breakfast", "Lunch", "Dinner")
    // private val _selectedMealType = MutableStateFlow("Breakfast")
    // val selectedMealType: StateFlow<String> = _selectedMealType.asStateFlow()

    // Holds meal details
   // private val _mealInfo = MutableStateFlow(MealInfo("Chicken Tinola with Rice", "High in protein"))
   // val mealInfo: StateFlow<MealInfo> = _mealInfo.asStateFlow()

    suspend fun getMealsWeekHighlights(mealId: String?){
        val mealsListUseCaseProgressDto = getMealsListUseCase.invoke()
        mealsListUseCaseProgressDto.shuffled().let { meals ->

            val mealForToday = mutableListOf<MealsDto>()

            val breakfastMeal =  meals.first{ ml -> ml.mealTime == MealTime.BREAKFAST.label }

            //get the ID of the Lunch highlight
            val lunchMeal =  if(mealId.equals(Constant.NO_MEAL_HIGHLIGHT_ID)){
                meals.first{ ml -> ml.mealTime == MealTime.LUNCH.label }
            }else{
                meals.first{ ml -> ml.mealsId == mealId }
            }

            val dinnerMeal =  meals.first{ ml -> ml.mealTime == MealTime.DINNER.label }

            //calculate the total NUTRIENTS for today

            //add all the meals for today
            mealForToday.add(breakfastMeal)
            mealForToday.add(lunchMeal)
            mealForToday.add(dinnerMeal)

            _uiState.value = _uiState.value.copy(
                meals = mealForToday
            )
        }
    }

    /**
     * This function called once the button DONE was click or the Day Workout was DONE
     * */
    suspend fun updateDoneProgressCount(){

        //get the progress data
        val mealProgressDto = getMealsProgressUseCase.invoke()

        //get the last updated workout progress and check the day count
        mealProgressDto.lastOrNull()?.let { meal ->
            var dayProgress = meal.mealsProgressDayCount
            var weekProgress = meal.mealsProgressWeekCount
            var monthProgress = meal.mealsProgressMonthCount

            //calculate the days and week
            if((dayProgress + 1) <= 7){
                dayProgress += 1 //add to days only since less than 7 days
            }else{
                //week should be less than 4 weeks
                if( weekProgress + 1 < Constant.MAX_WEEK_COUNT){
                    weekProgress += 1
                    dayProgress =  1 //reset to 1 since new week count
                }else{
                    monthProgress += 1 //add to Month progress
                }
            }

            // insert/populate to database the update
            val meals = MealsProgressDto(
                 mealsProgressDayCount = dayProgress,
                 mealsProgressWeekCount = weekProgress,
                 mealsProgressMonthCount = monthProgress,
                 mealsProgressDate = MyUtils.getTheCurrentDateTime(),
                 calories = 50,
                 protein = 50,
                 fat = 50,
                 carbs = 50,
                accountId = Constant.userId.longValue,
            )

            insertMealsProgressUseCase.invoke(
                meals.toMealsEntity()
            )
        } ?: run {

            // insert new data if empty
            val meals = MealsProgressDto(
                mealsProgressDayCount = 1,
                mealsProgressWeekCount = 0,
                mealsProgressMonthCount = 0,
                mealsProgressDate = MyUtils.getTheCurrentDateTime(),
                calories = 50,
                protein = 50,
                fat = 50,
                carbs = 50,
                accountId = Constant.userId.longValue,
            )

            insertMealsProgressUseCase.invoke(
                meals.toMealsEntity()
            )
        }
    }



    // Holds nutritional values
  /*  private val _nutritionInfo = MutableStateFlow(
        NutritionInfo(
            calories = "300",
            protein = "15g",
            carbs = "40g",
            fats = "4g"
        )
    )
    val nutritionInfo: StateFlow<NutritionInfo> = _nutritionInfo.asStateFlow()

    // Updates the selected meal
    fun updateSelectedMealType(mealType: String) {
        _selectedMealType.value = mealType
    }*/
}
// Data class to hold the UI state
data class MealsPreviewUIState(
    val calories: String? = null,
    val protein: String? = null,
    val carbs: String? = null,
    val totalCalories: String? = null,
    val totalProtein: String? = null,
    val totalCarbs: String? = null,
    val totalFats: String? = null,
    val meals: List<MealsDto> = emptyList(),
)