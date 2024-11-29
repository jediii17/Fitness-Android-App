package com.example.fitness.domain.usecase.meals

import com.example.fitness.data.entity.DailyMealSetEntity
import com.example.fitness.domain.repository.DailyMealSetRepositoryImpl

class UpdateCurrentDayMealUseCase(private val dailyMealSetRepositoryImpl: DailyMealSetRepositoryImpl) {
    suspend operator fun invoke(status: String, mealsProgressDay: String, accountId: Long, mealTime: String, mealsId: String){
        dailyMealSetRepositoryImpl.updateMealStatus(status, mealsProgressDay, accountId, mealTime, mealsId = mealsId)
    }
}