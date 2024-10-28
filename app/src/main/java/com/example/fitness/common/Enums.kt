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
enum class WorkoutCategoriesForMale(val workoutId: String,
                                    @DrawableRes val imageRes: Int,
                                    val workoutName: String){
   SQUAT(workoutId = "SQUAT-01", imageRes = R.drawable.squat_male, workoutName = "Squats"),
   PUSHUP(workoutId = "PUSHUP-02", imageRes = R.drawable.push_ups_male , workoutName = "Push-ups"),
   BENTKNEE(workoutId = "BK-03", imageRes = R.drawable.bk_male , workoutName = "Bent-knee Hip Raise"),
   BICEPSCURLS(workoutId = "BICEPS-04", imageRes = R.drawable.bicepcurls_male , workoutName = "Biceps Curls"),
    RUSSIAN(workoutId = "RUSSIAN-05", imageRes = R.drawable.russian_twists_male, workoutName = "Russian Twist"),
   LEGPRESS(workoutId = "LEGPRESS-06", imageRes = R.drawable.legpres_male, workoutName = "Leg press"),
   SITUPS(workoutId = "SITUPS-07", imageRes = R.drawable.situps_male, workoutName = "Sit ups"),
   SHOULDERPRESS(workoutId = "SHOULDERPRESS-08", imageRes = R.drawable.sp_male, workoutName = "Shoulder Press"),
   CALFRAISE(workoutId = "CALFRAISE-09", imageRes = R.drawable.calfraises_male, workoutName = "Calf Raise"),
   LEGHIP(workoutId = "LEGHIP-10", imageRes = R.drawable.leghip_male, workoutName = "Leg Hip"),
   FRONTLUNGE(workoutId = "FRONTLUNGE-11", imageRes = R.drawable.frontlunge_male, workoutName = "Front Lunge"),
   FRONTSQUAT(workoutId = "DUMBBELLSQUAT-12", imageRes = R.drawable.frontsquat_male, workoutName = "Dumbbell Squat"),
   TRICEPDIPS(workoutId = "TRIDIPS-13", imageRes = R.drawable.trydips, workoutName = "Triceps Dips"),
   BENCHPRESS(workoutId = "BENCHPRESS-14", imageRes = R.drawable.benchpress_male, workoutName = "Bench Press"),
   DEADLIFT(workoutId = "DEADLIFT-15", imageRes = R.drawable.deadlift_male, workoutName = "Dead Lift"),
   FORWARDBEND(workoutId = "FORWARDBEND-15", imageRes = R.drawable.forwardbend_male, workoutName = "Forward Bend"),
   ASSISTEDPUSH(workoutId = "ASSISTEDPUSHUP-16", imageRes = R.drawable.assistedpush_male, workoutName = "Assisted Push ups"),
   FACEPULL(workoutId =  "FACEPULL-17", imageRes = R.drawable.facepull_male, workoutName = "Face Pull"),
   BENTOVER(workoutId =  "BENTOVER-18", imageRes = R.drawable.bentoverows_male, workoutName = "Bent Over Rows"),
}

// Enum for Workout Female
enum class WorkoutCategoriesForFemale(val workoutId: String,
                                      @DrawableRes val imageRes: Int,
                                      val workoutName: String){
    SQUAT(workoutId = "SQUAT-01", imageRes = R.drawable.squat_female, workoutName = "Squats"),
    PUSHUP(workoutId = "PUSHUP-02", imageRes = R.drawable.pushups_female , workoutName = "Push-ups"),
    BK(workoutId = "CALFRAISE-03", imageRes = R.drawable.calfraise_female , workoutName = "Calf Raise"),
    LUNGES(workoutId = "LUNGES-04", imageRes = R.drawable.lunges_female , workoutName = "Lunges"),
    SITUPS(workoutId = "SITUPS-05", imageRes = R.drawable.situps_female , workoutName = "Sit Ups"),
    LEGRAISE(workoutId="LEGRAISE-06", imageRes = R.drawable.legraise_female, workoutName = "Leg Raise"),
    RUSSIAN(workoutId = "RUSSIAN-07", imageRes = R.drawable.russiantwist_female, workoutName = "Russian Twist"),
    FORWARDBENDSIT(workoutId = "FORWARDBENDSIT-08", imageRes = R.drawable.forwardbendsit_female, workoutName = "Forward Bend Sit"),
    DEADBUG(workoutId = "DEADBUG-09", imageRes = R.drawable.deadbug_female, workoutName = "Dead Bug Legs"),
    SIDEPLANK(workoutId = "SIDEPLANK-10", imageRes = R.drawable.sp_female, workoutName = "Side Plank"),
    DUMBBELLFLY(workoutId = "DUMBBELLFLY-11", imageRes = R.drawable.dumbbellfly_female, workoutName = "Dumbbell Fly"),
    DUMBBELLBP(workoutId = "DUMBBELLBP-12", imageRes = R.drawable.dumbbellbp_female, workoutName = "Dumbbell Chest"),
    DUMBBELLP(workoutId = "DUMBBELLP-13", imageRes = R.drawable.dumbbellp_female, workoutName = "Dumbbell Triceps"),
    LATERALRAISE(workoutId = "LATERALRAISE-14", imageRes = R.drawable.lateralraise_female, workoutName = "Lateral Raises"),
    FORWARDBENDSTANDING(workoutId = "FORWARDBENDSTANDING-15", imageRes = R.drawable.forwardbendstanding_female, workoutName = "Forward Bend Standing"),
}

// meals prep for Beginner
enum class MealsCategoriesBeginner(val mealsId: String,
                           @DrawableRes val imageRes: Int,
                           val mealsName: String,
                           val fats: String,
                           val protien: String,
                           val carbs: String,
                           val calories:  String){
    EGGWITHRICE(mealsId = "MEALSBEGINNER-01", imageRes = R.drawable.egg_with_rice, mealsName = "Egg with Rice", calories = "190", protien = "15", fats = "10", carbs = "40"),
    SINIGANG(mealsId = "MEALSBEGINNER-02", imageRes = R.drawable.sinigang, mealsName = "Sinigang na beef", calories = "170", protien = "26", fats = "15", carbs = "23"),
    ADOBO(mealsId = "MEALSBEGINNER-03", imageRes = R.drawable.adobo, mealsName = "Adobo with Rice", calories = "125", protien = "30", fats = "25", carbs = "55"),
    KAREKARE(mealsId = "MEALSBEGINNER-04", imageRes = R.drawable.kare_kare, mealsName = "Kare-Kare", calories = "123", protien = "35", fats = "15", carbs = "50"),
    CHICKENTOCINO(mealsId = "MEALSBEGINNER-05", imageRes = R.drawable.chikentocino, mealsName = "Chicken Tocino", calories = "145", protien = "15", fats = "  15", carbs = "50"),
    CHICKENTINOLA(mealsId = "MEALSBEGINNER-06", imageRes = R.drawable.chickentinola, mealsName = "Chicken Tinola", calories = "188", protien = "21", fats = "8", carbs = "7"),
    SINIGANGNAPORK(mealsId = "MEALSBEGINNER-07", imageRes = R.drawable.sinigangpork, mealsName = "Sinigang na pork", calories = "160", protien = "30", fats = "25", carbs = "55"),
    BISTEK(mealsId = "MEALSBEGINNER-08", imageRes = R.drawable.bistek_tagalog, mealsName = "Bistek Tagalog", calories = "160", protien = "35", fats = "15", carbs = "65"),
    LONGSILOG(mealsId = "MEALSBEGINNER-09", imageRes = R.drawable.longsilog, mealsName = "Longganisa Itlog", calories = "125", protien = "25", fats = "25", carbs = "55"),
    SCRAMBLEEGGS(mealsId = "MEALSBEGINNER-10", imageRes = R.drawable.scrambleeggs, mealsName = "Scramble Eggs", calories = "80", protien = "28", fats = "25", carbs = "40"),



}
// meals prep for Intermediate
enum class MealsCategoriesIntermediate(val mealsId: String,
                                   @DrawableRes val imageRes: Int,
                                   val mealsName: String,
                                   val fats: String,
                                   val protien: String,
                                   val carbs: String,
                                   val calories:  String){
    TUNAPANDESAL(mealsId = "MEALSINTERMEDIATE-01", imageRes = R.drawable.tuna_pandesal, mealsName = "Egg with Rice", calories = "59", protien = "15", fats = "10", carbs = "40"),
    SINIGANG(mealsId = "MEALSINTERMEDIATE-02", imageRes = R.drawable.grilled_tilapia, mealsName = "Sinigang na beef", calories = "189", protien = "26", fats = "15", carbs = "23"),
    ADOBO(mealsId = "MEALSINTERMEDIATE-03", imageRes = R.drawable.chicken_adobo, mealsName = "Adobo with Rice", calories = "170", protien = "30", fats = "25", carbs = "55"),
    CHICKENINSAL(mealsId = "MEALSINTERMEDIATE-04", imageRes = R.drawable.chicken_inasal, mealsName = "Chiken Inasal", calories = "125", protien = "35", fats = "15", carbs = "50"),
    CHICKENTOCINO(mealsId = "MEALSINTERMEDIATE-05", imageRes = R.drawable.chikentocino, mealsName = "Chicken Tocino", calories = "150", protien = "15", fats = "  15", carbs = "50"),
    CHICKENTINOLA(mealsId = "MEALSINTERMEDIATE-06", imageRes = R.drawable.chickentinola, mealsName = "Chicken Tinola", calories = "188", protien = "21", fats = "8", carbs = "7"),
    SINIGANGNAPORK(mealsId = "MEALSINTERMEDIATE-07", imageRes = R.drawable.sinigangpork, mealsName = "Sinigang na pork", calories = "140", protien = "30", fats = "25", carbs = "55"),
    BISTEK(mealsId = "MEALSINTERMEDIATE-08", imageRes = R.drawable.bistek_tagalog, mealsName = "Bistek Tagalog", calories = "125", protien = "30", fats = "25", carbs = "55"),
    CHICKENCALDS(mealsId = "MEALSINTERMEDIATE-09", imageRes = R.drawable.chicken_caldereta, mealsName = "Chicken Caldereta", calories = "113", protien = "30", fats = "25", carbs = "55"),
    BANGUSBELLY(mealsId = "MEALSINTERMEDIATE-10", imageRes = R.drawable.bangus_belly, mealsName = "Bangus Belly", calories = "150", protien = "23", fats = "0", carbs = "0"),


}
// meals prep for Advance
enum class MealsCategoriesAdvance(val mealsId: String,
                                   @DrawableRes val imageRes: Int,
                                   val mealsName: String,
                                   val fats: String,
                                   val protien: String,
                                   val carbs: String,
                                   val calories:  String){
    EGGWITHRICE(mealsId = "MEALSBEGINNER-01", imageRes = R.drawable.egg_with_rice, mealsName = "Egg with Rice", calories = "150", protien = "15", fats = "10", carbs = "40"),
    SINIGANG(mealsId = "MEALSBEGINNER-02", imageRes = R.drawable.sinigang, mealsName = "Sinigang na beef", calories = "185", protien = "26", fats = "15", carbs = "23"),
    ADOBO(mealsId = "MEALSBEGINNER-03", imageRes = R.drawable.adobo, mealsName = "Adobo with Rice", calories = "168", protien = "30", fats = "25", carbs = "55"),
    KAREKARE(mealsId = "MEALSBEGINNER-04", imageRes = R.drawable.kare_kare, mealsName = "Kare-Kare", calories = "183", protien = "35", fats = "15", carbs = "50"),
    CHICKENTOCINO(mealsId = "MEALSBEGINNER-05", imageRes = R.drawable.chikentocino, mealsName = "Chicken Tocino", calories = "145", protien = "15", fats = "  15", carbs = "50"),
    PORKMINUDO(mealsId = "MEALSBEGINNER-06", imageRes = R.drawable.pork_menudo, mealsName = "Pork Menudo", calories = "132", protien = "21", fats = "8", carbs = "7"),
    SINIGANGNAPORK(mealsId = "MEALSBEGINNER-07", imageRes = R.drawable.sinigangpork, mealsName = "Sinigang na pork", calories = "150", protien = "30", fats = "25", carbs = "55"),
    BISTEK(mealsId = "MEALSBEGINNER-08", imageRes = R.drawable.bistek_tagalog, mealsName = "Bistek Tagalog", calories = "150", protien = "30", fats = "25", carbs = "55"),
    LONGSILOG(mealsId = "MEALSBEGINNER-09", imageRes = R.drawable.longsilog, mealsName = "Longganisa Itlog", calories = "145", protien = "30", fats = "25", carbs = "55"),
    SCRAMBLEEGGS(mealsId = "MEALSBEGINNER-10", imageRes = R.drawable.scrambleeggs, mealsName = "Scramble Eggs", calories = "120", protien = "30", fats = "25", carbs = "55"),

}