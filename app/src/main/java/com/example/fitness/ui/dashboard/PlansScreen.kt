package com.example.fitness.ui.dashboard

import com.example.fitness.ui.theme.greenMain_light
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import java.time.LocalDate
import java.time.YearMonth
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun PlansScreen(navController: NavHostController) {
    var year by remember { mutableStateOf(LocalDate.now().year) }
    var month by remember { mutableStateOf(LocalDate.now().monthValue) }
    val dashboardViewModel: DashboardViewModel = viewModel()

    Column(modifier = Modifier.padding(16.dp)) {
        MonthNavigation(
            year = year,
            month = month,
            onPreviousMonth = {
                if (month == 1) {
                    month = 12
                    year -= 1
                } else {
                    month -= 1
                }
            },
            onNextMonth = {
                if (month == 12) {
                    month = 1
                    year += 1
                } else {
                    month += 1
                }
            }
        )

        CalendarGrid(year = year, month = month)
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun MonthNavigation(year: Int, month: Int, onPreviousMonth: () -> Unit, onNextMonth: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = onPreviousMonth,
            colors = ButtonDefaults.outlinedButtonColors(greenMain_light)
        ) {
            Text(text = "Previous", color = Color.White)
        }

        Text(
            text = "${YearMonth.of(year, month).month.getDisplayName(java.time.format.TextStyle.FULL, Locale.getDefault())} $year",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF31A062)
        )

        Button(
            onClick = onNextMonth,
            colors = ButtonDefaults.outlinedButtonColors(greenMain_light)
        ) {
            Text(text = "Next", color = Color.White)
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun CalendarGrid(year: Int, month: Int) {
    val daysOfWeek = listOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat")
    val daysInMonth = YearMonth.of(year, month).lengthOfMonth()
    val firstDayOfMonth = LocalDate.of(year, month, 1).dayOfWeek.value % 7
    val currentDate = LocalDate.now()

    Column {
        Row(modifier = Modifier.fillMaxWidth()) {
            daysOfWeek.forEach { day ->
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(vertical = 4.dp),  // Moved padding to the correct place
                    horizontalAlignment = Alignment.CenterHorizontally // Center align the text inside the column
                ) {
                    Spacer(modifier = Modifier.height(82.dp))
                    Text(
                        text = day,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                }
            }
        }
    }

    Spacer(modifier = Modifier.height(32.dp))

    Divider(
        color = Color.Gray, modifier = Modifier
            .width(1.dp) // Line width
            .fillMaxHeight()
    )

    Content(
        firstDayOfMonth = firstDayOfMonth,
        daysInMonth = daysInMonth,
        currentYear = currentDate.year,
        currentMonth = currentDate.monthValue,
        currentDay = currentDate.dayOfMonth
    )
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Content(firstDayOfMonth: Int, daysInMonth: Int, currentYear: Int, currentMonth: Int, currentDay: Int) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(7),
        modifier = Modifier.fillMaxHeight()
    ) {
        items(firstDayOfMonth) {
            Spacer(
                modifier = Modifier
                    .size(48.dp)
                    .padding(10.dp)
            )
        }

        items(daysInMonth) { day ->
            val isToday = currentYear == LocalDate.now().year &&
                    currentMonth == LocalDate.now().monthValue &&
                    day == currentDay

            Box(
                modifier = Modifier
                    .size(48.dp)
                    .padding(4.dp)
                    .background(if (isToday) Color(0xFF31A062) else Color.Transparent),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = day.toString(),
                    color = if (isToday) Color.White else Color.Black,
                    fontSize = 18.sp,
                    fontWeight = if (isToday) FontWeight.Bold else FontWeight.Normal,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

        @Composable
fun Divider(color: Color, modifier: Modifier) {
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color)
    )
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun PreviewPlansScreen() {
    PlansScreen(navController = rememberNavController())
}
