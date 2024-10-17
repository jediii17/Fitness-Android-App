package com.example.fitness.ui.categories.workout

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.fitness.common.Constant
import com.example.fitness.ui.AppViewModelProvider
import com.example.fitness.ui.common.CommonHeader
import com.example.fitness.ui.common.PrimaryButton
import com.example.fitness.ui.theme.MyColorTheme
import com.example.fitness.ui.theme.green
import com.example.fitnesstracker.common.Screens
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun WorkoutWeekProgressScreen(navController: NavController) {

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
        //update the list from database content
        completedDaysList = updateCompletedIndexValues(completedDaysList, workWeek = workoutUiState.workoutWeekCount, workDay = workoutUiState.workoutDayCount)
    }

    WorkoutProgressContent(
        completedDaysList = completedDaysList,
    ){
        navController.navigate(Screens.WORKOUT_LIST_SCREEN.screenName + "/${workoutUiState.workoutWeekCount + 1}")
    }
}

private fun updateCompletedIndexValues(completedDaysList: SnapshotStateList<Int>, workWeek: Int, workDay: Int): SnapshotStateList<Int>{
    //update each index if there are new weeks
    //add less than week (<) to not affect the result of actual work week
    (0..<workWeek).forEach{ index ->
        completedDaysList[index] = 7 //add seven (7) since the workout for each was already over
    }
    completedDaysList[workWeek] = workDay

    return completedDaysList
}


@Composable
fun WorkoutProgressContent(completedDaysList: SnapshotStateList<Int>,
                           startButtonClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize().padding(18.dp)){
        Column(
            modifier = Modifier.align(Alignment.TopStart).matchParentSize()
        ) {
            Spacer(modifier = Modifier.height(32.dp))
            CommonHeader(
                text = "Workout",
                subText = "\"Striving for progress, not perfection. Every workout is a step closer to my best self.\"",
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(5.dp))
            LazyColumn(
                modifier = Modifier
            ) {
                itemsIndexed(completedDaysList) { index, completedDays ->
                    WeekSection(
                        weekNumber = index + 1,
                        completedDays = completedDays,
                        onDayCompleted = { day ->
                            //TODO Remove the clicking of the button for now and add it to startButton
                            // completedDaysList[index] = day
                        }
                    )
                }

            }
        }



        Column(modifier = Modifier.align(Alignment.BottomCenter)){
            StartButton() {
                startButtonClick()
            }
            Spacer(Modifier.height(20.dp))
        }

    }

}

@Composable
fun StartButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    PrimaryButton(
        modifier = modifier,
        text = "START",
    ){
        onClick()
    }
}

@Composable
fun WeekSection(weekNumber: Int, completedDays: Int, onDayCompleted: (Int) -> Unit) {
    Column(
        modifier = Modifier
            .padding(vertical = 12.dp, horizontal = 8.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Column(modifier = Modifier
            .border(1.dp, Color.Gray.copy(0.2f), RoundedCornerShape(10.dp))
            .clip(RoundedCornerShape(10.dp))
            .background(MyColorTheme.white)
            .padding(start = 10.dp, top = 10.dp, bottom = 16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Week $weekNumber",
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                modifier = Modifier.padding(bottom = 10.dp),
                color = green
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 5.dp)
            ) {
                (1..7).forEach { day ->
                    DayCircle(
                        day = day,
                        hasExtraLine = day > 1,
                        isCompleted = day <= completedDays,
                        isClickable = day == completedDays + 1 && completedDays < 7,
                        onDayClick = { onDayCompleted(day) }
                    )
                }
                Spacer(modifier = Modifier)
                if ((completedDays == 7)) {
                    AnimatedVisibility(
                        visible = true,
                        enter = scaleIn(
                            animationSpec = tween(durationMillis = 500)
                        ) + fadeIn(animationSpec = tween(durationMillis = 500)),
                        exit = scaleOut(
                            animationSpec = tween(durationMillis = 500)
                        ) + fadeOut(animationSpec = tween(durationMillis = 500))
                    ) {
                        TrophyOfExcellence()
                    }
                }
            }
        }
        }
    }

@Composable
fun DayCircle(day: Int,hasExtraLine: Boolean, isCompleted: Boolean, isClickable: Boolean, onDayClick: () -> Unit) {
    val transitionState = remember { MutableTransitionState(false).apply { targetState = isCompleted } }
    val transition = updateTransition(transitionState, label = "DayTransition")

    val scale by transition.animateFloat(
        label = "ScaleAnimation",
        transitionSpec = { tween(durationMillis = 500) }
    ) { state ->
        if (state) 1.5f else 0.8f
    }

    val rotation by transition.animateFloat(
        label = "RotationAnimation",
        transitionSpec = { tween(durationMillis = 300) }
    ) { state ->
        if (state) 360f else 0f
    }

    val backgroundColor = if (isCompleted) {
        Brush.linearGradient(
            colors = listOf(MyColorTheme.yellow, MyColorTheme.green)
        )
    } else {
        Brush.linearGradient(
            colors = listOf(Color(0xFFE0E0E0), Color(0xFFBDBDBD))
        )
    }
        if(hasExtraLine){
            Spacer(modifier = Modifier
                .height(2.dp)
                .width(5.dp)
                .background(MyColorTheme.gradientGray01))
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(35.dp)
                .clip(CircleShape)
                .background(brush = backgroundColor)
                .border(
                    2.dp,
                    if (isCompleted) MyColorTheme.gradientGray02 else Color.LightGray,
                    CircleShape
                )
                .graphicsLayer {
                    scaleX = scale
                    scaleY = scale
                    //rotationZ = rotation
                }
                .clickable(enabled = isClickable) {
                    if (isClickable) onDayClick()  //TODO disable click for now
                }
                .semantics {
                    contentDescription =
                        "Day $day ${if (isCompleted) "Completed" else "Incomplete"}"
                }
        ) {
            Text(
                text = "$day",
                fontSize = 15.sp,
                fontWeight = if (isCompleted) FontWeight.Black else FontWeight.Normal,
                color = if (isCompleted) Color.White else Color.DarkGray
            )
        }
}

@Composable
fun TrophyOfExcellence() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .padding(bottom = 5.dp)
            .semantics { contentDescription = "Trophy of Excellence" }
    ) {
        Text(text = "🏆", fontSize = 28.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun WeeksProgressPreview() {
    MaterialTheme {
        Surface {
            val initialWeeks = List(4) { 0 }
            val completedDaysList = remember { mutableStateListOf(*initialWeeks.toTypedArray()) }
            WorkoutProgressContent(completedDaysList,){}
        }
    }
}
