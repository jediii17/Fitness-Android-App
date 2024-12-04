package com.example.fitness.domain.usecase.reset

import com.example.fitness.data.repository.DailyMealSetRepository
import com.example.fitness.domain.repository.DailyMealSetRepositoryImpl
import com.example.fitness.domain.repository.MealsRepositoryImpl

class DeleteMealsUseCase(private val dailyMealSetRepositoryImpl: DailyMealSetRepositoryImpl,
                         private val mealsRepositoryImpl: MealsRepositoryImpl ) {
    suspend operator fun invoke(userId: Long){
        dailyMealSetRepositoryImpl.deleteAllDailyMeal(accountId = userId)
        mealsRepositoryImpl.delete(accountId = userId)
    }
}