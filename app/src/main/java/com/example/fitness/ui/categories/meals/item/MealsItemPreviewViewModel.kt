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

    private val _uiState = MutableStateFlow(MealsPreviewUIState())
    val uiState: StateFlow<MealsPreviewUIState> = _uiState.asStateFlow()


    suspend fun getMealsWeekHighlights(mealId: String?){
        val mealsListUseCaseProgressDto = getMealsListUseCase.invoke()
        mealsListUseCaseProgressDto.shuffled().let { meals ->

            val mealForToday = mutableListOf<MealsDto>()

            val breakfastMeal =  meals.first{ ml -> ml.mealTime == MealTime.BREAKFAST.label }


            val lunchMeal =  if(mealId.equals(Constant.NO_MEAL_HIGHLIGHT_ID)){
                meals.first{ ml -> ml.mealTime == MealTime.LUNCH.label }
            }else{
                meals.first{ ml -> ml.mealsId == mealId }
            }

            val dinnerMeal =  meals.first{ ml -> ml.mealTime == MealTime.DINNER.label }


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


        val mealProgressDto = getMealsProgressUseCase.invoke()


        mealProgressDto.lastOrNull()?.let { meal ->
            var dayProgress = meal.mealsProgressDayCount
            var weekProgress = meal.mealsProgressWeekCount
            var monthProgress = meal.mealsProgressMonthCount


            if((dayProgress + 1) <= 7){
                dayProgress += 1
            }else{

                if( weekProgress + 1 < Constant.MAX_WEEK_COUNT){
                    weekProgress += 1
                    dayProgress =  1
                }else{
                    monthProgress += 1
                }
            }

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
}

/** Data class to hold the UI state */
data class MealsPreviewUIState(
    val calories: String? = null,
    val protein: String? = null,
    val carbs: String? = null,
    val totalCalories: String? = null,
    val totalProtein: String? = null,
    val totalCarbs: String? = null,
    val totalFats: String? = null,
    val meals: List<MealsDto> = emptyList(),
) {
    data class Meal(
        val mealsname: String,
        val mealsdescription: String,
        val imageRes: Int,
    )
}