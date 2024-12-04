package com.example.fitness.ui.categories.reset


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fitness.common.Constant
import com.example.fitness.domain.usecase.reset.DeleteMealsUseCase
import com.example.fitness.domain.usecase.reset.DeleteWorkoutUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ResetViewModel(
    private val deleteMealsUseCase: DeleteMealsUseCase,
    private val deleteWorkoutUseCase: DeleteWorkoutUseCase
) : ViewModel() {

    // Logic to reset meals
    fun resetMeals() {
        viewModelScope.launch(Dispatchers.IO) {
            // Simulate a reset operation or call to a repository
            // Add any further logic like clearing a database or calling an API
            deleteMealsUseCase.invoke(Constant.userId.longValue)
        }
    }

    // Logic to reset workouts
    fun resetWorkouts() {
        viewModelScope.launch(Dispatchers.IO) {
            // Simulate a reset operation or call to a repository
            // Add any further logic like clearing a database or calling an API
            deleteWorkoutUseCase.invoke(Constant.userId.longValue)
        }
    }
}
