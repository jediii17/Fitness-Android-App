package com.example.fitness.ui.categories.workout.item

import android.os.Build
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import com.example.fitness.ui.AppViewModelProvider

/*
@Composable
fun WorkoutItemPreviewScreen(navController: NavController, workoutId: String = "workout1") {

    val workoutItemPreviewViewModel: WorkoutItemPreviewViewModel = viewModel(factory = AppViewModelProvider.Factory)
    val workoutItemUiState = workoutItemPreviewViewModel.uiState.collectAsState()

    val imageLoader = rememberImageLoader()

    LaunchedEffect(true) {
        workoutItemPreviewViewModel.getWorkoutItem(workoutId)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        TopBar(navController)

        WorkoutGif(
            gifResId = workoutItemUiState.value.workoutItemDto?.imageRes ?: 0,
            imageLoader = imageLoader
        )

        Spacer(modifier = Modifier.height(16.dp))

        ExerciseInfo(exerciseName = "Squat", sets = 12, reps = "Each Side x 6")

        Spacer(modifier = Modifier.height(16.dp))

        NavigationOptions()
    }
}

@Composable
fun TopBar(navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { navController.navigateUp() }) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
        }
    }
}

@Composable
fun WorkoutGif(gifResId: Int, imageLoader: ImageLoader) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .shadow(2.dp)
    ) {
        Image(
            painter = rememberAsyncImagePainter(
                model = gifResId,
                imageLoader = imageLoader
            ),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.FillHeight
        )
    }
}

@Composable
fun ExerciseInfo(exerciseName: String, sets: Int, reps: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = exerciseName,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )
        Text(
            text = reps,
            fontSize = 14.sp,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "×$sets",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
    }
}


@Composable
fun NavigationOptions(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 28.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Previous",
            color = Color.Red,
            fontSize = 16.sp
        )
        Text(
            text = "Skip",
            color = Color.Blue,
            fontSize = 16.sp
        )
    }
}

@Composable
private fun rememberImageLoader(): ImageLoader {
    val context = LocalContext.current
    return ImageLoader.Builder(context)
        .components {
            if (Build.VERSION.SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()
}

@Preview(showBackground = true)
@Composable
fun WorkoutItemScreenPreview() {
    WorkoutItemPreviewScreen(navController = rememberNavController(), workoutId = "workout1")
}
*/
