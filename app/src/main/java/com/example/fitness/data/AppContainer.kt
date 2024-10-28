package com.example.fitness.data

import android.content.Context
import com.example.fitness.data.db.FitnessDb
import com.example.fitness.data.repository.WorkoutRepository
import com.example.fitness.domain.repository.UserRepositoryImpL
import com.example.fitness.domain.repository.WorkoutRepositoryImpl
import com.example.fitness.domain.usecase.profile.GetUserProfileUseCase
import com.example.fitness.domain.usecase.InsertBodyFatUseCase
import com.example.fitness.domain.usecase.InsertBodyGoalsUseCase
import com.example.fitness.domain.usecase.InsertBodyTypeUseCase
import com.example.fitness.domain.usecase.InsertFirstLastNameUseCase
import com.example.fitness.domain.usecase.InsertGenderUseCase
import com.example.fitness.domain.usecase.InsertHeightUseCase
import com.example.fitness.domain.usecase.InsertWeightUseCase
import com.example.fitness.domain.usecase.LoginUseCase
import com.example.fitness.domain.usecase.RegisterUseCase
import com.example.fitness.domain.usecase.profile.UpdateUserProfileUseCase
import com.example.fitness.domain.usecase.workout.GetWorkoutItemsUseCase
import com.example.fitness.domain.usecase.workout.GetWorkoutProgressUseCase
import com.example.fitness.domain.usecase.workout.InsertWorkoutProgressUseCase

/**
 * App container for Dependency injection.
 */
interface AppContainer {

    val loginUseCase: LoginUseCase
    val registerUseCase: RegisterUseCase
    val getWorkoutItemsUseCase: GetWorkoutItemsUseCase
    val insertGenderUseCase: InsertGenderUseCase
    val insertHeightUseCase: InsertHeightUseCase
    val insertWeightUseCase: InsertWeightUseCase
    val insertBodyTypeUseCase: InsertBodyTypeUseCase
    val insertBodyFatUseCase: InsertBodyFatUseCase
    val insertBodyGoalsUseCase: InsertBodyGoalsUseCase
    val insertFirstLastNameUseCase: InsertFirstLastNameUseCase
    val getUserProfileUseCase: GetUserProfileUseCase
    val updateUserProfileUseCase: UpdateUserProfileUseCase

    // for meals
    //val getMealsCategoriesUseCase: GetMealsCategoriesUseCase

    //for workout
    val getWorkoutProgressUseCase: GetWorkoutProgressUseCase
    val insertWorkoutProgressUseCase: InsertWorkoutProgressUseCase
}


/**
 * [AppContainer] implementation that provides instance of [OfflineItemsRepository]
 */
class AppDataContainer(
    private val context: Context,

) : AppContainer {
    /**
     * Implementation for [UserRepositoryImpL]
     */
    val userRepositoryImpL: UserRepositoryImpL by lazy {
        UserRepositoryImpL(FitnessDb.getDatabase(context).UserDao())
    }
    /**
     * Implementation for [workoutRepositoryImpL]
     */
    val workoutRepositoryImpL: WorkoutRepositoryImpl by lazy {
        WorkoutRepositoryImpl(FitnessDb.getDatabase(context).WorkoutDao())
    }

    //add usecase implementation for login use case
    override val loginUseCase: LoginUseCase by lazy {
        LoginUseCase(userRepositoryImpL)
    }

    override val registerUseCase: RegisterUseCase by lazy {
        RegisterUseCase(userRepositoryImpL)
    }

    override val insertGenderUseCase: InsertGenderUseCase by lazy {
       InsertGenderUseCase(userRepositoryImpL)
    }
    override val insertHeightUseCase: InsertHeightUseCase by lazy {
        InsertHeightUseCase(userRepositoryImpL)
    }
    override val insertWeightUseCase: InsertWeightUseCase by lazy {
        InsertWeightUseCase(userRepositoryImpL)
    }
    override val insertBodyTypeUseCase: InsertBodyTypeUseCase by lazy {
        InsertBodyTypeUseCase(userRepositoryImpL)
    }
    override val insertBodyFatUseCase: InsertBodyFatUseCase by lazy {
        InsertBodyFatUseCase(userRepositoryImpL)
    }
    override val insertBodyGoalsUseCase: InsertBodyGoalsUseCase by lazy {
        InsertBodyGoalsUseCase(userRepositoryImpL)
    }
    override val insertFirstLastNameUseCase: InsertFirstLastNameUseCase by lazy {
        InsertFirstLastNameUseCase(userRepositoryImpL)
    }
    override val getUserProfileUseCase: GetUserProfileUseCase by lazy{
        GetUserProfileUseCase(userRepositoryImpL)
    }
    override val updateUserProfileUseCase: UpdateUserProfileUseCase by lazy{
        UpdateUserProfileUseCase(userRepositoryImpL)
    }

    //for workout repository
    override val getWorkoutProgressUseCase: GetWorkoutProgressUseCase by lazy{
        GetWorkoutProgressUseCase(workoutRepositoryImpL)
    }

    override val insertWorkoutProgressUseCase: InsertWorkoutProgressUseCase by lazy{
        InsertWorkoutProgressUseCase(workoutRepositoryImpL)
    }

    override val getWorkoutItemsUseCase: GetWorkoutItemsUseCase by lazy {
        GetWorkoutItemsUseCase(userRepositoryImpL)
    }

}

