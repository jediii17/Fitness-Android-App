package com.example.fitness.domain.usecase.profile

import com.example.fitness.domain.repository.UserRepositoryImpL

class UpdateUserProfileUseCase(private val userRepositoryImpL: UserRepositoryImpL) {
    suspend operator fun invoke(userId: Long,
                                profilePic: String,
                                firstname: String,
                                lastname: String,
                                height: String,
                                weight: String,
                                gender: String,
                                age: String,
                                bodytype: String,
                                bodyfat: String){
        userRepositoryImpL.setProfile(userId = userId,
            profilePic = profilePic,
            firstname = firstname,
            lastname = lastname,
            height = height,
            weight = weight,
            age = age,
            bodyfat = bodyfat,
            gender = gender,
            bodytype = bodytype)
    }
}
