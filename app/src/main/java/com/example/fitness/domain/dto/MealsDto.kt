package com.example.fitness.domain.dto

import com.example.fitness.data.entity.MealsEntity

data class MealsDto(
    val mealsId: String,
    val imageRes: Int,
    val mealsName: String,
    val mealsDescription: String,
    val calories: String,
    val fats: String,
    val protein: String,
    val carbs: String,
    val mealTime: String,
)


