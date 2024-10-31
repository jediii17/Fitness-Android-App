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

enum class MealTime{
    BREAKFAST,
    LUNCH,
    DINNER
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


/********************************************************
 *  meals prep for [BodyFatLevel.LEAN]
 ********************************************************
 *  **/
enum class MealsCategoriesForLean(val mealsId: String,
                                  @DrawableRes val imageRes: Int,
                                  val mealsName: String,
                                  val mealsDescription: String,
                                  val mealTime: String,
                                  val fats: String,
                                  val protein: String,
                                  val carbs: String,
                                  val calories:  String){
    // for breakfast (15)
    EGGWITHRICE(mealsId = "MEALSBEGINNER-01", imageRes = R.drawable.egg_with_rice, mealsName = "Egg with Rice", mealsDescription ="Ingredients\n" +
            "Rice:\n" +
            "\n" +
            "1 cup of rice (white or brown)\n" +
            "2 cups of water (or broth for added flavor)\n" +
            "Salt (to taste)\n" +
            "Eggs:\n" +
            "\n" +
            "2-4 eggs (depending on servings)\n" +
            "Seasonings:\n" +
            "\n" +
            "Soy sauce (to taste)\n" +
            "Pepper (to taste)\n" +
            "Optional: garlic or onion powder\n" +
            "Vegetables (optional):\n" +
            "\n" +
            "Green onions (for garnish)\n" +
            "Peas, carrots, or bell peppers (chopped, for added nutrition)\n" +
            "Oil:\n" +
            "\n" +
            "1-2 tablespoons of cooking oil (like vegetable or sesame oil)\n" +
            "Instructions\n" +
            "Cook the Rice: Rinse the rice under cold water, then cook it according to package instructions.\n" +
            "\n" +
            "Prepare the Eggs: In a skillet, heat the oil over medium heat. Crack the eggs into the skillet and scramble them until cooked through.\n" +
            "\n" +
            "Combine: Once the rice is cooked, add it to the skillet with the scrambled eggs. Mix well and season with soy sauce, pepper, and any optional ingredients.\n" +
            "\n" +
            "Serve: Garnish with chopped green onions or any other desired toppings.", mealTime = MealTime.BREAKFAST.name, calories = "190", protein = "15", fats = "10", carbs = "40"),
    SINIGANG(mealsId = "MEALSBEGINNER-02", imageRes = R.drawable.sinigang, mealsName = "Sinigang na beef",mealsDescription ="Ingredients\n" +
            "Beef:\n" +
            "\n" +
            "1.5 to 2 pounds of beef (brisket or shank, cut into cubes)\n" +
            "Vegetables:\n" +
            "\n" +
            "1 medium onion (quartered)\n" +
            "2-3 tomatoes (quartered)\n" +
            "1 radish (labanos, sliced)\n" +
            "1-2 cups of water spinach (kangkong)\n" +
            "1-2 green chili peppers (siling haba)\n" +
            "1 cup of eggplant (sliced)\n" +
            "Optional: 1 cup of string beans (sitaw)\n" +
            "Souring Agent:\n" +
            "\n" +
            "1 packet of sinigang mix (or use fresh tamarind, about 1 cup)\n" +
            "Seasonings:\n" +
            "\n" +
            "Salt (to taste)\n" +
            "Fish sauce (patis, to taste)\n" +
            "Water:\n" +
            "\n" +
            "About 6-8 cups (for the broth)\n" +
            "Optional Garnish\n" +
            "Fresh cilantro or scallions\n" +
            "Instructions\n" +
            "Prepare the Broth: In a large pot, add the beef and enough water to cover. Bring to a boil, then simmer until the meat is tender (about 1.5 to 2 hours).\n" +
            "\n" +
            "Add Vegetables: Add the onions, tomatoes, and radish to the pot. Cook for about 10-15 minutes.\n" +
            "\n" +
            "Add Eggplant and Green Beans: Add the eggplant and string beans, if using. Cook for another 5-10 minutes.\n" +
            "\n" +
            "Sour It Up: Stir in the sinigang mix (or fresh tamarind juice) and the green chili peppers. Adjust seasoning with salt and fish sauce.\n" +
            "\n" +
            "Finish with Kangkong: Add the water spinach and let it cook for a few more minutes until wilted.\n" +
            "\n" +
            "Serve: Enjoy hot with rice!", mealTime = MealTime.BREAKFAST.name, calories = "170", protein = "26", fats = "15", carbs = "23"),
    ADOBO(mealsId = "MEALSBEGINNER-03", imageRes = R.drawable.adobo, mealsName = "Adobo with Rice",mealsDescription ="Ingredients\n" +
            "Rice:\n" +
            "\n" +
            "2 cups of rice (jasmine or long-grain)\n" +
            "4 cups of water or chicken broth\n" +
            "Adobo Chicken or Pork (you can use leftover adobo):\n" +
            "\n" +
            "1 pound of chicken thighs or pork (cut into pieces)\n" +
            "1/2 cup soy sauce\n" +
            "1/2 cup vinegar (white or cane vinegar)\n" +
            "4-5 cloves of garlic (minced)\n" +
            "1-2 bay leaves\n" +
            "1 tablespoon of black peppercorns (optional)\n" +
            "Salt (to taste)\n" +
            "1 tablespoon of cooking oil\n" +
            "Vegetables (optional):\n" +
            "\n" +
            "1 small onion (chopped)\n" +
            "1-2 green onions (for garnish)\n" +
            "Instructions\n" +
            "Cook the Adobo:\n" +
            "\n" +
            "In a pot, heat the oil over medium heat. Sauté the onion and garlic until fragrant.\n" +
            "Add the meat and brown it slightly.\n" +
            "Pour in the soy sauce, vinegar, bay leaves, and peppercorns. Bring to a boil, then reduce heat and simmer for about 30 minutes until the meat is tender. Adjust seasoning as needed.\n" +
            "Cook the Rice:\n" +
            "\n" +
            "Rinse the rice under cold water. In a rice cooker or pot, combine the rice and water or broth. Cook according to your rice cooker instructions or simmer on the stovetop until the rice is tender and the liquid is absorbed.\n" +
            "Combine:\n" +
            "\n" +
            "Once the adobo is cooked, shred the meat (if desired) and stir it into the cooked rice. Mix thoroughly, allowing the rice to absorb the adobo flavors.\n" +
            "Serve:\n" +
            "\n" +
            "Garnish with chopped green onions. Serve hot as a main dish or side.", mealTime = MealTime.BREAKFAST.name, calories = "125", protein = "30", fats = "25", carbs = "55"),
    KAREKARE(mealsId = "MEALSBEGINNER-04", imageRes = R.drawable.kare_kare, mealsName = "Kare-Kare",mealsDescription ="Ingredients\n" +
            "Meat:\n" +
            "\n" +
            "2 pounds of oxtail (or beef shank)\n" +
            "1-2 tablespoons of cooking oil\n" +
            "Vegetables:\n" +
            "\n" +
            "1 large eggplant (sliced)\n" +
            "1-2 cups of banana heart (puso ng saging, optional)\n" +
            "1-2 cups of string beans (sitaw)\n" +
            "1-2 cups of bok choy or water spinach (kangkong)\n" +
            "Sauce:\n" +
            "\n" +
            "1 cup of peanut butter\n" +
            "4 cups of beef broth (or water)\n" +
            "1 onion (chopped)\n" +
            "2-3 cloves of garlic (minced)\n" +
            "1 tablespoon of shrimp paste (bagoong, for serving)\n" +
            "Instructions\n" +
            "Cook the Oxtail:\n" +
            "\n" +
            "In a large pot, heat oil over medium heat. Sauté the onion and garlic until fragrant.\n" +
            "Add the oxtail and brown on all sides. Pour in the beef broth and bring to a boil. Simmer until tender (about 2-3 hours).\n" +
            "Prepare the Sauce:\n" +
            "\n" +
            "Once the meat is tender, stir in the peanut butter until well combined. Adjust the thickness with more broth or water if necessary. Simmer for another 10-15 minutes.\n" +
            "Add Vegetables:\n" +
            "\n" +
            "Add the eggplant, banana heart, and string beans. Cook until the vegetables are tender. Finally, add bok choy or kangkong and cook briefly.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with shrimp paste on the side and steamed rice.", mealTime = MealTime.BREAKFAST.name, calories = "123", protein = "35", fats = "15", carbs = "50"),
    CHICKENTOCINO(mealsId = "MEALSBEGINNER-05", imageRes = R.drawable.chikentocino, mealsName = "Chicken Tocino",mealsDescription ="Ingredients\n" +
            "Chicken:\n" +
            "\n" +
            "1 pound of chicken thighs or breasts (sliced into thin pieces)\n" +
            "Marinade:\n" +
            "\n" +
            "1/2 cup of soy sauce\n" +
            "1/4 cup of brown sugar (or honey)\n" +
            "1/4 cup of pineapple juice (optional, for added sweetness and flavor)\n" +
            "1-2 cloves of garlic (minced)\n" +
            "1 teaspoon of black pepper\n" +
            "A pinch of salt (to taste)\n" +
            "Cooking:\n" +
            "\n" +
            "2 tablespoons of cooking oil (for frying)\n" +
            "Instructions\n" +
            "Marinate the Chicken:\n" +
            "\n" +
            "In a bowl, combine soy sauce, brown sugar, pineapple juice, minced garlic, black pepper, and salt. Mix well.\n" +
            "Add the chicken pieces, making sure they are well coated. Cover and marinate for at least 1 hour, or preferably overnight in the refrigerator.\n" +
            "Cook the Chicken:\n" +
            "\n" +
            "Heat the oil in a pan over medium heat.\n" +
            "Add the marinated chicken (discard any excess marinade) and cook until browned and cooked through, about 10-15 minutes. Stir occasionally to ensure even cooking.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with garlic rice and a side of fried eggs for a classic breakfast.", mealTime = MealTime.BREAKFAST.name, calories = "145", protein = "15", fats = "  15", carbs = "50"),
    CHICKENTINOLA(mealsId = "MEALSBEGINNER-06", imageRes = R.drawable.chickentinola, mealsName = "Chicken Tinola",mealsDescription ="Ingredients\n" +
            "Chicken:\n" +
            "\n" +
            "1.5 to 2 pounds of chicken (cut into pieces, preferably bone-in for flavor)\n" +
            "Vegetables:\n" +
            "\n" +
            "1 medium green papaya (peeled, seeds removed, and sliced)\n" +
            "1-2 cups of spinach or moringa leaves (malunggay)\n" +
            "1 medium onion (sliced)\n" +
            "2-3 cloves of garlic (minced)\n" +
            "1-2 inches of ginger (sliced)\n" +
            "Seasonings:\n" +
            "\n" +
            "6-8 cups of water or chicken broth\n" +
            "Salt and pepper (to taste)\n" +
            "Optional: fish sauce (patis) for added flavor\n" +
            "Instructions\n" +
            "Sauté Aromatics:\n" +
            "\n" +
            "In a large pot, heat a bit of oil over medium heat. Sauté the onion, garlic, and ginger until fragrant.\n" +
            "Cook the Chicken:\n" +
            "\n" +
            "Add the chicken pieces to the pot and cook until lightly browned. Season with salt and pepper, and add fish sauce if using.\n" +
            "Add Liquid:\n" +
            "\n" +
            "Pour in the water or chicken broth. Bring to a boil, then reduce the heat and simmer for about 20-25 minutes, or until the chicken is cooked through.\n" +
            "Add Papaya:\n" +
            "\n" +
            "Add the sliced green papaya and cook until tender, about 10 minutes.\n" +
            "Finish with Greens:\n" +
            "\n" +
            "Stir in the spinach or moringa leaves and cook for another minute until wilted.\n" +
            "Serve:\n" +
            "\n" +
            "Adjust seasoning to taste. Serve hot with steamed rice.", mealTime = MealTime.BREAKFAST.name, calories = "188", protein = "21", fats = "8", carbs = "7"),
    SINIGANGNAPORK(mealsId = "MEALSBEGINNER-07", imageRes = R.drawable.sinigangpork, mealsName = "Sinigang na pork",mealsDescription ="Ingredients\n" +
            "Pork:\n" +
            "\n" +
            "1.5 to 2 pounds of pork (belly, ribs, or shoulder, cut into chunks)\n" +
            "Vegetables:\n" +
            "\n" +
            "1 medium onion (quartered)\n" +
            "2-3 tomatoes (quartered)\n" +
            "1 radish (labanos, sliced)\n" +
            "1-2 cups of eggplant (sliced)\n" +
            "1-2 cups of string beans (sitaw)\n" +
            "1-2 green chili peppers (siling haba)\n" +
            "1-2 cups of water spinach (kangkong) or bok choy\n" +
            "Souring Agent:\n" +
            "\n" +
            "1 packet of sinigang mix (or about 1 cup of fresh tamarind, cooked and mashed)\n" +
            "Seasonings:\n" +
            "\n" +
            "Salt (to taste)\n" +
            "Fish sauce (patis, to taste)\n" +
            "Water:\n" +
            "\n" +
            "About 6-8 cups (for the broth)\n" +
            "Instructions\n" +
            "Prepare the Broth:\n" +
            "\n" +
            "In a large pot, add the pork and enough water to cover. Bring to a boil, then simmer until the meat is tender (about 1.5 to 2 hours).\n" +
            "Add Vegetables:\n" +
            "\n" +
            "Once the pork is tender, add the onions, tomatoes, and radish. Cook for about 10-15 minutes.\n" +
            "Sour It Up:\n" +
            "\n" +
            "Stir in the sinigang mix (or fresh tamarind juice) and add the green chili peppers. Adjust seasoning with salt and fish sauce.\n" +
            "Finish with Greens:\n" +
            "\n" +
            "Add the eggplant, string beans, and kangkong. Cook for a few more minutes until the vegetables are tender.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with steamed rice.", mealTime = MealTime.BREAKFAST.name, calories = "160", protein = "30", fats = "25", carbs = "55"),
    BISTEK(mealsId = "MEALSBEGINNER-08", imageRes = R.drawable.bistek_tagalog, mealsName = "Bistek Tagalog",mealsDescription ="Ingredients\n" +
            "Beef:\n" +
            "\n" +
            "1 to 1.5 pounds of beef sirloin or flank steak (sliced thinly against the grain)\n" +
            "Marinade:\n" +
            "\n" +
            "1/4 cup of soy sauce\n" +
            "1/4 cup of calamansi juice (or lemon/lime juice)\n" +
            "3-4 cloves of garlic (minced)\n" +
            "1 tablespoon of black pepper\n" +
            "Onions:\n" +
            "\n" +
            "1-2 large onions (sliced into rings)\n" +
            "Cooking:\n" +
            "\n" +
            "2-3 tablespoons of cooking oil\n" +
            "Salt (to taste)\n" +
            "Instructions\n" +
            "Marinate the Beef:\n" +
            "\n" +
            "In a bowl, combine the soy sauce, calamansi juice, minced garlic, and black pepper. Add the sliced beef and marinate for at least 30 minutes, or preferably a few hours in the refrigerator.\n" +
            "Sauté the Onions:\n" +
            "\n" +
            "Heat 1 tablespoon of oil in a pan over medium heat. Add the onion rings and sauté until they become soft and translucent. Remove and set aside.\n" +
            "Cook the Beef:\n" +
            "\n" +
            "In the same pan, add more oil if needed. Remove the beef from the marinade (reserve the marinade) and cook in the hot pan until browned and cooked through, about 3-5 minutes per side. You may need to do this in batches.\n" +
            "Add Marinade:\n" +
            "\n" +
            "Pour the reserved marinade over the cooked beef and let it simmer for a few minutes until slightly thickened.\n" +
            "Combine:\n" +
            "\n" +
            "Return the sautéed onions to the pan and mix well.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with steamed rice.", mealTime = MealTime.BREAKFAST.name, calories = "160", protein = "35", fats = "15", carbs = "65"),
    LONGSILOG(mealsId = "MEALSBEGINNER-09", imageRes = R.drawable.longsilog, mealsName = "Longganisa Itlog",mealsDescription ="Ingredients\n" +
            "Longganisa:\n" +
            "\n" +
            "1 pound of longganisa (Filipino sausage, sweet or savory)\n" +
            "Optional: a little water (for steaming)\n" +
            "Eggs:\n" +
            "\n" +
            "2-4 eggs (depending on servings)\n" +
            "Cooking Oil:\n" +
            "\n" +
            "1-2 tablespoons of cooking oil\n" +
            "Optional Sides:\n" +
            "\n" +
            "Garlic rice\n" +
            "Sliced tomatoes or cucumber\n" +
            "Instructions\n" +
            "Cook the Longganisa:\n" +
            "\n" +
            "In a skillet, place the longganisa and add a little water (just enough to cover the bottom of the pan). Cook over medium heat, covered, until the water evaporates and the sausages start to brown, about 10-15 minutes.\n" +
            "Sauté the Longganisa:\n" +
            "\n" +
            "Once the water is gone, add the oil to the pan. Fry the longganisa until nicely browned and cooked through, turning occasionally.\n" +
            "Cook the Eggs:\n" +
            "\n" +
            "In a separate pan, heat a little oil over medium heat. Crack the eggs into the pan and cook to your desired doneness (sunny-side up, scrambled, etc.).\n" +
            "Serve:\n" +
            "\n" +
            "Plate the cooked longganisa with the eggs. Serve with garlic rice and optional sides like sliced tomatoes or cucumber.", mealTime = MealTime.BREAKFAST.name, calories = "125", protein = "25", fats = "25", carbs = "55"),
    SCRAMBLEEGGS(mealsId = "MEALSBEGINNER-10", imageRes = R.drawable.scrambleeggs, mealsName = "Scramble Eggs",mealsDescription ="Ingredients\n" +
            "4 large eggs\n" +
            "1-2 tablespoons of milk or cream (optional, for creaminess)\n" +
            "Salt (to taste)\n" +
            "Pepper (to taste)\n" +
            "1 tablespoon of butter or oil\n" +
            "Instructions\n" +
            "Prepare the Eggs:\n" +
            "\n" +
            "In a bowl, crack the eggs and add milk or cream (if using). Season with salt and pepper. Whisk until well combined and slightly frothy.\n" +
            "Heat the Pan:\n" +
            "\n" +
            "In a non-stick skillet, melt the butter or heat the oil over medium-low heat.\n" +
            "Cook the Eggs:\n" +
            "\n" +
            "Pour the egg mixture into the pan. Let it sit for a few seconds until it starts to set at the edges.\n" +
            "Scramble:\n" +
            "\n" +
            "Using a spatula, gently push the eggs from the edges toward the center. Repeat this process, folding the eggs until they’re mostly cooked but still slightly soft and creamy.\n" +
            "Finish:\n" +
            "\n" +
            "Remove the pan from the heat when the eggs are just set (they will continue to cook from residual heat). Adjust seasoning if needed.\n" +
            "Serve:\n" +
            "\n" +
            "Serve immediately, either plain or with your favorite toppings like cheese, herbs, or diced vegetables.", mealTime = MealTime.BREAKFAST.name, calories = "80", protein = "28", fats = "25", carbs = "40"),
    // for lunch (15)


    // for dinner(15)


}

/********************************************************
 *  meals prep for [BodyFatLevel.ATHLETIC]
 ********************************************************
 *  **/
enum class MealsCategoriesForAthletic(val mealsId: String,
                                      @DrawableRes val imageRes: Int,
                                      val mealsName: String,
                                      val mealsDescription: String,
                                      val mealTime: String,
                                      val fats: String,
                                      val protein: String,
                                      val carbs: String,
                                      val calories:  String){
    // for breakfast (15)
    TUNAPANDESAL(mealsId = "MEALSINTERMEDIATE-01", imageRes = R.drawable.tuna_pandesal, mealsName = "Tuna Pandesal",mealsDescription ="Ingredients\n" +
            "For the Pandesal:\n" +
            "4 cups all-purpose flour\n" +
            "1/4 cup sugar\n" +
            "1 tablespoon salt\n" +
            "2 teaspoons instant yeast\n" +
            "1 cup warm milk (about 110°F or 43°C)\n" +
            "1/4 cup vegetable oil\n" +
            "1 large egg\n" +
            "Breadcrumbs (for coating)\n" +
            "For the Tuna Filling:\n" +
            "1 can (around 5 oz) tuna in oil or water (drained)\n" +
            "1/4 cup mayonnaise\n" +
            "1 small onion (finely chopped)\n" +
            "1-2 tablespoons of sweet pickle relish (optional)\n" +
            "Salt and pepper (to taste)\n" +
            "Instructions\n" +
            "Make the Pandesal:\n" +
            "Mix Dry Ingredients:\n" +
            "\n" +
            "In a large bowl, combine flour, sugar, salt, and instant yeast.\n" +
            "Add Wet Ingredients:\n" +
            "\n" +
            "In another bowl, mix warm milk, vegetable oil, and egg. Pour into the dry ingredients and mix until a dough forms.\n" +
            "Knead:\n" +
            "\n" +
            "Knead the dough on a floured surface for about 10 minutes until smooth and elastic.\n" +
            "First Rise:\n" +
            "\n" +
            "Place the dough in a greased bowl, cover with a damp cloth, and let it rise in a warm place for about 1-2 hours, or until doubled in size.\n" +
            "Shape the Rolls:\n" +
            "\n" +
            "Punch down the dough and divide it into small pieces (about 1.5 inches in diameter). Shape each piece into a ball and roll in breadcrumbs. Place on a baking sheet lined with parchment paper.\n" +
            "Second Rise:\n" +
            "\n" +
            "Cover the shaped rolls with a cloth and let them rise again for about 30-45 minutes.\n" +
            "Bake:\n" +
            "\n" +
            "Preheat the oven to 375°F (190°C). Bake the rolls for about 15-20 minutes, or until golden brown.\n" +
            "Prepare the Tuna Filling:\n" +
            "Mix Ingredients:\n" +
            "\n" +
            "In a bowl, combine drained tuna, mayonnaise, chopped onion, and sweet pickle relish (if using). Season with salt and pepper to taste.\n" +
            "Assemble:\n" +
            "\n" +
            "Once the pandesal has cooled slightly, cut them in half and fill with the tuna mixture.\n" +
            "Serve:\n" +
            "\n" +
            "Enjoy your Tuna Pandesal warm or at room temperature!", mealTime = MealTime.BREAKFAST.name, calories = "59", protein = "15", fats = "10", carbs = "40"),
    SINIGANG(mealsId = "MEALSINTERMEDIATE-02", imageRes = R.drawable.grilled_tilapia, mealsName = "Sinigang na beef",mealsDescription ="Ingredients\n" +
            "Beef:\n" +
            "\n" +
            "1.5 to 2 pounds of beef (brisket, shank, or short ribs, cut into chunks)\n" +
            "Vegetables:\n" +
            "\n" +
            "1 medium onion (quartered)\n" +
            "2-3 tomatoes (quartered)\n" +
            "1 radish (labanos, sliced)\n" +
            "1-2 cups of eggplant (sliced)\n" +
            "1-2 cups of string beans (sitaw)\n" +
            "1-2 green chili peppers (siling haba)\n" +
            "1-2 cups of water spinach (kangkong) or bok choy\n" +
            "Souring Agent:\n" +
            "\n" +
            "1 packet of sinigang mix (or about 1 cup of fresh tamarind, cooked and mashed)\n" +
            "Seasonings:\n" +
            "\n" +
            "Salt (to taste)\n" +
            "Fish sauce (patis, to taste)\n" +
            "Water:\n" +
            "\n" +
            "About 6-8 cups (for the broth)\n" +
            "Instructions\n" +
            "Prepare the Broth:\n" +
            "\n" +
            "In a large pot, add the beef and enough water to cover. Bring to a boil, then reduce to a simmer. Skim off any scum that forms on the surface. Simmer until the meat is tender (about 1.5 to 2 hours).\n" +
            "Add Aromatics:\n" +
            "\n" +
            "Once the beef is tender, add the onions and tomatoes. Cook for about 10-15 minutes.\n" +
            "Add Vegetables:\n" +
            "\n" +
            "Add the radish and cook for another 5-10 minutes until slightly tender.\n" +
            "Sour It Up:\n" +
            "\n" +
            "Stir in the sinigang mix (or fresh tamarind juice) and add the green chili peppers. Adjust seasoning with salt and fish sauce.\n" +
            "Finish with Greens:\n" +
            "\n" +
            "Add the eggplant, string beans, and kangkong. Cook for a few more minutes until the vegetables are tender.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with steamed rice.", mealTime = MealTime.BREAKFAST.name, calories = "189", protein = "26", fats = "15", carbs = "23"),
    ADOBO(mealsId = "MEALSINTERMEDIATE-03", imageRes = R.drawable.chicken_adobo, mealsName = "Adobo with Rice",mealsDescription ="Ingredients\n" +
            "For the Adobo:\n" +
            "1.5 pounds of chicken, pork, or a mix (cut into pieces)\n" +
            "1/2 cup soy sauce\n" +
            "1/4 cup vinegar (white or cane vinegar)\n" +
            "1 onion (sliced)\n" +
            "4-5 cloves of garlic (minced)\n" +
            "2-3 bay leaves\n" +
            "1 tablespoon of black peppercorns (optional)\n" +
            "1-2 tablespoons of cooking oil\n" +
            "Salt and pepper (to taste)\n" +
            "For the Rice:\n" +
            "2 cups of rice (jasmine or long-grain)\n" +
            "4 cups of water (or broth for added flavor)\n" +
            "Salt (to taste)\n" +
            "Instructions\n" +
            "Make the Adobo:\n" +
            "Marinate the Meat:\n" +
            "\n" +
            "In a bowl, combine soy sauce, vinegar, onion, garlic, bay leaves, and peppercorns. Add the meat and marinate for at least 30 minutes (or overnight in the fridge for more flavor).\n" +
            "Cook the Meat:\n" +
            "\n" +
            "In a pot, heat the oil over medium heat. Add the marinated meat (reserve the marinade) and sauté until browned.\n" +
            "Simmer:\n" +
            "\n" +
            "Pour in the reserved marinade and add enough water to cover the meat. Bring to a boil, then reduce to a simmer. Cook for about 30-45 minutes, or until the meat is tender. Adjust seasoning with salt and pepper if needed.\n" +
            "Cook the Rice:\n" +
            "Prepare the Rice:\n" +
            "\n" +
            "Rinse the rice under cold water until the water runs clear. In a rice cooker or pot, combine the rice and water (or broth) with a pinch of salt.\n" +
            "Cook:\n" +
            "\n" +
            "Cook according to the rice cooker instructions or bring to a boil on the stovetop, then reduce heat to low, cover, and simmer until the rice is tender and the water is absorbed (about 18-20 minutes).\n" +
            "Serve:\n" +
            "Plate the Dish:\n" +
            "Serve the adobo over a bed of rice. Drizzle some sauce over the top for added flavor.", mealTime = MealTime.BREAKFAST.name, calories = "170", protein = "30", fats = "25", carbs = "55"),
    CHICKENINSAL(mealsId = "MEALSINTERMEDIATE-04", imageRes = R.drawable.chicken_inasal, mealsName = "Chiken Inasal",mealsDescription ="Ingredients\n" +
            "For the Marinade:\n" +
            "\n" +
            "1.5 to 2 pounds of chicken (legs, thighs, or whole chicken, cut into pieces)\n" +
            "1/2 cup vinegar (preferably cane vinegar)\n" +
            "1/4 cup soy sauce\n" +
            "1/4 cup calamansi juice (or lemon juice)\n" +
            "1 tablespoon of garlic (minced)\n" +
            "1 tablespoon of ginger (minced)\n" +
            "1 tablespoon of lemongrass (minced, optional)\n" +
            "1 teaspoon of black pepper\n" +
            "1 tablespoon of brown sugar (optional)\n" +
            "Salt (to taste)\n" +
            "For Basting:\n" +
            "\n" +
            "1/4 cup of cooking oil\n" +
            "2 tablespoons of vinegar\n" +
            "Instructions\n" +
            "Marinate the Chicken:\n" +
            "\n" +
            "In a bowl, combine vinegar, soy sauce, calamansi juice, garlic, ginger, lemongrass, black pepper, and salt. Add the chicken pieces and marinate for at least 1-2 hours, preferably overnight in the refrigerator for better flavor.\n" +
            "Prepare for Grilling:\n" +
            "\n" +
            "Preheat your grill or grill pan over medium-high heat. Remove the chicken from the marinade and let excess marinade drip off.\n" +
            "Baste the Chicken:\n" +
            "\n" +
            "In a small bowl, mix the cooking oil and vinegar for basting.\n" +
            "Grill the Chicken:\n" +
            "\n" +
            "Place the chicken on the grill. Cook for about 5-7 minutes on each side, basting with the oil and vinegar mixture every few minutes until the chicken is cooked through and has nice grill marks.\n" +
            "Serve:\n" +
            "\n" +
            "Serve the Chicken Inasal hot, with steamed rice and a side of vinegar dip or soy sauce with chopped chilies.", mealTime = MealTime.BREAKFAST.name, calories = "125", protein = "35", fats = "15", carbs = "50"),
    CHICKENTOCINO(mealsId = "MEALSINTERMEDIATE-05", imageRes = R.drawable.chikentocino, mealsName = "Chicken Tocino",mealsDescription ="Ingredients\n" +
            "For the Chicken:\n" +
            "\n" +
            "1 pound of chicken thighs or breasts (cut into thin slices)\n" +
            "For the Marinade:\n" +
            "\n" +
            "1/2 cup soy sauce\n" +
            "1/4 cup brown sugar (or honey)\n" +
            "1/4 cup pineapple juice (optional, for sweetness and flavor)\n" +
            "3-4 cloves of garlic (minced)\n" +
            "1 teaspoon of black pepper\n" +
            "A pinch of salt (to taste)\n" +
            "Cooking:\n" +
            "\n" +
            "2 tablespoons of cooking oil\n" +
            "Instructions\n" +
            "Marinate the Chicken:\n" +
            "\n" +
            "In a bowl, combine soy sauce, brown sugar, pineapple juice (if using), minced garlic, black pepper, and salt. Mix well.\n" +
            "Add the chicken slices, ensuring they are well coated. Cover and marinate for at least 1 hour, preferably overnight in the refrigerator for more flavor.\n" +
            "Cook the Chicken:\n" +
            "\n" +
            "Heat the cooking oil in a pan over medium heat. Add the marinated chicken (discard excess marinade) and cook until browned and cooked through, about 5-7 minutes per side.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with garlic rice and a side of fried eggs for a classic breakfast experience.", mealTime = MealTime.BREAKFAST.name, calories = "150", protein = "15", fats = "  15", carbs = "50"),
    CHICKENTINOLA(mealsId = "MEALSINTERMEDIATE-06", imageRes = R.drawable.chickentinola, mealsName = "Chicken Tinola",mealsDescription ="Ingredients\n" +
            "Chicken:\n" +
            "\n" +
            "1.5 to 2 pounds of chicken (cut into pieces, preferably bone-in for flavor)\n" +
            "Vegetables:\n" +
            "\n" +
            "1 medium green papaya (peeled, seeds removed, and sliced; you can also use chayote)\n" +
            "1-2 cups of spinach or moringa leaves (malunggay)\n" +
            "1 medium onion (sliced)\n" +
            "2-3 cloves of garlic (minced)\n" +
            "1-2 inches of ginger (sliced)\n" +
            "Seasonings:\n" +
            "\n" +
            "6-8 cups of water or chicken broth\n" +
            "Salt and pepper (to taste)\n" +
            "Optional: fish sauce (patis) for added flavor\n" +
            "Instructions\n" +
            "Sauté Aromatics:\n" +
            "\n" +
            "In a large pot, heat a bit of oil over medium heat. Sauté the onion, garlic, and ginger until fragrant.\n" +
            "Cook the Chicken:\n" +
            "\n" +
            "Add the chicken pieces and cook until lightly browned. Season with salt and pepper, and add fish sauce if using.\n" +
            "Add Liquid:\n" +
            "\n" +
            "Pour in the water or chicken broth. Bring to a boil, then reduce heat and simmer for about 20-25 minutes, or until the chicken is cooked through.\n" +
            "Add Papaya:\n" +
            "\n" +
            "Add the sliced green papaya and cook until tender, about 10 minutes.\n" +
            "Finish with Greens:\n" +
            "\n" +
            "Stir in the spinach or moringa leaves and cook for another minute until wilted.\n" +
            "Serve:\n" +
            "\n" +
            "Adjust seasoning to taste. Serve hot with steamed rice.", mealTime = MealTime.BREAKFAST.name, calories = "188", protein = "21", fats = "8", carbs = "7"),
    SINIGANGNAPORK(mealsId = "MEALSINTERMEDIATE-07", imageRes = R.drawable.sinigangpork, mealsName = "Sinigang na pork",mealsDescription ="Ingredients\n" +
            "For the Soup:\n" +
            "Pork:\n" +
            "1.5 to 2 pounds of pork (belly, ribs, or shoulder, cut into chunks)\n" +
            "Vegetables:\n" +
            "1 medium onion (quartered)\n" +
            "2-3 tomatoes (quartered)\n" +
            "1 radish (labanos, sliced)\n" +
            "1-2 cups of eggplant (sliced)\n" +
            "1-2 cups of string beans (sitaw)\n" +
            "1-2 green chili peppers (siling haba)\n" +
            "1-2 cups of water spinach (kangkong) or bok choy\n" +
            "Souring Agent:\n" +
            "1 packet of sinigang mix (or about 1 cup of fresh tamarind, cooked and mashed)\n" +
            "Seasonings:\n" +
            "Salt (to taste)\n" +
            "Fish sauce (patis, to taste)\n" +
            "Water:\n" +
            "About 6-8 cups (for the broth)\n" +
            "Instructions\n" +
            "Prepare the Broth:\n" +
            "\n" +
            "In a large pot, add the pork and enough water to cover. Bring to a boil, then reduce to a simmer. Skim off any scum that forms on the surface. Simmer until the meat is tender (about 1.5 to 2 hours).\n" +
            "Add Aromatics:\n" +
            "\n" +
            "Once the pork is tender, add the onions and tomatoes. Cook for about 10-15 minutes.\n" +
            "Add Vegetables:\n" +
            "\n" +
            "Add the radish and cook for another 5-10 minutes until slightly tender.\n" +
            "Sour It Up:\n" +
            "\n" +
            "Stir in the sinigang mix (or fresh tamarind juice) and add the green chili peppers. Adjust seasoning with salt and fish sauce.\n" +
            "Finish with Greens:\n" +
            "\n" +
            "Add the eggplant, string beans, and kangkong. Cook for a few more minutes until the vegetables are tender.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with steamed rice.", mealTime = MealTime.BREAKFAST.name, calories = "140", protein = "30", fats = "25", carbs = "55"),
    BISTEK(mealsId = "MEALSINTERMEDIATE-08", imageRes = R.drawable.bistek_tagalog, mealsName = "Bistek Tagalog",mealsDescription ="Ingredients\n" +
            "For the Beef:\n" +
            "1 to 1.5 pounds of beef sirloin or flank steak (sliced thinly against the grain)\n" +
            "For the Marinade:\n" +
            "1/4 cup soy sauce\n" +
            "1/4 cup calamansi juice (or lemon/lime juice)\n" +
            "3-4 cloves of garlic (minced)\n" +
            "1 tablespoon black pepper\n" +
            "Salt (to taste)\n" +
            "For Cooking:\n" +
            "2-3 tablespoons cooking oil\n" +
            "1-2 large onions (sliced into rings)\n" +
            "Instructions\n" +
            "Marinate the Beef:\n" +
            "\n" +
            "In a bowl, combine soy sauce, calamansi juice, minced garlic, black pepper, and salt. Add the sliced beef and marinate for at least 30 minutes, or preferably a few hours in the refrigerator.\n" +
            "Sauté the Onions:\n" +
            "\n" +
            "Heat 1 tablespoon of oil in a pan over medium heat. Sauté the onion rings until they become soft and translucent. Remove and set aside.\n" +
            "Cook the Beef:\n" +
            "\n" +
            "In the same pan, add more oil if needed. Remove the beef from the marinade (reserve the marinade) and cook in the hot pan until browned and cooked through, about 3-5 minutes per side.\n" +
            "Add Marinade:\n" +
            "\n" +
            "Pour the reserved marinade over the cooked beef and let it simmer for a few minutes until slightly thickened.\n" +
            "Combine:\n" +
            "\n" +
            "Return the sautéed onions to the pan and mix well.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with steamed rice.", mealTime = MealTime.BREAKFAST.name, calories = "125", protein = "30", fats = "25", carbs = "55"),
    CHICKENCALDS(mealsId = "MEALSINTERMEDIATE-09", imageRes = R.drawable.chicken_caldereta, mealsName = "Chicken Caldereta",mealsDescription ="Ingredients\n" +
            "For the Chicken:\n" +
            "\n" +
            "1.5 to 2 pounds of chicken (cut into pieces, thighs and drumsticks work well)\n" +
            "Vegetables:\n" +
            "\n" +
            "2-3 medium potatoes (peeled and cubed)\n" +
            "1-2 carrots (sliced)\n" +
            "1 red bell pepper (sliced)\n" +
            "1 green bell pepper (sliced)\n" +
            "1 cup of peas (fresh or frozen)\n" +
            "1 onion (sliced)\n" +
            "3-4 cloves of garlic (minced)\n" +
            "Sauce:\n" +
            "\n" +
            "1 cup of tomato sauce\n" +
            "1/2 cup of beef or chicken broth (or water)\n" +
            "1 tablespoon of soy sauce\n" +
            "1-2 tablespoons of liver spread (optional, for richness)\n" +
            "Salt and pepper (to taste)\n" +
            "2-3 tablespoons of cooking oil\n" +
            "Instructions\n" +
            "Sauté Aromatics:\n" +
            "\n" +
            "In a large pot, heat the cooking oil over medium heat. Sauté the garlic and onion until fragrant.\n" +
            "Brown the Chicken:\n" +
            "\n" +
            "Add the chicken pieces and cook until browned on all sides.\n" +
            "Add Vegetables:\n" +
            "\n" +
            "Stir in the potatoes and carrots, cooking for a few minutes.\n" +
            "Add Sauce and Liquid:\n" +
            "\n" +
            "Pour in the tomato sauce, broth (or water), and soy sauce. Bring to a boil, then reduce heat to simmer.\n" +
            "Simmer:\n" +
            "\n" +
            "Cover and cook for about 30-40 minutes, or until the chicken is tender. Stir occasionally and add water if needed to prevent sticking.\n" +
            "Add Peppers and Peas:\n" +
            "\n" +
            "Add the red and green bell peppers and peas. If using liver spread, stir it in now. Simmer for an additional 5-10 minutes.\n" +
            "Season:\n" +
            "\n" +
            "Adjust seasoning with salt and pepper to taste.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with steamed rice.", mealTime = MealTime.BREAKFAST.name, calories = "113", protein = "30", fats = "25", carbs = "55"),
    BANGUSBELLY(mealsId = "MEALSINTERMEDIATE-10", imageRes = R.drawable.bangus_belly, mealsName = "Bangus Belly",mealsDescription ="Ingredients\n" +
            "For the Bangus Belly:\n" +
            "\n" +
            "1-2 pieces of bangus belly (about 1 pound)\n" +
            "2-3 tablespoons of soy sauce\n" +
            "1 tablespoon of calamansi juice (or lemon juice)\n" +
            "2-3 cloves of garlic (minced)\n" +
            "1 teaspoon of black pepper\n" +
            "Salt (to taste)\n" +
            "For Cooking:\n" +
            "\n" +
            "2 tablespoons of cooking oil (for pan-frying or grilling)\n" +
            "Optional: sliced tomatoes and onions for garnish\n" +
            "Instructions\n" +
            "Marinate the Bangus Belly:\n" +
            "\n" +
            "In a bowl, combine soy sauce, calamansi juice, minced garlic, black pepper, and salt.\n" +
            "Add the bangus belly and marinate for at least 30 minutes, preferably 1-2 hours in the refrigerator.\n" +
            "Cook the Bangus Belly:\n" +
            "\n" +
            "For Grilling: Preheat your grill. Place the marinated bangus belly on the grill and cook for about 5-7 minutes on each side, or until cooked through and slightly charred.\n" +
            "For Pan-Frying: Heat oil in a pan over medium heat. Add the marinated bangus belly and cook for about 5-7 minutes on each side, or until golden brown and cooked through.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot, garnished with sliced tomatoes and onions if desired. This dish pairs well with steamed rice.", mealTime = MealTime.BREAKFAST.name, calories = "150", protein = "23", fats = "0", carbs = "0"),
    // for lunch (15)


    // for dinner(15)

}


/********************************************************
 *  meals prep for [BodyFatLevel.NATURAL]
 ********************************************************
 *  **/
enum class MealsCategoriesForNatural(val mealsId: String,
                                     @DrawableRes val imageRes: Int,
                                     val mealsName: String,
                                     val mealsDescription: String,
                                     val mealTime: String,
                                     val fats: String,
                                     val protein: String,
                                     val carbs: String,
                                     val calories:  String){
    // for breakfast (15)
    TUNAOMELET(mealsId = "MEALSADVANCE-01", imageRes = R.drawable.tuna_omelette, mealsName = "Tuna Omelet",mealsDescription ="2 pounds pork (butt, shoulder, ham or belly) - cut into ¼ inch thin\n" +
            "¾ cup brown sugar\n" +
            "1 ½ tablespoons salt\n" +
            "3 cloves garlic - finely minced\n" +
            "1 tablespoon soy sauce\n" +
            "2 tablespoons rice vinegar\n" +
            "¼ cup fruit juice, (pineapple, apple) (optional)\n" +
            "½ tablespoons finely ground black pepper\n" +
            "1 tablespoon rice flour (optional)\n" +
            "natural red food color (optional)\n" +
            "Instructions\n" +
            " \n" +
            "\n" +
            "In a big bowl, combine all ingredients except for the pork slices. Mix until well blended.\n" +
            "Add the pork and mix using the hand, use hand gloves to avoid stains. Mix for several minutes to an hour.\n" +
            "Transfer to a container with a cover and let it sit overnight on the counter.\n" +
            "Mix again for a couple of times before putting in the fridge. Cure for 24 hours or up to 3 days. Can be frozen afterwards and stored longer.", mealTime = MealTime.BREAKFAST.name, calories = "150", protein = "15", fats = "10", carbs = "40"),
    SINIGANG(mealsId = "MEALSADVANCE-02", imageRes = R.drawable.sinigang, mealsName = "Sinigang na beef",mealsDescription ="Ingredients\n" +
            "Beef:\n" +
            "\n" +
            "1.5 to 2 pounds of beef (brisket, shank, or short ribs, cut into chunks)\n" +
            "Vegetables:\n" +
            "\n" +
            "1 medium onion (quartered)\n" +
            "2-3 tomatoes (quartered)\n" +
            "1 radish (labanos, sliced)\n" +
            "1-2 cups of eggplant (sliced)\n" +
            "1-2 cups of string beans (sitaw)\n" +
            "1-2 green chili peppers (siling haba)\n" +
            "1-2 cups of water spinach (kangkong) or bok choy\n" +
            "Souring Agent:\n" +
            "\n" +
            "1 packet of sinigang mix (or about 1 cup of fresh tamarind, cooked and mashed)\n" +
            "Seasonings:\n" +
            "\n" +
            "Salt (to taste)\n" +
            "Fish sauce (patis, to taste)\n" +
            "Water:\n" +
            "\n" +
            "About 6-8 cups (for the broth)\n" +
            "Instructions\n" +
            "Prepare the Broth:\n" +
            "\n" +
            "In a large pot, add the beef and enough water to cover. Bring to a boil, then reduce to a simmer. Skim off any scum that forms on the surface. Simmer until the meat is tender (about 1.5 to 2 hours).\n" +
            "Add Aromatics:\n" +
            "\n" +
            "Once the beef is tender, add the onions and tomatoes. Cook for about 10-15 minutes.\n" +
            "Add Vegetables:\n" +
            "\n" +
            "Add the radish and cook for another 5-10 minutes until slightly tender.\n" +
            "Sour It Up:\n" +
            "\n" +
            "Stir in the sinigang mix (or fresh tamarind juice) and add the green chili peppers. Adjust seasoning with salt and fish sauce.\n" +
            "Finish with Greens:\n" +
            "\n" +
            "Add the eggplant, string beans, and kangkong. Cook for a few more minutes until the vegetables are tender.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with steamed rice.", mealTime = MealTime.BREAKFAST.name, calories = "185", protein = "26", fats = "15", carbs = "23"),
    ADOBO(mealsId = "MEALSADVANCE-03", imageRes = R.drawable.adobo, mealsName = "Adobo with Rice", mealsDescription ="Ingredients\n" +
            "For the Meat:\n" +
            "\n" +
            "1.5 pounds of chicken, pork, or a mix (cut into pieces)\n" +
            "For the Marinade:\n" +
            "\n" +
            "1/2 cup soy sauce\n" +
            "1/2 cup vinegar (white or cane vinegar)\n" +
            "1 medium onion (sliced)\n" +
            "4-5 cloves of garlic (minced)\n" +
            "2-3 bay leaves\n" +
            "1 tablespoon of black peppercorns (optional)\n" +
            "Salt and pepper (to taste)\n" +
            "For Cooking:\n" +
            "\n" +
            "2-3 tablespoons of cooking oil\n" +
            "Instructions\n" +
            "Marinate the Meat:\n" +
            "\n" +
            "In a bowl, combine soy sauce, vinegar, onion, garlic, bay leaves, and peppercorns. Add the meat and marinate for at least 30 minutes, or preferably a few hours in the refrigerator.\n" +
            "Sauté:\n" +
            "\n" +
            "In a pot, heat the oil over medium heat. Remove the meat from the marinade (reserve the marinade) and sauté until browned on all sides.\n" +
            "Simmer:\n" +
            "\n" +
            "Pour in the reserved marinade and add enough water to cover the meat. Bring to a boil, then reduce the heat and simmer for about 30-45 minutes, or until the meat is tender. Stir occasionally.\n" +
            "Reduce Sauce:\n" +
            "\n" +
            "If you prefer a thicker sauce, you can let it simmer uncovered for an additional 10-15 minutes until it reduces to your desired consistency. Adjust seasoning with salt and pepper if needed.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with steamed rice.", mealTime = MealTime.BREAKFAST.name,calories = "168", protein = "30", fats = "25", carbs = "55"),
    KAREKARE(mealsId = "MEALSADVANCE-04", imageRes = R.drawable.kare_kare, mealsName = "Kare-Kare", mealsDescription ="Ingredients\n" +
            "For the Meat:\n" +
            "\n" +
            "2 pounds of oxtail (or beef shank)\n" +
            "For the Sauce:\n" +
            "\n" +
            "1 cup peanut butter\n" +
            "1/4 cup ground peanuts (optional, for texture)\n" +
            "1-2 tablespoons of bagoong (fermented shrimp paste)\n" +
            "Vegetables:\n" +
            "\n" +
            "1-2 cups of eggplant (sliced)\n" +
            "1-2 cups of banana heart (puso ng saging, optional)\n" +
            "1-2 cups of string beans (sitaw)\n" +
            "1-2 cups of bok choy or pechay\n" +
            "For the Broth:\n" +
            "\n" +
            "6-8 cups of water\n" +
            "1 onion (quartered)\n" +
            "3-4 cloves of garlic (minced)\n" +
            "Salt and pepper (to taste)\n" +
            "Instructions\n" +
            "Cook the Oxtail:\n" +
            "\n" +
            "In a large pot, add the oxtail, onion, and garlic. Cover with water and bring to a boil. Skim off any foam that forms on the surface. Simmer for about 2-3 hours, or until the meat is tender.\n" +
            "Add Vegetables:\n" +
            "\n" +
            "Once the meat is tender, add the eggplant, banana heart, and string beans. Cook for about 10-15 minutes until the vegetables are tender.\n" +
            "Make the Sauce:\n" +
            "\n" +
            "Stir in the peanut butter and ground peanuts. Mix well and let it simmer for another 5-10 minutes. Adjust seasoning with salt and pepper.\n" +
            "Finish with Greens:\n" +
            "\n" +
            "Add the bok choy or pechay and cook until just wilted.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with steamed rice and a side of bagoong.", mealTime = MealTime.BREAKFAST.name,calories = "183", protein = "35", fats = "15", carbs = "50"),
    CHICKENTOCINO(mealsId = "MEALSADVANCE-05", imageRes = R.drawable.chikentocino, mealsName = "Chicken Tocino",mealsDescription ="Ingredients\n" +
            "For the Chicken:\n" +
            "\n" +
            "1 pound of chicken thighs or breasts (sliced into thin pieces)\n" +
            "For the Marinade:\n" +
            "\n" +
            "1/2 cup soy sauce\n" +
            "1/4 cup brown sugar (or honey)\n" +
            "1/4 cup pineapple juice (optional, for added sweetness)\n" +
            "3-4 cloves of garlic (minced)\n" +
            "1 teaspoon of black pepper\n" +
            "A pinch of salt (to taste)\n" +
            "Cooking:\n" +
            "\n" +
            "2 tablespoons of cooking oil\n" +
            "Instructions\n" +
            "Marinate the Chicken:\n" +
            "\n" +
            "In a bowl, mix together the soy sauce, brown sugar, pineapple juice (if using), minced garlic, black pepper, and salt. Add the chicken and ensure it’s well coated. Marinate for at least 1 hour, preferably overnight in the refrigerator.\n" +
            "Cook the Chicken:\n" +
            "\n" +
            "Heat oil in a pan over medium heat. Remove the chicken from the marinade (discard excess marinade) and cook in the hot pan until browned and cooked through, about 5-7 minutes per side.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with garlic rice and a side of fried eggs for a classic Filipino breakfast.", mealTime = MealTime.BREAKFAST.name, calories = "145", protein = "15", fats = "  15", carbs = "50"),
    PORKMINUDO(mealsId = "MEALSADVANCE-06", imageRes = R.drawable.pork_menudo, mealsName = "Pork Menudo",mealsDescription ="Ingredients\n" +
            "For the Pork:\n" +
            "\n" +
            "1.5 pounds of pork shoulder or pork belly (cut into small cubes)\n" +
            "Vegetables:\n" +
            "\n" +
            "1 medium onion (chopped)\n" +
            "3-4 cloves of garlic (minced)\n" +
            "1-2 medium carrots (diced)\n" +
            "1-2 medium potatoes (diced)\n" +
            "1 bell pepper (red or green, diced)\n" +
            "1 cup of green peas (fresh or frozen)\n" +
            "For the Sauce:\n" +
            "\n" +
            "1 cup of tomato sauce\n" +
            "1 tablespoon of soy sauce\n" +
            "1 cup of water or broth\n" +
            "1 bay leaf\n" +
            "Salt and pepper (to taste)\n" +
            "For Cooking:\n" +
            "\n" +
            "2-3 tablespoons of cooking oil\n" +
            "Instructions\n" +
            "Sauté Aromatics:\n" +
            "\n" +
            "In a large pot, heat the cooking oil over medium heat. Sauté the garlic and onion until fragrant.\n" +
            "Brown the Pork:\n" +
            "\n" +
            "Add the pork cubes and cook until browned on all sides.\n" +
            "Add Vegetables:\n" +
            "\n" +
            "Stir in the carrots and potatoes. Cook for a few minutes, then add the tomato sauce, soy sauce, and water or broth. Add the bay leaf and season with salt and pepper.\n" +
            "Simmer:\n" +
            "\n" +
            "Bring to a boil, then reduce the heat and let it simmer for about 30-40 minutes, or until the pork is tender. Stir occasionally and add more water if needed.\n" +
            "Finish with Peas and Bell Pepper:\n" +
            "\n" +
            "Add the diced bell pepper and green peas. Cook for an additional 5-10 minutes until the vegetables are tender.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with steamed rice.", mealTime = MealTime.BREAKFAST.name, calories = "132", protein = "21", fats = "8", carbs = "7"),
    SINIGANGNAPORK(mealsId = "MEALSADVANCE-07", imageRes = R.drawable.sinigangpork, mealsName = "Sinigang na pork",mealsDescription ="Ingredients\n" +
            "Pork:\n" +
            "\n" +
            "1.5 to 2 pounds of pork (belly, ribs, or shoulder, cut into chunks)\n" +
            "Vegetables:\n" +
            "\n" +
            "1 medium onion (quartered)\n" +
            "2-3 tomatoes (quartered)\n" +
            "1 radish (labanos, sliced)\n" +
            "1-2 cups of eggplant (sliced)\n" +
            "1-2 cups of string beans (sitaw)\n" +
            "1-2 green chili peppers (siling haba)\n" +
            "1-2 cups of water spinach (kangkong) or bok choy\n" +
            "Souring Agent:\n" +
            "\n" +
            "1 packet of sinigang mix (or about 1 cup of fresh tamarind, cooked and mashed)\n" +
            "Seasonings:\n" +
            "\n" +
            "Salt (to taste)\n" +
            "Fish sauce (patis, to taste)\n" +
            "Water:\n" +
            "\n" +
            "About 6-8 cups (for the broth)\n" +
            "Instructions\n" +
            "Prepare the Broth:\n" +
            "\n" +
            "In a large pot, add the pork and enough water to cover. Bring to a boil, then reduce to a simmer. Skim off any scum that forms on the surface. Simmer until the meat is tender (about 1.5 to 2 hours).\n" +
            "Add Aromatics:\n" +
            "\n" +
            "Once the pork is tender, add the onions and tomatoes. Cook for about 10-15 minutes.\n" +
            "Add Vegetables:\n" +
            "\n" +
            "Add the radish and cook for another 5-10 minutes until slightly tender.\n" +
            "Sour It Up:\n" +
            "\n" +
            "Stir in the sinigang mix (or fresh tamarind juice) and add the green chili peppers. Adjust seasoning with salt and fish sauce.\n" +
            "Finish with Greens:\n" +
            "\n" +
            "Add the eggplant, string beans, and kangkong. Cook for a few more minutes until the vegetables are tender.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with steamed rice.", mealTime = MealTime.BREAKFAST.name, calories = "150", protein = "30", fats = "25", carbs = "55"),
    BISTEK(mealsId = "MEALSADVANCE-08", imageRes = R.drawable.bistek_tagalog, mealsName = "Bistek Tagalog",mealsDescription ="Ingredients\n" +
            "For the Beef:\n" +
            "\n" +
            "1 to 1.5 pounds of beef sirloin or flank steak (sliced thinly against the grain)\n" +
            "For the Marinade:\n" +
            "\n" +
            "1/4 cup soy sauce\n" +
            "1/4 cup calamansi juice (or lemon/lime juice)\n" +
            "3-4 cloves of garlic (minced)\n" +
            "1 tablespoon black pepper\n" +
            "Salt (to taste)\n" +
            "For Cooking:\n" +
            "\n" +
            "2-3 tablespoons cooking oil\n" +
            "1-2 large onions (sliced into rings)\n" +
            "Instructions\n" +
            "Marinate the Beef:\n" +
            "\n" +
            "In a bowl, combine soy sauce, calamansi juice, minced garlic, black pepper, and salt. Add the sliced beef and marinate for at least 30 minutes, or preferably a few hours in the refrigerator.\n" +
            "Sauté the Onions:\n" +
            "\n" +
            "Heat 1 tablespoon of oil in a pan over medium heat. Sauté the onion rings until they become soft and translucent. Remove and set aside.\n" +
            "Cook the Beef:\n" +
            "\n" +
            "In the same pan, add more oil if needed. Remove the beef from the marinade (reserve the marinade) and cook in the hot pan until browned and cooked through, about 3-5 minutes per side.\n" +
            "Add Marinade:\n" +
            "\n" +
            "Pour the reserved marinade over the cooked beef and let it simmer for a few minutes until slightly thickened.\n" +
            "Combine:\n" +
            "\n" +
            "Return the sautéed onions to the pan and mix well.\n" +
            "Serve:\n" +
            "\n" +
            "Serve hot with steamed rice.", mealTime = MealTime.BREAKFAST.name, calories = "150", protein = "30", fats = "25", carbs = "55"),
    LONGSILOG(mealsId = "MEALSADVANCE-09", imageRes = R.drawable.longsilog, mealsName = "Longganisa Itlog",mealsDescription ="Ingredients\n" +
            "For the Longganisa:\n" +
            "\n" +
            "1 pound of longganisa (Filipino sausage, can be sweet or garlicky)\n" +
            "For the Eggs:\n" +
            "\n" +
            "4-6 eggs\n" +
            "Salt and pepper (to taste)\n" +
            "Cooking oil (for frying)\n" +
            "For Serving:\n" +
            "\n" +
            "Steamed rice\n" +
            "Optional: sliced tomatoes or pickled vegetables\n" +
            "Instructions\n" +
            "Cook the Longganisa:\n" +
            "\n" +
            "In a skillet over medium heat, add the longganisa. You can add a little water to help it cook through without burning. Cover and let it simmer until the water evaporates.\n" +
            "Once the water is gone, let the longganisa fry in its own fat until browned and cooked through, about 5-7 minutes. Turn occasionally for even cooking.\n" +
            "Prepare the Eggs:\n" +
            "\n" +
            "In a separate pan, heat a bit of oil over medium heat. Crack the eggs into the pan and cook to your preference (sunny side up, scrambled, or over easy). Season with salt and pepper.\n" +
            "Serve:\n" +
            "\n" +
            "On a plate, serve the cooked longganisa alongside the eggs. Add steamed rice and any optional sides, like sliced tomatoes or pickled vegetables.", mealTime = MealTime.BREAKFAST.name, calories = "145", protein = "30", fats = "25", carbs = "55"),
    SCRAMBLEEGGS(mealsId = "MEALSADVANCE-10", imageRes = R.drawable.scrambleeggs, mealsName = "Scramble Eggs",mealsDescription ="Ingredients\n" +
            "4-6 eggs\n" +
            "2-3 tablespoons of milk or cream (optional, for creaminess)\n" +
            "Salt and pepper (to taste)\n" +
            "1 tablespoon of butter or oil (for cooking)\n" +
            "Instructions\n" +
            "Whisk the Eggs:\n" +
            "\n" +
            "In a bowl, crack the eggs and add milk or cream (if using). Season with salt and pepper. Whisk until well combined and slightly frothy.\n" +
            "Heat the Pan:\n" +
            "\n" +
            "In a non-stick skillet, heat the butter or oil over medium-low heat.\n" +
            "Cook the Eggs:\n" +
            "\n" +
            "Pour the egg mixture into the pan. Let it sit for a few seconds until it starts to set at the edges.\n" +
            "Scramble:\n" +
            "\n" +
            "Using a spatula, gently stir the eggs, pushing them from the edges toward the center. Continue to cook, stirring occasionally, until the eggs are just set but still slightly soft (about 3-5 minutes).\n" +
            "Serve:\n" +
            "\n" +
            "Remove from heat and serve immediately, as the residual heat will continue to cook the eggs slightly.", mealTime = MealTime.BREAKFAST.name, calories = "120", protein = "30", fats = "25", carbs = "55"),

    // for lunch (15)


    // for dinner(15)
}
