package com.example.fitness.domain.usecase.meals

import com.example.fitness.common.BodyFatLevel
import com.example.fitness.common.Constant
import com.example.fitness.common.MealsCategoriesBeginner
import com.example.fitness.domain.dto.MealsDto
import com.example.fitness.domain.dto.toUserDetailsDto
import com.example.fitness.domain.repository.UserRepositoryImpL

class GetMealsListUseCase(private val userRepositoryImpL: UserRepositoryImpL) {
        suspend operator fun invoke(): List<MealsDto> {

            var list = emptyList<MealsDto>()
            //get the user categories
            userRepositoryImpL.getUserId(Constant.userId.longValue)?.toUserDetailsDto()?.let { user ->

                list = when (user.bodyfat) {
                    BodyFatLevel.LEAN.name -> {
                        generateMealBeginner()
                    }

                    BodyFatLevel.ATHLETIC.name -> {
                        generateMealBeginner()
                    }

                    BodyFatLevel.NATURAL.name-> {
                        generateMealBeginner()
                    }
                    else ->{
                        generateMealBeginner()
                    }
                }
            }

            return list
        }


    //generate work out per category listed in the enum
    private fun generateMealBeginner(): List<MealsDto> {
        val mutableList = mutableListOf<MealsDto>()
        MealsCategoriesBeginner.entries.forEachIndexed { index, it ->
            mutableList.add(
                MealsDto(
                    mealsId = it.mealsId,
                    imageRes = it.imageRes,
                    mealsName = it.mealsName,
                    mealsDescription = it.mealsDescription,
                    calories = it.calories,
                    fats = it.fats,
                    protein = it.protein,
                    carbs = it.carbs,
                    mealTime = it.mealTime)
            )
        }
        return mutableList.toList().shuffled()
    }

}

