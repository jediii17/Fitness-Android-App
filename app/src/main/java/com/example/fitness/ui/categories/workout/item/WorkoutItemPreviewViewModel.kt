package com.example.fitness.ui.categories.workout.item

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fitness.domain.dto.Exercise
import com.example.fitness.domain.dto.WorkoutItemDto
import com.example.fitness.domain.usecase.workout.GetWorkoutItemsUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

// ViewModel to manage the UI state and business logic for Workout items
class WorkoutItemPreviewViewModel(private val getWorkoutItemsUseCase: GetWorkoutItemsUseCase) : ViewModel() {

    // Holds the UI state using MutableStateFlow for state management
    private val _uiState = MutableStateFlow(WorkoutItemUIState())
    val uiState: StateFlow<WorkoutItemUIState> = _uiState.asStateFlow()

    // Fetches a specific workout item by its ID
    fun getWorkoutItem(workoutId: String) {
        CoroutineScope(Dispatchers.IO).launch{
            val workoutList = getWorkoutItemsUseCase().toMutableList()
            val workoutItem = workoutList.find { it.workoutId == workoutId }

            _uiState.value = _uiState.value.copy(
                workoutItemDto = workoutItem,
                workoutList = workoutList
            )
        }
    }

    // Fetches all workout items
    fun getWorkoutAllList() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                workoutList = getWorkoutItemsUseCase().toMutableList()
            )
        }
    }
}

// Data class to hold the UI state
data class WorkoutItemUIState(
    val workoutItemDto: WorkoutItemDto? = null,
    val workoutList: List<WorkoutItemDto> = emptyList(),
    val currentSetExercises: List<Exercise> = emptyList()  // Holds the exercises for the current set
)
