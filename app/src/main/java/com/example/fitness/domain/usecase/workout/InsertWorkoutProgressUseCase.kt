package com.example.fitness.domain.usecase.workout

import com.example.fitness.data.entity.UserEntity
import com.example.fitness.data.entity.WorkoutEntity
import com.example.fitness.domain.repository.UserRepositoryImpL
import com.example.fitness.domain.repository.WorkoutRepositoryImpl

class InsertWorkoutProgressUseCase(private val workoutRepositoryImpl: WorkoutRepositoryImpl) {
    suspend operator fun invoke(workoutEntity: WorkoutEntity){
        workoutRepositoryImpl.insertWorkoutProgress(workoutEntity)
    }
}