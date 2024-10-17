package com.example.fitness.common

import androidx.annotation.DrawableRes
import com.example.fitness.R

enum class BodyType {
    BEGINNER,
    INTERMEDIATE,
    ADVANCE,
}

enum class Gender {
    DEFAULT,
    MALE,
    FEMALE
}

enum class BodyFatLevel {
    LEAN,
    ATHLETIC,
    NATURAL,
}

//For Workout Reps Count
enum class WorkoutReps(val reps: Int, val durationInSeconds: Int){
    BEGINNER(reps = 8, durationInSeconds = 15),
    INTERMEDIATE(reps = 10, durationInSeconds = 30),
    ADVANCE(reps = 12, durationInSeconds = 60),
}

//Enum for Workout Male
enum class WorkoutCategoriesForMale(val workoutId: String, @DrawableRes val imageRes: Int, val workoutName: String){
   SQUAT(workoutId = "SQUAT-01", imageRes = R.drawable.squat_male, workoutName = "Squats"),
   PUSHUP(workoutId = "PUSHUP-02", imageRes = R.drawable.push_ups_male , workoutName = "Push-ups"),
   BK(workoutId = "BK-03", imageRes = R.drawable.gif_bk , workoutName = "Bent-knee Hip Raise"),
   LUNGES(workoutId = "LUNGES-04", imageRes = R.drawable.lunges_female , workoutName = "Lunges"),
   PS(workoutId = "PLANKS-05", imageRes = R.drawable.gif_bk , workoutName = "Plank Shoulder Tap"),
}

// Enum for Workout Female
enum class WorkoutCategoriesForFemale(val workoutId: String, @DrawableRes val imageRes: Int, val workoutName: String){
    SQUAT(workoutId = "SQUAT-01", imageRes = R.drawable.squat_male, workoutName = "Squats"),
    PUSHUP(workoutId = "PUSHUP-02", imageRes = R.drawable.push_ups_male , workoutName = "Push-ups"),
    BK(workoutId = "BK-03", imageRes = R.drawable.gif_bk , workoutName = "Bent-knee Hip Raise"),
    LUNGES(workoutId = "LUNGES-04", imageRes = R.drawable.lunges_female , workoutName = "Lunges"),
    PS(workoutId = "PLANKS-05", imageRes = R.drawable.gif_bk , workoutName = "Plank Shoulder Tap"),
}