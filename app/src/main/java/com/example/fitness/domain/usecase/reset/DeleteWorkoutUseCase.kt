package com.example.fitness.domain.usecase.reset

import com.example.fitness.data.repository.WorkoutRepository
import com.example.fitness.domain.repository.WorkoutRepositoryImpl

class DeleteWorkoutUseCase(private val workoutRepositoryImpl: WorkoutRepositoryImpl) {
    suspend operator fun invoke(userId: Long){
        workoutRepositoryImpl.deleteAllWorkout(accountId = userId)
    }
}