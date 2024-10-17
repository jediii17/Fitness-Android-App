package com.example.fitness.common

import androidx.compose.material3.AssistChipDefaults.Height
import androidx.compose.runtime.MutableFloatState
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.font.FontSynthesis.Companion.Weight

object Constant {
    var isLogin = mutableStateOf(false) // false is default bypass muna
    var isShowBottomNav = mutableStateOf(false) // false is default bypass muna
    var userId = mutableLongStateOf(0L)
    var getgender = mutableStateOf(Gender.MALE)

    var bodyTypeCategory = BodyType.BEGINNER.name

    val COMPLETED_STATUS = "COMPLETED"
    val MAX_WEEK_COUNT = 4

    //for logout purposes
    fun logoutReset(){
        userId.longValue = 0L
        isLogin.value = false
        isShowBottomNav.value = false
    }
}