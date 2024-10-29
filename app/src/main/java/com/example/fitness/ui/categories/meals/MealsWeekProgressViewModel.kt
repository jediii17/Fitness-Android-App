package com.example.fitness.ui.categories.meals

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fitness.domain.dto.MealsDto
import com.example.fitness.domain.usecase.meals.GetMealsListUseCase
import com.example.fitness.domain.usecase.meals.GetMealsProgressUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MealsWeekProgressViewModel(private val getMealsProgressUseCase: GetMealsProgressUseCase,
                                 private val getMealsListUseCase: GetMealsListUseCase,
    ) : ViewModel() {
    // Holds the UI state using MutableStateFlow for state management
    private val _uiState = MutableStateFlow(WorkoutIProgressUIState())
    val uiState: StateFlow<WorkoutIProgressUIState> = _uiState.asStateFlow()

    init {
        //run on start
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                getMealsWeekHighlights()
            }
        }

    }

    suspend fun getMealsWeekProgress(){
        val mealsProgressUseCaseProgressDto = getMealsProgressUseCase.invoke()
        val mealsListUseCaseProgressDto = getMealsListUseCase.invoke()

        //get the last updated workout progress and check the day count
        mealsProgressUseCaseProgressDto.lastOrNull()?.let {
            //get the last index
            _uiState.value = _uiState.value.copy(
                mealsDayCount =  it.mealsProgressDayCount,
                mealsWeekCount =  it.mealsProgressWeekCount
            )
        }


        //get the menu highlight
        mealsListUseCaseProgressDto.shuffled().take(4).let {
            _uiState.value = _uiState.value.copy(
                mealsHighlights = it
            )
        }
    }

     private suspend fun getMealsWeekHighlights(){
        val mealsListUseCaseProgressDto = getMealsListUseCase.invoke()

        //get the menu highlight
        mealsListUseCaseProgressDto.shuffled().take(4).let {
            _uiState.value = _uiState.value.copy(
                mealsHighlights = it
            )
        }
    }
}

// Data class to hold the UI state
data class WorkoutIProgressUIState(
    val mealsWeekCount: Int = 0,
    val mealsDayCount: Int = 0,
    val mealsHighlights: List<MealsDto> = emptyList(),
)