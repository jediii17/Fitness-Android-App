package com.example.fitness.domain.usecase.profile

import com.example.fitness.domain.dto.UserDetailsDto
import com.example.fitness.domain.dto.toUserDetailsDto
import com.example.fitness.domain.repository.UserRepositoryImpL

class GetUserProfileUseCase(private val userRepositoryImpL: UserRepositoryImpL) {
        suspend operator fun invoke(userId: Long): UserDetailsDto {
            return userRepositoryImpL.getUserId(userId)?.toUserDetailsDto() ?: UserDetailsDto()
        }
}
