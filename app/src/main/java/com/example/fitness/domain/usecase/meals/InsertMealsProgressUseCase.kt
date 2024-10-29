package com.example.fitness.domain.usecase.meals

import com.example.fitness.data.entity.MealsEntity
import com.example.fitness.domain.repository.MealsRepositoryImpl

class InsertMealsProgressUseCase(private val mealsRepositoryImpl: MealsRepositoryImpl) {
    suspend operator fun invoke(mealsEntity: MealsEntity){
        mealsRepositoryImpl.insertMealsProgress(mealsEntity)
    }
}