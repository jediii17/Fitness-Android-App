package com.example.fitness.ui.categories.meals.item

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


@Composable
fun MealsItemPreviewScreen(modifier: Modifier, navController: NavHostController){
    Box{
        Column {
            Row(Modifier.border(width = 1.dp,
                color = Color.Blue)
                .fillMaxWidth())
            { Text("BreakFast") }

            Row(Modifier.border(
                width = 1.dp,
                color = Color.Magenta)
                .fillMaxWidth()
                .fillMaxHeight())
            { Text("Lunch") }

            Row(Modifier.border(width = 1.dp,
                color = Color.Green)
                .fillMaxSize())
            { Text("Dinner") }
        }
    }
}



