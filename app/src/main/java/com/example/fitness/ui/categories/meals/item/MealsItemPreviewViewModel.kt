package com.example.fitness.ui.categories.meals.item

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MealsItemPreviewViewModel() : ViewModel() {

    // Holds the current day ("Day 1")
    private val _currentDay = MutableStateFlow("Day 1")
    val currentDay: StateFlow<String> = _currentDay.asStateFlow()

    // Holds the current meal ("Breakfast", "Lunch", "Dinner")
    private val _selectedMealType = MutableStateFlow("Breakfast")
    val selectedMealType: StateFlow<String> = _selectedMealType.asStateFlow()

    // Holds meal details
   // private val _mealInfo = MutableStateFlow(MealInfo("Chicken Tinola with Rice", "High in protein"))
   // val mealInfo: StateFlow<MealInfo> = _mealInfo.asStateFlow()

    // Holds nutritional values
  /*  private val _nutritionInfo = MutableStateFlow(
        NutritionInfo(
            calories = "300",
            protein = "15g",
            carbs = "40g",
            fats = "4g"
        )
    )
    val nutritionInfo: StateFlow<NutritionInfo> = _nutritionInfo.asStateFlow()

    // Updates the selected meal
    fun updateSelectedMealType(mealType: String) {
        _selectedMealType.value = mealType
    }*/
}