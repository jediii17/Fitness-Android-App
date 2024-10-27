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
   BENTKNEE(workoutId = "BK-03", imageRes = R.drawable.gif_bk , workoutName = "Bent-knee Hip Raise"),
   BICEPSCURLS(workoutId = "BICEPS-04", imageRes = R.drawable.bicepcurls , workoutName = "Biceps Curls"),
   PLANKSHOULDER(workoutId = "PLANKS-05", imageRes = R.drawable.gif_bk , workoutName = "Plank Shoulder Tap"),
   LEGPRESS(workoutId = "LEGPRESS-06", imageRes = R.drawable.legpres, workoutName = "Leg press"),
   SITUPS(workoutId = "SITUPS-07", imageRes = R.drawable.situps, workoutName = "Sit ups"),
   SIDEPLANK(workoutId = "SIDEPLANK-08", imageRes = R.drawable.sideplank, workoutName = "Side Plank"),
   CALFRAISE(workoutId = "CALFRAISE-09", imageRes = R.drawable.calfraise, workoutName = "Calf Raise"),
   LEGHIP(workoutId = "LEGHIP-10", imageRes = R.drawable.leghip, workoutName = "Leg Hip"),
   FRONTLUNGE(workoutId = "FRONTLUNGE-11", imageRes = R.drawable.frontlunge, workoutName = "Front Lunge"),
   FRONTSQUAT(workoutId = "DUMBBELLSQUAT-12", imageRes = R.drawable.frontsquat, workoutName = "Dumbbell Squat"),
   TRICEPDIPS(workoutId = "TRIDIPS-13", imageRes = R.drawable.trydips, workoutName = "Triceps Dips"),
   BENCHPRESS(workoutId = "BENCHPRESS-14", imageRes = R.drawable.benchpress, workoutName = "Bench Press"),
   DEADLIFT(workoutId = "DEADLIFT-15", imageRes = R.drawable.deadlift, workoutName = "Dead Lift"),
   FORWARDBEND(workoutId = "FORWARDBEND-15", imageRes = R.drawable.forwardbend, workoutName = "Forward Bend"),
}

// Enum for Workout Female
enum class WorkoutCategoriesForFemale(val workoutId: String, @DrawableRes val imageRes: Int, val workoutName: String){
    SQUAT(workoutId = "SQUAT-01", imageRes = R.drawable.squat_male, workoutName = "Squats"),
    PUSHUP(workoutId = "PUSHUP-02", imageRes = R.drawable.push_ups_male , workoutName = "Push-ups"),
    BK(workoutId = "BK-03", imageRes = R.drawable.gif_bk , workoutName = "Bent-knee Hip Raise"),
    LUNGES(workoutId = "LUNGES-04", imageRes = R.drawable.lunges_female , workoutName = "Lunges"),
    PS(workoutId = "PLANKS-05", imageRes = R.drawable.gif_bk , workoutName = "Plank Shoulder Tap"),
}