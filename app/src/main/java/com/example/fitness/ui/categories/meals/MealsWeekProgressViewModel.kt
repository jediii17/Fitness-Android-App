package com.example.fitness.ui.categories.meals

import androidx.lifecycle.ViewModel
import com.example.fitness.domain.usecase.meals.GetMealsProgressUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MealsWeekProgressViewModel(private val getMealsProgressUseCase: GetMealsProgressUseCase,) : ViewModel() {
    // Holds the UI state using MutableStateFlow for state management
    private val _uiState = MutableStateFlow(WorkoutIProgressUIState())
    val uiState: StateFlow<WorkoutIProgressUIState> = _uiState.asStateFlow()

    suspend fun getMealsWeekProgress(){
        val mealsProgressUseCaseProgressDto = getMealsProgressUseCase.invoke()

        //get the last updated workout progress and check the day count
        mealsProgressUseCaseProgressDto.lastOrNull()?.let {

            //get the last index
            _uiState.value = _uiState.value.copy(
                mealsDayCount =  it.mealsProgressDayCount,
                mealsWeekCount =  it.mealsProgressWeekCount
            )
        }
    }
}

// Data class to hold the UI state
data class WorkoutIProgressUIState(
    val mealsWeekCount: Int = 0,
    val mealsDayCount: Int = 0,
)