package com.example.fitness.ui.categories.workout

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.fitness.R
import com.example.fitness.common.Constant
import com.example.fitness.ui.AppViewModelProvider
import com.example.fitness.ui.common.CommonDayCircleProgress
import com.example.fitness.ui.common.CommonHeader
import com.example.fitness.ui.common.PrimaryButton
import com.example.fitness.ui.common.SharedViewModel
import com.example.fitness.ui.common.TrophyOfExcellence
import com.example.fitness.ui.common.updateCompletedIndexValues
import com.example.fitness.ui.theme.MyColorTheme
import com.example.fitness.ui.theme.green
import com.example.fitness.ui.theme.greenMain_light
import com.example.fitnesstracker.common.Screens
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun WorkoutWeekProgressScreen(navController: NavController, sharedViewModel: SharedViewModel) {

    val workoutWeekProgressViewModel: WorkoutWeekProgressViewModel = viewModel(factory = AppViewModelProvider.Factory)
    val workoutUiState by workoutWeekProgressViewModel.uiState.collectAsState()

    val initialWeeks = List(Constant.MAX_WEEK_COUNT) { 0 }
    var completedDaysList = remember {  mutableStateListOf(*initialWeeks.toTypedArray()) }

    LaunchedEffect(Unit) {
        CoroutineScope(Dispatchers.IO).launch{
            workoutWeekProgressViewModel.getWorkoutWeekProgress()
        }
        completedDaysList = updateCompletedIndexValues(completedDaysList, workWeek = workoutUiState.workoutWeekCount, workDay = workoutUiState.workoutDayCount)
    }

    //if this value changes change the progress
    LaunchedEffect(workoutUiState) {
        
        completedDaysList = updateCompletedIndexValues(completedDaysList, workWeek = workoutUiState.workoutWeekCount, workDay = workoutUiState.workoutDayCount)
    }
    WorkoutProgressContent(
        completedDaysList = completedDaysList,
    ){
        navController.navigate(Screens.WORKOUT_LIST_SCREEN.screenName + "/${workoutUiState.workoutWeekCount + 1}")
    }
}

@Composable
fun WorkoutProgressContent(
    completedDaysList: SnapshotStateList<Int>,
    startButtonClick: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize().padding(18.dp)) {

        Column(modifier = Modifier.align(Alignment.TopStart)) {
            CommonHeader(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
                text = "Workout",
                subText = "Stay motivated on your workout journey.",
                fontSize = 16.sp
            )
            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                itemsIndexed(completedDaysList) { index, completedDays ->
                    WeekSection(
                        weekNumber = index + 1,
                        completedDays = completedDays,
                        onDayCompleted = { day -> }
                    )
                }

                item {
                    Spacer(modifier = Modifier.height(80.dp))
                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .align(Alignment.BottomCenter)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            StartButton(onClick = startButtonClick)
            Spacer(Modifier.height(20.dp))
        }
    }
}


@Composable
fun StartButton(onClick: () -> Unit) {
    PrimaryButton(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp)
            .height(56.dp),
        text = "START",
        backgroundColor = green,
        onClick = onClick
    )
}

@Composable
fun WeekSection(weekNumber: Int, completedDays: Int, onDayCompleted: (Int) -> Unit) {
    val weekImages = listOf(
        R.drawable.week1, // Image for Week 1
        R.drawable.week3, // Image for Week 2
        R.drawable.week2, // Image for Week 3
        R.drawable.week4  // Image for Week 4
    )

    Column(modifier = Modifier.padding(vertical = 12.dp)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Color.Gray, RoundedCornerShape(12.dp))
        ) {
            Column {

                Text(
                    text = if (completedDays == 7) "Week $weekNumber: 🏆" else "Week $weekNumber",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(6.dp),
                    color = greenMain_light,
                )

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    (1..7).forEach { day ->
                        CommonDayCircleProgress(
                            day = day,
                            hasExtraLine = day > 1,
                            isCompleted = day <= completedDays,
                            isClickable = day == completedDays + 1 && completedDays < 7,
                            onDayClick = { onDayCompleted(day) }
                        )
                    }
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Workout highlights *",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(8.dp),
                    color = greenMain_light
                )
                Spacer(modifier = Modifier.height(1.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(320.dp)
                ) {
                    Image(
                        painter = painterResource(id = weekImages[weekNumber - 1]),
                        contentDescription = "Week $weekNumber Image",
                        modifier = Modifier
                            .matchParentSize()
                            .clip(RoundedCornerShape(topEnd = 0.dp, topStart = 0.dp,bottomStart = 12.dp, bottomEnd = 12.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun WeeksProgressPreview() {
    MaterialTheme {
        Surface {
            val initialWeeks = List(4) { 0 }
            val completedDaysList = remember { mutableStateListOf(*initialWeeks.toTypedArray()) }
            WorkoutProgressContent(completedDaysList) {}
        }
    }
}