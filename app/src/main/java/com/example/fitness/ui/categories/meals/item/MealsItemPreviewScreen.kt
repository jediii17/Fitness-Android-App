package com.example.fitness.ui.categories.meals.item

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.fitness.R
import com.example.fitness.ui.categories.meals.MealsWeekProgressScreen
import com.example.fitness.ui.common.CommonHeader


@Composable
fun MealsItemPreviewScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        CommonHeader(
            text = "Meal Plan",
            subText = "Stay motivated on your journey to be healthier.",
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(80.dp))
        Text(
            text = "Day 1",
            style = MaterialTheme.typography.displayLarge,
            color = Color.Black,
            fontSize = 25.sp,
            textAlign = TextAlign.Center
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            TabButton("Breakfast", isSelected = true)
            TabButton("Lunch", isSelected = false)
            TabButton("Dinner", isSelected = false)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .clip(RoundedCornerShape(20.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.chickentinola),
                contentDescription = "Meal Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.6f))
                        )
                    )
                    .fillMaxWidth()
                    .padding(12.dp)
            ) {
                Text(
                    "Chicken Tinola with Rice",
                    color = Color.White,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    "High in protein",
                    color = Color.White,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            NutritionInfo("300", "Calories")
            NutritionInfo("15g", "Protein")
            NutritionInfo("40g", "Carbs")
            NutritionInfo("4g", "Fats")
        }
    }
}



@Composable
fun TabButton(text: String, isSelected: Boolean) {
    Text(
        text = text,
        color = if (isSelected) Color.White else Color.Black,
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier
            .background(
                color = if (isSelected) Color(0xFF2A9D8F) else Color.LightGray,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(horizontal = 20.dp, vertical = 10.dp)
    )
}

@Composable
fun NutritionInfo(value: String, label: String) {
    Box(
        modifier = Modifier
            .size(65.dp)
            .clip(CircleShape)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(value, style = MaterialTheme.typography.titleLarge, color = Color.Black)
            Text(label, style = MaterialTheme.typography.labelSmall, color = Color.Gray)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MealsItemPreviewScreenPreview() {
    val navController = rememberNavController()
    MealsItemPreviewScreen(navController)
}

