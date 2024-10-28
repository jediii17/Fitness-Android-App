package com.example.fitness.domain.usecase.workout

import com.example.fitness.common.BodyType
import com.example.fitness.common.Constant
import com.example.fitness.common.Gender
import com.example.fitness.common.WorkoutCategoriesForFemale
import com.example.fitness.common.WorkoutCategoriesForMale
import com.example.fitness.common.WorkoutReps
import com.example.fitness.domain.repository.UserRepositoryImpL
import com.example.fitness.domain.dto.WorkoutItemDto
import com.example.fitness.domain.dto.toUserDetailsDto


class GetWorkoutItemsUseCase(private val userRepositoryImpL: UserRepositoryImpL) {

    //maximum of random workout list
    private var workListMax = 3

    suspend operator fun invoke(): List<WorkoutItemDto> {
        var list = emptyList<WorkoutItemDto>()
        //get the user categories
        userRepositoryImpL.getUserId(Constant.userId.longValue)?.toUserDetailsDto()?.let { user ->

            when (user.bodytype){
                BodyType.BEGINNER.name -> {
                    workListMax = 8
                }
                BodyType.INTERMEDIATE.name -> {
                    workListMax = 10
                }
                BodyType.ADVANCE.name -> {
                    workListMax = 15
                }
            }

            //cache body type
            Constant.bodyTypeCategory = user.bodytype

            list = when (user.gender) {
                Gender.MALE.name -> {
                    generateWorkoutListCategoryForMale(
                        getWorkoutReps(user.bodytype).reps,
                        getWorkoutReps(user.bodytype).durationInSeconds
                    )
                }

                Gender.FEMALE.name -> {
                    generateWorkoutListCategoryForFemale(
                        getWorkoutReps(user.bodytype).reps,
                        getWorkoutReps(user.bodytype).durationInSeconds
                    )
                }

                else -> {
                    generateWorkoutListCategoryForMale(
                        getWorkoutReps(user.bodytype).reps,
                        getWorkoutReps(user.bodytype).durationInSeconds
                    )
                }
            }
        }
        return list
     }

    private fun getWorkoutReps(bodyType: String): WorkoutReps {
        return when(bodyType){
            BodyType.BEGINNER.name -> WorkoutReps.BEGINNER
            BodyType.INTERMEDIATE.name -> WorkoutReps.INTERMEDIATE
            BodyType.ADVANCE.name -> WorkoutReps.ADVANCE
            else ->  WorkoutReps.BEGINNER
        }
    }

    //generate work out per category listed in the enum
    private fun generateWorkoutListCategoryForMale(
        reps: Int,
        duration: Int
    ): List<WorkoutItemDto> {
        val mutableList = mutableListOf<WorkoutItemDto>()
        WorkoutCategoriesForMale.entries.forEachIndexed { index, it ->
                mutableList.add(
                    WorkoutItemDto(
                        workoutId = it.workoutId,imageRes = it.imageRes, workoutName = it.workoutName, reps = reps, duration = duration)
                )
            }



        return mutableList.toList().shuffled().take(workListMax)
    }

  //generate work out per category listed in the enum
    private fun generateWorkoutListCategoryForFemale(
        reps: Int,
        duration: Int
    ): List<WorkoutItemDto> {
        val mutableList = mutableListOf<WorkoutItemDto>()
        WorkoutCategoriesForFemale.entries.forEachIndexed { index, it ->
            mutableList.add(
                WorkoutItemDto(
                    workoutId = it.workoutId,
                    imageRes = it.imageRes,
                    workoutName = it.workoutName,
                    reps = reps,
                    duration = duration
                )
            )
        }

        return mutableList.toList().shuffled().take(workListMax)
    }
}
