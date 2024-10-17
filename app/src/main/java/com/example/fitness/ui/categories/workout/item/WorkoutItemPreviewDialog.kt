package com.example.fitness.ui.categories.workout.item

import android.os.Build
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import androidx.navigation.NavController
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import com.example.fitness.R
import com.example.fitness.domain.dto.WorkoutItemDto
import com.example.fitness.ui.common.PrimaryButton

@Composable
fun WorkoutItemPreviewDialog(workoutItemDto: WorkoutItemDto, isLastWorkout: Boolean = false, onDoneClick: () -> Unit, onWorkoutFinishedClick: () -> Unit) {
    val imageLoader = rememberImageLoader()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        WorkoutGif(
            gifResId = workoutItemDto.imageRes,
            imageLoader = imageLoader
        )

        Spacer(modifier = Modifier.height(16.dp))

        ExerciseInfo(exerciseName = workoutItemDto.workoutName, sets = 1, reps = "x ${workoutItemDto.reps}")

        Spacer(modifier = Modifier.height(16.dp))

        NavigationOptions(isLastWorkout){
            if(isLastWorkout){
                onWorkoutFinishedClick()
            }else{
                onDoneClick()
            }
        }
    }
}

@Composable
private fun TopBar(navController: NavController) {
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
private fun WorkoutGif(gifResId: Int, imageLoader: ImageLoader) {
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
private fun ExerciseInfo(exerciseName: String, sets: Int, reps: String) {
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
private fun NavigationOptions(isLastWorkout: Boolean, modifier: Modifier = Modifier, onClick: () -> Unit) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 28.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        PrimaryButton(
            iconSuffix = if(isLastWorkout) { R.drawable.ic_flag  } else { R.drawable.ic_check },
            text = if(isLastWorkout) { "FINISH WORKOUT"  } else { "DONE" },
        ){
            onClick()
        }
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
private fun WorkoutItemScreenPreview() {
    //WorkoutItemPreviewScreen(navController = rememberNavController(), workoutId = "workout1")
}
