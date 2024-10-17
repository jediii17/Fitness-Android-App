package com.example.fitness.domain.usecase.workout

import com.example.fitness.common.Constant
import com.example.fitness.domain.dto.WorkoutDto
import com.example.fitness.domain.dto.toWorkoutDtoList
import com.example.fitness.domain.repository.WorkoutRepositoryImpl

class GetWorkoutProgressUseCase(val repository: WorkoutRepositoryImpl) {
    suspend operator fun invoke(): List<WorkoutDto>{
        return repository.getWorkoutProgress(accountId = Constant.userId.longValue)?.toWorkoutDtoList() ?: emptyList()
    }
}