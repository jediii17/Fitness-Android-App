package com.example.fitness.domain.usecase

import com.example.fitness.data.entity.UserEntity
import com.example.fitness.domain.repository.UserRepositoryImpL

class RegisterUseCase(private val userRepositoryImpL: UserRepositoryImpL) {
    suspend operator fun invoke(userEntity: UserEntity){
        userRepositoryImpL.insertUser(userEntity)
    }
}