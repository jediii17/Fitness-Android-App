package com.example.fitness.ui.categories.reset

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.fitness.R
import com.example.fitness.ui.AppViewModelProvider
import com.example.fitness.ui.categories.weight.WeightViewModel
import com.example.fitness.ui.common.CommonHeader
import com.example.fitness.ui.common.DialogConfirmation
import com.example.fitness.ui.common.DialogSuccess
import com.example.fitness.ui.theme.greenMain_light
import com.google.firebase.annotations.concurrent.Background

@Composable
fun ResetScreen(navController: NavController) {

    val resetViewModel: ResetViewModel = viewModel(factory = AppViewModelProvider.Factory)
    var showWorkoutResetConfirmation by remember { mutableStateOf(false) }
    var showMealsResetConfirmation by remember { mutableStateOf(false) }

    var showSuccess by remember {mutableStateOf(false)  }

    if (showSuccess){
        DialogSuccess(
            text = "Reset Successfully!"
        ){
            navController.popBackStack()
            showSuccess = false
        }

    }

    //show WARNING to user Progress will be reset
    if (showWorkoutResetConfirmation || showMealsResetConfirmation) {
        DialogConfirmation(
            text = "Are you sure you want to reset your progress?",
            icon = R.drawable.ques,
            onYesClick = {
                if(showWorkoutResetConfirmation){
                    resetViewModel.resetWorkouts()
                    showWorkoutResetConfirmation = false
                }
                if(showMealsResetConfirmation){
                    resetViewModel.resetMeals()
                    showMealsResetConfirmation = false
                }

                showSuccess = true
            },
            onNoClick = {
                showWorkoutResetConfirmation = false
                showMealsResetConfirmation = false
            }
        )

    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        CommonHeader(
            modifier = Modifier.fillMaxWidth(),
            text = "Reset",
            subText = "You can freely reset your progress here!",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(150.dp))

        Button(
            onClick = {
                showMealsResetConfirmation = true
            } ,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = greenMain_light)

        ) {
            Text("Reset Meals", color = Color.White, fontSize = 20.sp)
        }

        Button(
            onClick = {
                showWorkoutResetConfirmation = true
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = greenMain_light)
        ) {
            Text("Reset Workouts", color = Color.White,fontSize = 20.sp)
        }
    }
}


