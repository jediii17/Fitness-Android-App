    package com.example.fitness.common

import androidx.annotation.DrawableRes
import com.example.fitness.R



enum class MealTime(val label: String){
    BREAKFAST("Breakfast"),
    LUNCH("Lunch"),
    DINNER("Dinner"),
}

/********************************************************
 *  meals prep for [BodyFatLevel.LEAN]
 ********************************************************
 *  **/
enum class MealsCategoriesForLean(val mealsId: String,
                                  @DrawableRes val imageRes: Int,
                                  val mealsName: String,
                                  val ingredients: String,
                                  val mealTime: String,
                                  val fats: String,
                                  val protein: String,
                                  val carbs: String,
                                  val calories:  String) {

    /********************************************************
     *  meals prep for [BREAKFAST]
     ********************************************************
     *  **/
    Tuna(
        mealsId = "TUNA-01",
        imageRes = R.drawable.chicken_tocino_breakfast,
        mealsName = "Chicken Tocino Breakfast",
        ingredients = " In a bowl, combine sugar, salt, garlic, pepper, and vinegar. Coat the chicken with the marinade and refrigerate for at least 2 hours. Heat oil in a pan and fry the chicken on medium heat until golden brown and cooked through. Serve with steamed rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "120 Kcal",
        protein = "28g",
        carbs = "45g",
        fats = "15g"
    ),

    two(
        mealsId = "TUNA-02",
        imageRes = R.drawable.chickentinola_breakfast,
        mealsName = "Chicken Breast Tinola",
        ingredients = "Boil chicken in a pot with water, ginger, onions, and fish sauce. Once the chicken is tender, add green papaya slices and chili leaves. Continue to simmer until the papaya is tender and the flavors meld. Serve hot.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "150 Kcal",
        protein = "30g",
        carbs = "35g",
        fats = "12g"
    ),

    three(
        mealsId = "TUNA-03",
        imageRes = R.drawable.inihawnababoybreakfast,
        mealsName = "Inihaw na Baboy (Grilled Pork)",
        ingredients ="Marinate the pork in the mixture for at least 2 hours. In a bowl, mix soy sauce, vinegar, garlic, and calamansi juice to make the marinade. Preheat the grill to medium heat. Grill the pork, turning occasionally and basting with the marinade, until cooked and lightly charred. Serve with steamed rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "120 Kcal",
        protein = "38g",
        carbs = "50g",
        fats = "20g"
    ),

    four(
        mealsId = "TUNA-04",
        imageRes = R.drawable.chicken_tocino_with_brown_rice_breakfast,
        mealsName = "Chicken Tocino with Brown Rice",
        ingredients = "Prepare chicken tocino as described in the recipe for 'Chicken Tocino Breakfast. Cook brown rice according to package instructions. Serve the cooked chicken tocino over the steamed brown rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "125 Kcal",
        protein = "30g",
        carbs = "55g",
        fats = "16g"
    ),

    five(
        mealsId = "TUNA-05",
        imageRes = R.drawable.fish_escabeche_breakfast,
        mealsName = "Fish Escabeche",
        ingredients ="Fry fish until crispy. In a saucepan, combine vinegar, sugar, soy sauce, and ginger, and bring to a boil. Reduce heat and simmer the sauce for about 5 minutes. Pour the sauce over the fried fish. Garnish with fried bell peppers and onions. Serve with steamed rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "192 Kcal",
        protein = "30g",
        carbs = "40g",
        fats = "18g"
    ),

    six(
        mealsId = "TUNA-06",
        imageRes = R.drawable.grilled_chicken_inasal__breakfast,
        mealsName = "Grilled Chicken Inasal",
        ingredients = "In a bowl, combine vinegar, soy sauce, calamansi, garlic, ginger, and oil to make the marinade. Marinate the chicken for at least 3 hours. Preheat the grill to medium heat. Grill the chicken, basting with the marinade, until cooked through and slightly charred. Serve with garlic rice and dipping sauce.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "275 Kcal",
        protein = "40g",
        carbs = "35g",
        fats = "18g"
    ),

    seven(
        mealsId = "TUNA-07",
        imageRes = R.drawable.pandesal_spread_with_creamy_peanut_butter_breakfast,
        mealsName = "Pandesal with Peanut Butter",
        ingredients = "Toast pandesal until golden brown. Spread a generous amount of creamy peanut butter on each piece. Serve with a hot beverage of your choice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "20 Kcal",
        protein = "12g",
        carbs = "50g",
        fats = "15g"
    ),

    eight(
        mealsId = "TUNA-08",
        imageRes = R.drawable.paksiw_na_pata_breakfast,
        mealsName = "Paksiw na Pata",
        ingredients = " In a pot, combine pork hock, vinegar, soy sauce, garlic, and onions. Add water to cover the meat and bring to a boil. Lower the heat and simmer until the meat is tender. Add eggplant, sitaw (string beans), and long green pepper. Simmer until vegetables are tender. Serve with steamed rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "450 Kcal",
        protein = "40g",
        carbs = "35g",
        fats = "30g"
    ),

    nine(
        mealsId = "TUNA-09",
        imageRes = R.drawable.oatmeal_with_almond_milk__topped_with_bananas_and_chia_seeds_boiled_egg_breakfast,
        mealsName = "Oatmeal with Banana and Chia Seeds",
        ingredients = "Cook oatmeal according to package instructions using almond milk. Once cooked, transfer to a bowl. Top with sliced bananas, chia seeds, and a boiled egg on the side. Serve warm.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "50 Kcal",
        protein = "9g",
        carbs = "5g",
        fats = "10g"
    ),

    ten(
        mealsId = "TUNA-10",
        imageRes = R.drawable.tuna_omelette,
        mealsName = "Tuna Omelette",
        ingredients = " Beat eggs in a bowl and season with salt and pepper. In a pan, heat oil and sauté canned tuna until heated through. Pour the beaten eggs over the tuna and cook until the eggs are set. Flip and cook the other side for 1-2 minutes. Serve with a side of vegetables or rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "75 Kcal",
        protein = "30g",
        carbs = "20g",
        fats = "25g"
    ),

    eleven(
        mealsId = "TUNA-11",
        imageRes = R.drawable.scrambled_eggs_made_with_3_eggs_breakfast,
        mealsName = "Scrambled Eggs",
        ingredients = " Crack eggs into a bowl and beat them well. Heat a pan with butter over medium heat. Pour the eggs into the pan and cook, stirring gently, until they reach the desired consistency. Season with salt and pepper.  Serve with toast or as a side dish.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "79 Kcal",
        protein = "21g",
        carbs = "5g",
        fats = "22g"
    ),

    twelve(
        mealsId = "TUNA-12",
        imageRes = R.drawable.tinolang_manok__chicken_stew__breakfast,
        mealsName = "Tinolang Manok",
        ingredients = " In a pot, boil chicken with water, ginger, garlic, onions, and fish sauce. Once the chicken is tender, add green papaya and chili leaves. Simmer for another 5-10 minutes. Serve hot with rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "145 Kcal",
        protein = "10g",
        carbs = "10g",
        fats = "10g"
    ),

    thirteen(
        mealsId = "TUNA-13",
        imageRes = R.drawable.sinigang_na_hipon_breakfast,
        mealsName = "Sinigang na Hipon (Shrimp Soup)",
        ingredients = " Boil shrimp in water with tomatoes, onions, and radish. Add tamarind paste or fresh tamarind to achieve the sour flavor. Add sitaw (string beans) and other vegetables of choice. Simmer until shrimp is cooked and vegetables are tender. Serve with rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "180 Kcal",
        protein = "2g",
        carbs = "5g",
        fats = "5g"
    ),

    fourteen(
        mealsId = "TUNA-14",
        imageRes = R.drawable.tinola_with_malunggay__chicken_tinola__breakfast,
        mealsName = "Chicken Tinola with Malunggay",
        ingredients = " Boil chicken in a pot with water, ginger, onions, and fish sauce. Once the chicken is tender, add green papaya and chili leaves. Add malunggay (moringa leaves) towards the end and simmer for another 5 minutes. Serve with rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "250 Kcal",
        protein = "15g",
        carbs = "30g",
        fats = "8g"
    ),

    /********************************************************
     *  meals prep for [LUNCH]
     ********************************************************
     *  **/
    EGGWITHRICE(
        mealsId = "MEALSBEGINNER-01",
        imageRes = R.drawable.egg_with_rice,
        mealsName = "Egg with Rice",
        ingredients = " Cook rice according to your preference. In a pan, heat oil and crack the eggs into it. Fry the eggs until the yolks are set, or cook to your desired doneness. Serve the eggs with a side of rice.",
        mealTime = MealTime.LUNCH.label,
        calories = "290 Kcal",
        protein = "15g",
        fats = "10g",
        carbs = "40g"
    ),

    SINIGANG(
        mealsId = "MEALSBEGINNER-02",
        imageRes = R.drawable.sinigang,
        mealsName = "Sinigang na Beef",
        ingredients = "In a pot, bring water to a boil. Add beef chunks and simmer until tender. Add tamarind paste or fresh tamarind for sourness, along with onions, tomatoes, and radish. Add your choice of vegetables like eggplant, sitaw (string beans), and kangkong (water spinach). Simmer until vegetables are tender. Serve hot.",
        mealTime = MealTime.LUNCH.label,
        calories = "270 Kcal",
        protein = "26g",
        fats = "15g",
        carbs = "23g"
    ),

    ADOBO(
        mealsId = "MEALSBEGINNER-03",
        imageRes = R.drawable.adobo,
        mealsName = "Adobo with Rice",
        ingredients = "In a pot, combine pork or chicken with soy sauce, vinegar, garlic, bay leaves, and peppercorns. Simmer the meat until tender, then reduce the sauce until thickened. Serve the adobo with steamed rice.",
        mealTime = MealTime.LUNCH.label,
        calories = "225Kcal",
        protein = "30g",
        fats = "25g",
        carbs = "55g"
    ),

    KAREKARE(
        mealsId = "MEALSBEGINNER-04",
        imageRes = R.drawable.kare_kare,
        mealsName = "Kare-Kare",
        ingredients = "In a pot, cook oxtail or pork hock until tender. Prepare the peanut sauce by blending peanut butter with annatto powder, then add to the pot. Add vegetables like banana heart, eggplant, and string beans. Serve with bagoong (fermented shrimp paste) on the side.",
        mealTime = MealTime.LUNCH.label,
        calories = "223Kcal",
        protein = "35g",
        fats = "15g",
        carbs = "50g"
    ),

    CHICKENTOCINO(
        mealsId = "MEALSBEGINNER-05",
        imageRes = R.drawable.chikentocino,
        mealsName = "Chicken Tocino",
        ingredients = "Marinate chicken in a mixture of sugar, salt, garlic, pepper, and vinegar. Refrigerate for at least 2 hours. Heat oil in a pan and fry the chicken until golden brown and cooked through. Serve with rice.",
        mealTime = MealTime.LUNCH.label,
        calories = "245Kcal",
        protein = "15g",
        fats = "15g",
        carbs = "50g"
    ),

    CHICKENTINOLA(
        mealsId = "MEALSBEGINNER-06",
        imageRes = R.drawable.chickentinola,
        mealsName = "Chicken Tinola",
        ingredients = "In a pot, boil chicken with water, ginger, onions, and fish sauce. Once the chicken is tender, add green papaya slices and chili leaves. Simmer until the papaya is tender. Serve hot.",
        mealTime = MealTime.LUNCH.label,
        calories = "288 Kcal",
        protein = "21g",
        fats = "8g",
        carbs = "7g"
    ),

    SINIGANGNAPORK(
        mealsId = "MEALSBEGINNER-07",
        imageRes = R.drawable.sinigangpork,
        mealsName = "Sinigang na Pork",
        ingredients = "In a pot, bring water to a boil with pork belly or ribs, tomatoes, onions, and radish. Add tamarind paste or fresh tamarind to achieve the signature sourness. Add vegetables like sitaw, okra, and eggplant. Simmer until tender. Serve with rice.",
        mealTime = MealTime.LUNCH.label,
        calories = "160 Kcal",
        protein = "30g",
        fats = "25g",
        carbs = "55g"
    ),

    BISTEK(
        mealsId = "MEALSBEGINNER-08",
        imageRes = R.drawable.bistek_tagalog,
        mealsName = "Bistek Tagalog",
        ingredients = "Marinate beef in soy sauce, calamansi juice, and garlic for at least 30 minutes. Sauté onions in oil until soft, then add the marinated beef. Cook until the beef is tender and the sauce reduces. Serve with rice.",
        mealTime = MealTime.LUNCH.label,
        calories = "160Kcal",
        protein = "35g",
        fats = "15g",
        carbs = "65g"
    ),

    LONGSILOG(
        mealsId = "MEALSBEGINNER-09",
        imageRes = R.drawable.longsilog,
        mealsName = "Longganisa Itlog",
        ingredients = "Fry longganisa sausages until browned and crispy. In a separate pan, fry eggs to your preferred doneness. Serve the longganisa with the fried eggs and a side of rice.",
        mealTime = MealTime.LUNCH.label,
        calories = "125 Kcal",
        protein = "25g",
        fats = "25g",
        carbs = "55g"
    ),

    SCRAMBLEEGGS(
        mealsId = "MEALSBEGINNER-10",
        imageRes = R.drawable.scrambleeggs,
        mealsName = "Scrambled Eggs",
        ingredients = "Crack eggs into a bowl and beat well. Heat butter in a pan and pour in the beaten eggs. Stir gently as the eggs cook until they are soft and fluffy. Serve with toast or as a side dish.",
        mealTime = MealTime.LUNCH.label,
        calories = "80 Kcal",
        protein = "28g",
        fats = "25g",
        carbs = "40g"
    ),


    /********************************************************
     *  meals prep for [DINNER]
     ********************************************************
     *  **/
    dawd(
        mealsId = "1",
        imageRes = R.drawable.beef_caldereta_dinner,
        mealsName = "Beef Caldereta",
        ingredients = "Sear beef chunks until browned. Add onions, garlic, and tomatoes, and cook until softened. Pour in beef broth and simmer until the meat is tender. Add potatoes, carrots, and bell peppers. Stir in tomato paste, liver spread, and season with salt, pepper, and chili. Simmer until vegetables are cooked. Serve with rice.",
        mealTime = MealTime.DINNER.label,
        calories = "450 Kcal",
        protein = "35g",
        carbs = "25g",
        fats = "25g"
    ),

    tawdawwo(
        mealsId = "2",
        imageRes = R.drawable.chicken_adobo_dinner,
        mealsName = "Chicken Adobo",
        ingredients = "In a pot, combine chicken with soy sauce, vinegar, garlic, and bay leaves. Bring to a boil and let it simmer until the chicken is tender. Adjust seasoning with salt and pepper to taste. Serve with rice.",
        mealTime = MealTime.DINNER.label,
        calories = "400 Kcal",
        protein = "30g",
        carbs = "12g",
        fats = "22g"
    ),

    wda(
        mealsId = "3",
        imageRes = R.drawable.chicken_adobo_dinner,
        mealsName = "Chicken Adobo",
        ingredients = "Marinate chicken in soy sauce, vinegar, garlic, bay leaves, and pepper. Cook the chicken until tender, then reduce the sauce until thick. Serve with steamed rice.",
        mealTime = MealTime.DINNER.label,
        calories = "410 Kcal",
        protein = "32g",
        carbs = "15g",
        fats = "18g"
    ),

    fowdaur(
        mealsId = "4",
        imageRes = R.drawable.pinakbet_dinner,
        mealsName = "Pinakbet",
        ingredients = "Sauté garlic, onions, and tomatoes in oil until soft. Add pork or shrimp and cook until browned. Add vegetables like squash, eggplant, string beans, and okra. Pour in fish sauce and simmer until the vegetables are tender. Serve hot.",
        mealTime = MealTime.DINNER.label,
        calories = "200 Kcal",
        protein = "5g",
        carbs = "30g",
        fats = "10g"
    ),

    fivawdwae(
        mealsId = "5",
        imageRes = R.drawable.chicken_caldereta_dinner,
        mealsName = "Chicken Caldereta",
        ingredients = "Sear chicken pieces in hot oil. Add onions, garlic, and tomatoes, cooking until soft. Pour in tomato paste, beef broth, and simmer until the chicken is tender. Add potatoes, carrots, and bell peppers. Season with salt, pepper, and chili. Simmer until vegetables are tender. Serve with rice.",
        mealTime = MealTime.DINNER.label,
        calories = "420 Kcal",
        protein = "38g",
        carbs = "20g",
        fats = "18g"
    ),

    siawdx(
        mealsId = "6",
        imageRes = R.drawable.bangus_belly_sinigang_dinner,
        mealsName = "Bangus Belly Sinigang",
        ingredients = "Boil bangus belly in water with onions, tomatoes, and ginger. Add tamarind paste for sourness. Add vegetables like string beans, eggplant, and okra. Simmer until fish and vegetables are tender. Serve hot.",
        mealTime = MealTime.DINNER.label,
        calories = "350 Kcal",
        protein = "30g",
        carbs = "18g",
        fats = "20g"
    ),

    sewadven(
        mealsId = "7",
        imageRes = R.drawable.grilled_bangus_dinner,
        mealsName = "Grilled Bangus",
        ingredients = "Marinate bangus in a mixture of soy sauce, calamansi juice, garlic, and pepper. Grill until the fish is cooked through and slightly charred. Serve with steamed rice and a side of vegetables.",
        mealTime = MealTime.DINNER.label,
        calories = "370 Kcal",
        protein = "28g",
        carbs = "5g",
        fats = "25g"
    ),

    eiwdght(
        mealsId = "8",
        imageRes = R.drawable.grilled_tilapia_w_spinach_dinner,
        mealsName = "Grilled Tilapia with Spinach",
        ingredients = "Season tilapia with salt, pepper, and lemon juice. Grill until cooked through. Sauté spinach with garlic in olive oil. Serve the grilled fish over a bed of sautéed spinach.",
        mealTime = MealTime.DINNER.label,
        calories = "300 Kcal",
        protein = "30g",
        carbs = "10g",
        fats = "15g"
    ),

    niawdne(
        mealsId = "9",
        imageRes = R.drawable.pork_binagoongan_dinner,
        mealsName = "Pork Binagoongan",
        ingredients = "Sauté garlic, onions, and shrimp paste in oil. Add pork and cook until browned. Pour in coconut milk and simmer until the pork is tender. Serve with steamed rice.",
        mealTime = MealTime.DINNER.label,
        calories = "450 Kcal",
        protein = "28g",
        carbs = "20g",
        fats = "30g"
    ),

    teawdn(
        mealsId = "10",
        imageRes = R.drawable.chicken_tocino_dinner,
        mealsName = "Chicken Tocino",
        ingredients = "Marinate chicken in sugar, salt, garlic, vinegar, and pepper for at least 2 hours. Fry the chicken in hot oil until golden brown and cooked through. Serve with rice.",
        mealTime = MealTime.DINNER.label,
        calories = "400 Kcal",
        protein = "30g",
        carbs = "12g",
        fats = "25g"
    ),

    elawdeven(
        mealsId = "11",
        imageRes = R.drawable.tuna_omellete_with_mango_dinner,
        mealsName = "Tuna Omelette with Mango",
        ingredients = "Beat eggs and mix with canned tuna. Pour into a hot, greased pan and cook until the omelette is set. Serve with fresh mango slices on the side.",
        mealTime = MealTime.DINNER.label,
        calories = "350 Kcal",
        protein = "32g",
        carbs = "15g",
        fats = "18g"
    ),

    twawdelve(
        mealsId = "12",
        imageRes = R.drawable.pandesal_with_peanut_and_papaya_dinner,
        mealsName = "Pandesal with Peanut and Papaya",
        ingredients = "Toast pandesal bread until crispy. Spread peanut butter on the bread. Top with thin slices of fresh papaya. Serve as a light dinner or snack.",
        mealTime = MealTime.DINNER.label,
        calories = "280 Kcal",
        protein = "8g",
        carbs = "35g",
        fats = "15g"
    ),

    thiawdrteen(
        mealsId = "13",
        imageRes = R.drawable.tuna_pandesal_dinner,
        mealsName = "Tuna Pandesal",
        ingredients = "Open canned tuna and mix with mayo and a squeeze of lemon. Stuff the mixture into halved pandesal rolls. Serve as a quick and satisfying meal.",
        mealTime = MealTime.DINNER.label,
        calories = "350 Kcal",
        protein = "25g",
        carbs = "30g",
        fats = "12g"
    ),

    fouadwadrteen(
        mealsId = "14",
        imageRes = R.drawable.pork_nilaga_with_cucumber_dinner,
        mealsName = "Pork Nilaga with Cucumber",
        ingredients = "Boil pork in water with garlic, onions, and peppercorns. Add vegetables like potatoes and corn. Once the pork is tender, add cucumber slices. Simmer until everything is cooked. Serve hot.",
        mealTime = MealTime.DINNER.label,
        calories = "380 Kcal",
        protein = "30g",
        carbs = "20g",
        fats = "18g"
    ),

    fivwdeteen(
        mealsId = "15",
        imageRes = R.drawable.tuna__dinner,
        mealsName = "Grilled Tuna",
        ingredients = "Season tuna steaks with salt, pepper, and lemon juice. Grill on high heat for about 4-5 minutes per side until cooked through. Serve with steamed rice or salad.",
        mealTime = MealTime.DINNER.label,
        calories = "400 Kcal",
        protein = "35g",
        carbs = "10g",
        fats = "22g"
    )

}

/********************************************************
 *  meals prep for [BodyFatLevel.ATHLETIC]
 ********************************************************
 *  **/
enum class MealsCategoriesForAthletic(val mealsId: String,
                                      @DrawableRes val imageRes: Int,
                                      val mealsName: String,
                                      val ingredients: String,
                                      val mealTime: String,
                                      val fats: String,
                                      val protein: String,
                                      val carbs: String,
                                      val calories:  String) {

    /********************************************************
     *  meals prep for [BREAKFAST]
     ********************************************************
     *  **/
    Tuna(
        mealsId = "TUNA-01",
        imageRes = R.drawable.chicken_tocino_breakfast,
        mealsName = "Chicken Tocino",
        ingredients = "Marinate chicken with garlic, sugar, salt, and vinegar for a few hours. Cook in a pan over medium heat until browned and cooked through. Serve with rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "350 Kcal",
        protein = "22g",
        carbs = "25g",
        fats = "18g"
    ),
    two(
        mealsId = "MEAL-02",
        imageRes = R.drawable.chickentinola_breakfast,
        mealsName = "Chicken Tinola",
        ingredients = "Sauté garlic, onion, and ginger. Add chicken and cook until browned. Pour in water, bring to a boil, then simmer until chicken is tender. Add sayote and spinach, and season with fish sauce. Serve with rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "320 Kcal",
        protein = "28g",
        carbs = "24g",
        fats = "10g"
    ),
    three(
        mealsId = "MEAL-03",
        imageRes = R.drawable.inihawnababoybreakfast,
        mealsName = "Inihaw na Baboy",
        ingredients = "Marinate pork in soy sauce, vinegar, garlic, and spices for a few hours. Skewer and grill on high heat until cooked through and slightly charred. Serve with a side of dipping sauce and rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "450 Kcal",
        protein = "30g",
        carbs = "20g",
        fats = "30g"
    ),
    four(
        mealsId = "MEAL-04",
        imageRes = R.drawable.chicken_tocino_with_brown_rice_breakfast,
        mealsName = "Chicken Tocino with Brown Rice",
        ingredients = "Marinate chicken with garlic, sugar, salt, and vinegar for a few hours. Cook in a pan over medium heat until browned and cooked through. Serve with steamed brown rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "380 Kcal",
        protein = "25g",
        carbs = "28g",
        fats = "15g"
    ),
    five(
        mealsId = "MEAL-05",
        imageRes = R.drawable.fish_escabeche_breakfast,
        mealsName = "Fish Escabeche",
        ingredients = "Fry fish until crispy and golden brown. Prepare the escabeche sauce with vinegar, sugar, soy sauce, ginger, and vegetables. Pour sauce over the fried fish. Serve with rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "340 Kcal",
        protein = "30g",
        carbs = "25g",
        fats = "10g"
    ),
    six(
        mealsId = "MEAL-06",
        imageRes = R.drawable.grilled_chicken_inasal__breakfast,
        mealsName = "Grilled Chicken Inasal",
        ingredients = "Marinate chicken in a mixture of vinegar, calamansi, garlic, ginger, and achiote oil. Grill the chicken over medium-high heat until cooked through and slightly charred. Serve with rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "300 Kcal",
        protein = "32g",
        carbs = "20g",
        fats = "8g"
    ),
    seven(
        mealsId = "MEAL-07",
        imageRes = R.drawable.pandesal_spread_with_creamy_peanut_butter_breakfast,
        mealsName = "Pandesal with Peanut Butter",
        ingredients = "Toast pandesal and spread with creamy peanut butter. Serve immediately as a quick breakfast.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "250 Kcal",
        protein = "8g",
        carbs = "30g",
        fats = "10g"
    ),
    eight(
        mealsId = "MEAL-08",
        imageRes = R.drawable.paksiw_na_pata_breakfast,
        mealsName = "Paksiw na Pata",
        ingredients = "Sauté garlic, onion, and ginger in oil. Add pork hock, vinegar, soy sauce, and water. Simmer until pork is tender. Add vegetables like eggplant and banana blossom.  Simmer until soft.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "420 Kcal",
        protein = "20g",
        carbs = "30g",
        fats = "25g"
    ),
    nine(
        mealsId = "MEAL-09",
        imageRes = R.drawable.oatmeal_with_almond_milk__topped_with_bananas_and_chia_seeds_boiled_egg_breakfast,
        mealsName = "Oatmeal with Almond Milk, Bananas, and Chia Seeds",
        ingredients = "Cook oatmeal with almond milk. Top with sliced bananas, chia seeds, and a boiled egg on the side.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "280 Kcal",
        protein = "12g",
        carbs = "35g",
        fats = "8g"
    ),
    ten(
        mealsId = "MEAL-10",
        imageRes = R.drawable.tuna_omelette,
        mealsName = "Tuna Omelette",
        ingredients = "Whisk eggs and season with salt and pepper. Pour into a heated pan and cook until the edges set. Add canned tuna, fold the omelette, and cook until fully set. Serve with a side of vegetables.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "360 Kcal",
        protein = "30g",
        carbs = "20g",
        fats = "15g"
    ),
    eleven(
        mealsId = "MEAL-11",
        imageRes = R.drawable.scrambled_eggs_made_with_3_eggs_breakfast,
        mealsName = "Scrambled Eggs",
        ingredients = "Crack eggs into a bowl and whisk. Cook in a heated pan with a little butter. Stirring occasionally. Serve immediately with toast or vegetables.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "240 Kcal",
        protein = "18g",
        carbs = "12g",
        fats = "15g"
    ),
    twelve(
        mealsId = "MEAL-12",
        imageRes = R.drawable.tinolang_manok__chicken_stew__breakfast,
        mealsName = "Chicken Tinola",
        ingredients = "Sauté garlic, onion, and ginger. Add chicken and cook until browned. Pour in water, bring to a boil, then simmer until chicken is tender. Add sayote and spinach, and season with fish sauce. Serve with rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "320 Kcal",
        protein = "28g",
        carbs = "24g",
        fats = "10g"
    )
    ,


    /********************************************************
     *  meals prep for [LUNCH]
     ********************************************************
     *  **/
    TUNAPANDESAL(
        mealsId = "MEALSINTERMEDIATE-01",
        imageRes = R.drawable.tuna_pandesal,
        mealsName = "Tuna Pandesal",
        ingredients = "Mix canned tuna with mayonnaise and season with salt and pepper. Spread the tuna mixture onto pandesal. And toast until golden brown.",
        mealTime = MealTime.LUNCH.label,
        calories = "59 Kcal",
        protein = "15g",
        fats = "10g",
        carbs = "40g"
    ),
    SINIGANG(
        mealsId = "MEALSINTERMEDIATE-02",
        imageRes = R.drawable.grilled_tilapia,
        mealsName = "Sinigang na Beef",
        ingredients = "Boil beef short ribs with onions, tomatoes, and radish. Add tamarind paste and simmer until the meat is tender. Add kangkong and string beans before serving.",
        mealTime = MealTime.LUNCH.label,
        calories = "189 Kcal",
        protein = "26g",
        fats = "15g",
        carbs = "23g"
    ),
    ADobo(
        mealsId = "MEALSINTERMEDIATE-03",
        imageRes = R.drawable.chicken_adobo,
        mealsName = "Adobo with Rice",
        ingredients = "Marinate chicken in soy sauce, vinegar, garlic, and bay leaves for at least an hour. Simmer until cooked through. Then serve with steamed rice.",
        mealTime = MealTime.LUNCH.label,
        calories = "170 Kcal",
        protein = "30g",
        fats = "25g",
        carbs = "55g"
    ),
    CHICKENINSAL(
        mealsId = "MEALSINTERMEDIATE-04",
        imageRes = R.drawable.chicken_inasal,
        mealsName = "Chicken Inasal",
        ingredients = "Marinate chicken in a mixture of vinegar, garlic, ginger, lemongrass, and annatto oil. Grill over charcoal until crispy.",
        mealTime = MealTime.LUNCH.label,
        calories = "125 Kcal",
        protein = "35g",
        fats = "15g",
        carbs = "50g"
    ),
    CHICKENTOCINO(
        mealsId = "MEALSINTERMEDIATE-05",
        imageRes = R.drawable.chikentocino,
        mealsName = "Chicken Tocino",
        ingredients = "Marinate chicken in a mixture of sugar, soy sauce, garlic, and salt. Fry until golden brown. Serve with rice.",
        mealTime = MealTime.LUNCH.label,
        calories = "150 Kcal",
        protein = "15g",
        fats = "15g",
        carbs = "50g"
    ),
    CHICKENTINOLA(
        mealsId = "MEALSINTERMEDIATE-06",
        imageRes = R.drawable.chickentinola,
        mealsName = "Chicken Tinola",
        ingredients = "Boil chicken with ginger, garlic, and onion. Add green papaya and chili leaves.Simmer until the chicken is tender.",
        mealTime = MealTime.LUNCH.label,
        calories = "188 Kcal",
        protein = "21g",
        fats = "8g",
        carbs = "7g"
    ),
    SINIGANGNAPORK(
        mealsId = "MEALSINTERMEDIATE-07",
        imageRes = R.drawable.sinigangpork,
        mealsName = "Sinigang na Pork",
        ingredients = "Simmer pork belly with onions, tomatoes, and tamarind paste until tender. Add kangkong and string beans. Serve with hot rice",
        mealTime = MealTime.LUNCH.label,
        calories = "140 Kcal",
        protein = "30g",
        fats = "25g",
        carbs = "55g"
    ),
    BISTEK(
        mealsId = "MEALSINTERMEDIATE-08",
        imageRes = R.drawable.bistek_tagalog,
        mealsName = "Bistek Tagalog",
        ingredients = "Marinate beef in soy sauce, lemon juice, garlic, and onions. Pan-fry the beef until tender. Top with caramelized onions.",
        mealTime = MealTime.LUNCH.label,
        calories = "125 Kcal",
        protein = "30g",
        fats = "25g",
        carbs = "55g"
    ),
    CHICKENCALDS(
        mealsId = "MEALSINTERMEDIATE-09",
        imageRes = R.drawable.chicken_caldereta,
        mealsName = "Chicken Caldereta",
        ingredients = "Cook chicken with tomato sauce, potatoes, carrots, and bell peppers. Simmer until the chicken is tender and the sauce thickens.",
        mealTime = MealTime.LUNCH.label,
        calories = "113 Kcal",
        protein = "30g",
        fats = "25g",
        carbs = "55g"
    ),
    BANGUSBELLY(
        mealsId = "MEALSINTERMEDIATE-10",
        imageRes = R.drawable.bangus_belly,
        mealsName = "Bangus Belly",
        ingredients = "Season bangus belly with salt and pepper. Grill until crispy and cooked through. Serve it with Rice!",
        mealTime = MealTime.LUNCH.label,
        calories = "150 Kcal",
        protein = "23g",
        fats = "0g",
        carbs = "0g"
    ),

    /********************************************************
     *  meals prep for [DINNER]
     ********************************************************
     *  **/
    // for dinner (15)
    dawd(
        mealsId = "1",
        imageRes = R.drawable.tuna_omelette,
        mealsName = "Tuna Omelette",
        ingredients = "Beat eggs and mix with canned tuna. Pour into a hot greased pan and cook until the omelette is set. Flip the omelette and cook for another 2 minutes. Serve hot.",
        mealTime = MealTime.DINNER.label,
        calories = "350 Kcal",
        protein = "30g",
        carbs = "10g",
        fats = "22g"
    ),

    tawdawwo(
        mealsId = "2",
        imageRes = R.drawable.grilled_bangus_dinner,
        mealsName = "Grilled Bangus",
        ingredients = "Marinate bangus with soy sauce, calamansi, garlic, and pepper. Grill until cooked through and slightly charred. Serve with steamed rice and a side of vegetables.",
        mealTime = MealTime.DINNER.label,
        calories = "340 Kcal",
        protein = "30g",
        carbs = "0g",
        fats = "0g"
    ),

    wda(
        mealsId = "3",
        imageRes = R.drawable.chicken_caldereta_dinner,
        mealsName = "Chicken Caldereta",
        ingredients = "Sear chicken pieces in hot oil until golden brown. Add onions, garlic, and tomatoes, cook until soft. Pour in tomato sauce and simmer. Add potatoes, carrots, and bell peppers. Season with salt, pepper. And simmer until vegetables are tender.",
        mealTime = MealTime.DINNER.label,
        calories = "330 Kcal",
        protein = "28g",
        carbs = "8g",
        fats = "20g"
    ),

    fowdaur(
        mealsId = "4",
        imageRes = R.drawable.pork_nilaga_with_cucumber_dinner,
        mealsName = "Pork Nilaga with Cucumber",
        ingredients = "Boil pork in water with garlic, onions, and peppercorns. Add potatoes and corn, and cook until tender. Add cucumber slices in the final stages. Serve hot with steamed rice.",
        mealTime = MealTime.DINNER.label,
        calories = "340 Kcal",
        protein = "30g",
        carbs = "10g",
        fats = "20g"
    ),

    fivawdwae(
        mealsId = "5",
        imageRes = R.drawable.pork_binagoongan_dinner,
        mealsName = "Pork Binagoongan",
        ingredients = "Sauté garlic, onions, and shrimp paste in oil. Add pork and cook until browned. Pour in coconut milk and simmer until pork is tender. Serve with rice.",
        mealTime = MealTime.DINNER.label,
        calories = "320 Kcal",
        protein = "30g",
        carbs = "7g",
        fats = "18g"
    ),

    siawdx(
        mealsId = "6",
        imageRes = R.drawable.pinakbet_dinner,
        mealsName = "Pinakbet",
        ingredients = "Sauté garlic, onions, and tomatoes in oil.  Add pork or shrimp and cook until browned. Add vegetables like squash, eggplant, string beans, and okra.  Simmer until vegetables are tender. 5. Serve hot.",
        mealTime = MealTime.DINNER.label,
        calories = "310 Kcal",
        protein = "48g",
        carbs = "9g",
        fats = "17g"
    ),

    sewadven(
        mealsId = "7",
        imageRes = R.drawable.tuna_omellete_with_mango_dinner,
        mealsName = "Tuna Omelette with Mango",
        ingredients = "Beat eggs and mix with canned tuna.  Pour into a hot greased pan and cook until the omelette is set. Flip the omelette and cook for another 2 minutes.  Serve with fresh mango slices.",
        mealTime = MealTime.DINNER.label,
        calories = "310 Kcal",
        protein = "29g",
        carbs = "8g",
        fats = "19g"
    ),

    eiwdght(
        mealsId = "8",
        imageRes = R.drawable.grilled_tilapia_dinner,
        mealsName = "Grilled Tilapia",
        ingredients = "Season tilapia with salt, pepper, and lemon juice. Grill for 4-5 minutes per side until cooked through.  Serve with steamed rice or a side salad.",
        mealTime = MealTime.DINNER.label,
        calories = "340 Kcal",
        protein = "38g",
        carbs = "10g",
        fats = "20g"
    ),

    niawdne(
        mealsId = "9",
        imageRes = R.drawable.chicken_tocino_dinner,
        mealsName = "Chicken Tocino",
        ingredients = "Marinate chicken with sugar, salt, garlic, vinegar, and pepper.  Fry the chicken in hot oil until golden brown and cooked through. Serve with rice.",
        mealTime = MealTime.DINNER.label,
        calories = "325 Kcal",
        protein = "28g",
        carbs = "8g",
        fats = "19g"
    ),

    teawdn(
        mealsId = "10",
        imageRes = R.drawable.chicken_adobo_dinner,
        mealsName = "Chicken Adobo",
        ingredients = "Marinate chicken in soy sauce, vinegar, garlic, and bay leaves. Simmer the chicken until tender. Serve with rice.",
        mealTime = MealTime.DINNER.label,
        calories = "330 Kcal",
        protein = "34g",
        carbs = "9g",
        fats = "18g"
    ),

    elawdeven(
        mealsId = "11",
        imageRes = R.drawable.arrozcaldo,
        mealsName = "Arrozcaldo",
        ingredients = "Sauté garlic, onions, and ginger in oil. Add rice and cook for 2 minutes.  Pour in chicken broth and simmer until rice is soft.. Add cooked chicken. Serve hot.",
        mealTime = MealTime.DINNER.label,
        calories = "340 Kcal",
        protein = "31g",
        carbs = "10g",
        fats = "19g"
    ),

    twawdelve(
        mealsId = "12",
        imageRes = R.drawable.bistek_tagalog,
        mealsName = "Bistek Tagalog",
        ingredients = "Marinate beef in soy sauce, lemon, garlic, and pepper. Sauté onions in oil until soft. Add beef and cook until browned. Simmer until tender. Serve with rice.",
        mealTime = MealTime.DINNER.label,
        calories = "335 Kcal",
        protein = "30g",
        carbs = "9g",
        fats = "18g"
    ),

    thiawdrteen(
        mealsId = "13",
        imageRes = R.drawable.egg_with_rice,
        mealsName = "Egg with Rice",
        ingredients = "Fry eggs to your desired doneness. Serve with steamed rice. A side of vegetables or pickles.",
        mealTime = MealTime.DINNER.label,
        calories = "320 Kcal",
        protein = "28g",
        carbs = "8g",
        fats = "18g"
    ),

    fouadwadrteen(
        mealsId = "14",
        imageRes = R.drawable.grilled_tilapia_w_spinach_dinner,
        mealsName = "Grilled Tilapia with Spinach",
        ingredients = "Season tilapia with salt, pepper, and lemon juice. Grill until cooked through. Sauté spinach with garlic in olive oil. Serve the fish over a bed of spinach.",
        mealTime = MealTime.DINNER.label,
        calories = "330 Kcal",
        protein = "32g",
        carbs = "10g",
        fats = "19g"
    ),

    fivwdeteen(
        mealsId = "15",
        imageRes = R.drawable.kare_kare,
        mealsName = "Kare-Kare",
        ingredients = "Boil oxtail and tripes until tender. Prepare peanut sauce with ground peanuts, annatto, and coconut milk. Combine meat with the peanut sauce and simmer. Serve with bagoong (fermented shrimp paste) and rice.",
        mealTime = MealTime.DINNER.label,
        calories = "325 Kcal",
        protein = "29g",
        carbs = "8g",
        fats = "19g"
    )
}


/********************************************************
 *  meals prep for [BodyFatLevel.NATURAL]
 ********************************************************
 *  **/
enum class MealsCategoriesForNatural(val mealsId: String,
                                     @DrawableRes val imageRes: Int,
                                     val mealsName: String,
                                     val ingredients: String,
                                     val mealTime: String,
                                     val fats: String,
                                     val protein: String,
                                     val carbs: String,
                                     val calories:  String){


    /********************************************************
     *  meals prep for [BREAKFAST]
     ********************************************************
     *  **/
    Tuna(
        mealsId = "TUNA-01",
        imageRes = R.drawable.chicken_tocino_breakfast,
        mealsName = "Chicken Tocino",
        ingredients = "Marinate chicken in a mixture of sugar, soy sauce, garlic, and salt. Fry until golden brown. Serve with rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "350Kcal",
        protein = "30g",
        carbs = "40g",
        fats = "15g"
    ),
    two(
        mealsId = "TUNA-02",
        imageRes = R.drawable.chickentinola_breakfast,
        mealsName = "Chicken Tinola",
        ingredients = "Boil chicken with ginger, garlic, and onion. Add green papaya and chili leaves. Simmer until the chicken is tender.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "400Kcal",
        protein = "35g",
        carbs = "45g",
        fats = "20g"
    ),
    three(
        mealsId = "TUNA-03",
        imageRes = R.drawable.inihawnababoybreakfast,
        mealsName = "Inihaw na Baboy",
        ingredients = "Marinate pork in soy sauce, vinegar, garlic, and calamansi juice. Grill over charcoal until cooked through.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "500Kcal",
        protein = "40g",
        carbs = "55g",
        fats = "25g"
    ),
    four(
        mealsId = "TUNA-04",
        imageRes = R.drawable.chicken_tocino_with_brown_rice_breakfast,
        mealsName = "Chicken Tocino with Brown Rice",
        ingredients = "Marinate chicken in sugar, soy sauce, and garlic. Fry until golden brown. Serve with brown rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "480Kcal",
        protein = "35g",
        carbs = "60g",
        fats = "18g"
    ),
    five(
        mealsId = "TUNA-05",
        imageRes = R.drawable.fish_escabeche_breakfast,
        mealsName = "Fish Escabeche",
        ingredients = "Fry fish fillets and then simmer in a mixture of vinegar, sugar, garlic, and onions. Serve with steamed rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "450Kcal",
        protein = "35g",
        carbs = "55g",
        fats = "20g"
    ),
    six(
        mealsId = "TUNA-06",
        imageRes = R.drawable.grilled_chicken_inasal__breakfast,
        mealsName = "Grilled Chicken Inasal",
        ingredients = "Marinate chicken in vinegar, garlic, ginger, and annatto oil. Grill over charcoal until crispy. Cooked through.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "370Kcal",
        protein = "40g",
        carbs = "50g",
        fats = "15g"
    ),
    seven(
        mealsId = "TUNA-07",
        imageRes = R.drawable.pandesal_spread_with_creamy_peanut_butter_breakfast,
        mealsName = "Pandesal with Creamy Peanut Butter",
        ingredients = "Spread creamy peanut butter on freshly baked pandesal. Serve with a hot drink.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "300Kcal",
        protein = "10g",
        carbs = "45g",
        fats = "12g"
    ),
    eight(
        mealsId = "TUNA-08",
        imageRes = R.drawable.paksiw_na_pata_breakfast,
        mealsName = "Paksiw na Pata",
        ingredients = "Simmer pork hock with vinegar, soy sauce, garlic. Add bay leaves until tender. Serve with rice.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "550Kcal",
        protein = "15g",
        carbs = "50g",
        fats = "30g"
    ),
    nine(
        mealsId = "TUNA-09",
        imageRes = R.drawable.oatmeal_with_almond_milk__topped_with_bananas_and_chia_seeds_boiled_egg_breakfast,
        mealsName = "Oatmeal with Almond Milk, Bananas, and Chia Seeds",
        ingredients = "Cook oatmeal with almond milk. Top with sliced bananas, chia seeds. Boiled egg for added protein.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "350Kcal",
        protein = "25g",
        carbs = "50g",
        fats = "12g"
    ),
    ten(
        mealsId = "TUNA-10",
        imageRes = R.drawable.tuna_omelette,
        mealsName = "Tuna Omelette",
        ingredients = "Whisk eggs with canned tuna, onions, and bell peppers. Fry in a pan until golden brown. Serve.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "400Kcal",
        protein = "30g",
        carbs = "20g",
        fats = "25g"
    ),
    eleven(
        mealsId = "TUNA-11",
        imageRes = R.drawable.scrambled_eggs_made_with_3_eggs_breakfast,
        mealsName = "Scrambled Eggs (3 Eggs)",
        ingredients = "Whisk eggs with salt and pepper. Then scramble in a pan until cooked to your desired consistency.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "330Kcal",
        protein = "24g",
        carbs = "5g",
        fats = "24g"
    ),
    twelve(
        mealsId = "TUNA-12",
        imageRes = R.drawable.tinolang_manok__chicken_stew__breakfast,
        mealsName = "Tinolang Manok",
        ingredients = "Boil chicken with ginger, garlic, and onion. Add green papaya and chili leaves. Then simmer until the chicken is tender.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "380Kcal",
        protein = "32g",
        carbs = "30g",
        fats = "15g"
    ),
    thirteen(
        mealsId = "TUNA-13",
        imageRes = R.drawable.sinigang_na_hipon_breakfast,
        mealsName = "Sinigang na Hipon",
        ingredients = "Boil shrimp with tomatoes, onions, and tamarind. Add vegetables like kangkong. String beans before serving.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "300Kcal",
        protein = "28g",
        carbs = "40g",
        fats = "10g"
    ),
    fourteen(
        mealsId = "TUNA-14",
        imageRes = R.drawable.tinola_with_malunggay__chicken_tinola__breakfast,
        mealsName = "Chicken Tinola with Malunggay",
        ingredients = "Boil chicken with ginger, garlic, and onion. Add malunggay leaves and green papaya. Simmer until cooked.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "350Kcal",
        protein = "30g",
        carbs = "35g",
        fats = "12g"
    ),
    fifteen(
        mealsId = "TUNA-15",
        imageRes = R.drawable.tuna_omelette,
        mealsName = "Tuna Omelette",
        ingredients = "Whisk eggs with canned tuna and vegetables. Fry in a pan until golden brown. Serve with a side of greens.",
        mealTime = MealTime.BREAKFAST.label,
        calories = "400Kcal",
        protein = "35g",
        carbs = "20g",
        fats = "25g"
    )
    ,
    /********************************************************
     *  meals prep for [LUNCH]
     ********************************************************
     *  **/
    TUNAOMELET(
        mealsId = "MEALSADVANCE-01",
        imageRes = R.drawable.tuna_omelette,
        mealsName = "Tuna Omelet",
        ingredients = "Whisk eggs with canned tuna, onions, and bell peppers. Fry in a pan until golden brown. Serve.",
        mealTime = MealTime.LUNCH.label,
        calories = "150Kcal",
        protein = "15g",
        fats = "10g",
        carbs = "40g"
    ),
    SINIGANG(
        mealsId = "MEALSADVANCE-02",
        imageRes = R.drawable.sinigang,
        mealsName = "Sinigang na Beef",
        ingredients = "Boil beef with tomatoes, onions, and tamarind. Add vegetables like kangkong. String beans before serving.",
        mealTime = MealTime.LUNCH.label,
        calories = "168Kcal",
        protein = "30g",
        fats = "25g",
        carbs = "55g"
    ),
    KAREKARE(
        mealsId = "MEALSADVANCE-04",
        imageRes = R.drawable.kare_kare,
        mealsName = "Kare-Kare",
        ingredients = "Cook oxtail, tripes, and vegetables like banana hearts and eggplant in a peanut sauce. Serve with bagoong (fermented shrimp paste) on the side.",
        mealTime = MealTime.LUNCH.label,
        calories = "183Kcal",
        protein = "35g",
        fats = "15g",
        carbs = "50g"
    ),
    CHICKENTOCINO(
        mealsId = "MEALSADVANCE-05",
        imageRes = R.drawable.chikentocino,
        mealsName = "Chicken Tocino",
        ingredients = "Marinate chicken in a mixture of sugar, soy sauce, garlic, and salt. Fry until golden brown. Serve with rice.",
        mealTime = MealTime.LUNCH.label,
        calories = "145Kcal",
        protein = "10g",
        fats = "15g",
        carbs = "10g"
    ),
    PORKMINUDO(
        mealsId = "MEALSADVANCE-06",
        imageRes = R.drawable.pork_menudo,
        mealsName = "Pork Menudo",
        ingredients = "Simmer pork with tomato sauce, potatoes, carrots, and bell peppers. Serve with rice.",
        mealTime = MealTime.LUNCH.label,
        calories = "132Kcal",
        protein = "21g",
        fats = "20g",
        carbs = "7g"
    ),
    SINIGANGNAPORK(
        mealsId = "MEALSADVANCE-07",
        imageRes = R.drawable.sinigangpork,
        mealsName = "Sinigang na Pork",
        ingredients = "Boil pork with tomatoes, onions, and tamarind. Add vegetables like kangkong. String beans before serving.",
        mealTime = MealTime.LUNCH.label,
        calories = "150 Kcal",
        protein = "30g",
        fats = "25g",
        carbs = "55g"
    ),
    BISTEK(
        mealsId = "MEALSADVANCE-08",
        imageRes = R.drawable.bistek_tagalog,
        mealsName = "Bistek Tagalog",
        ingredients = "Marinate beef in soy sauce, calamansi juice, and garlic. Fry the beef slices until tende. Serve with onions on top.",
        mealTime = MealTime.LUNCH.label,
        calories = "150 Kcal",
        protein = "30g",
        fats = "25g",
        carbs = "55g"
    ),
    LONGSILOG(
        mealsId = "MEALSADVANCE-09",
        imageRes = R.drawable.longsilog,
        mealsName = "Longganisa Itlog",
        ingredients = "Fry longganisa sausages and scramble eggs. Serve with garlic rice and a side of tomato slices.",
        mealTime = MealTime.LUNCH.label,
        calories = "145Kcal",
        protein = "30g",
        fats = "25g",
        carbs = "55g"
    ),
    SCRAMBLEEGGS(
        mealsId = "MEALSADVANCE-10",
        imageRes = R.drawable.scrambleeggs,
        mealsName = "Scramble Eggs",
        ingredients = "Whisk eggs with salt and pepper. Then scramble in a pan until cooked to your desired consistency.",
        mealTime = MealTime.LUNCH.label,
        calories = "120 Kcal",
        protein = "30g",
        fats = "25g",
        carbs = "55g"
    ),


    /********************************************************
     *  meals prep for [DINNER]
     ********************************************************
     *  **/
    // for dinner (15)
    dawd(
        mealsId = "1",
        imageRes = R.drawable.beef_caldereta_dinner,
        mealsName = "Beef Caldereta",
        ingredients = "Cook beef in a tomato-based sauce with carrots, potatoes, and bell peppers. Add liver spread. Simmer until tender.",
        mealTime = MealTime.DINNER.label,
        calories = "350 Kcal",
        protein = "35g",
        carbs = "59g",
        fats = "77g"
    ),
    tawdawwo(
        mealsId = "2",
        imageRes = R.drawable.chicken_adobo_dinner,
        mealsName = "Chicken Adobo",
        ingredients = "Simmer chicken in soy sauce, vinegar, garlic, bay leaves. Add peppercorns until tender.",
        mealTime = MealTime.DINNER.label,
        calories = "380 Kcal ",
        protein = "54g",
        carbs = "54g",
        fats = "54g"
    ),
    wda(
        mealsId = "3",
        imageRes = R.drawable.chicken_caldereta_dinner,
        mealsName = "Chicken Caldereta",
        ingredients = "Cook chicken in tomato sauce with potatoes, carrots, and bell peppers. Add liver spread.  Simmer until the chicken is tender.",
        mealTime = MealTime.DINNER.label,
        calories = "460 Kcal",
        protein = "6g",
        carbs = "4g",
        fats = "5g"
    ),
    fowdaur(
        mealsId = "4",
        imageRes = R.drawable.pinakbet_dinner,
        mealsName = "Pinakbet",
        ingredients = "Simmer mixed vegetables like eggplant, bitter melon, and squash with shrimp paste and pork. Add water and cook until tender.",
        mealTime = MealTime.DINNER.label,
        calories = "245 Kcal",
        protein = "54g",
        carbs = "5g",
        fats = "56g"
    ),
    fivawdwae(
        mealsId = "5",
        imageRes = R.drawable.chicken_caldereta_dinner,
        mealsName = "Chicken Caldereta",
        ingredients = "Cook chicken in a rich tomato sauce with carrots, potatoes, and bell peppers. Add liver spread. Simmer until the chicken is cooked through.",
        mealTime = MealTime.DINNER.label,
        calories = "400 Kcal",
        protein = "55g",
        carbs = "5g",
        fats = "65g"
    ),
    siawdx(
        mealsId = "6",
        imageRes = R.drawable.bangus_belly_sinigang_dinner,
        mealsName = "Bangus Belly Sinigang",
        ingredients = "Boil bangus belly with tomatoes, onions, and tamarind. Add vegetables like kangkong. String beans before serving.",
        mealTime = MealTime.DINNER.label,
        calories = "250 Kcal" ,
        protein = "54g",
        carbs = "45g",
        fats = "45g"
    ),
    sewadven(
        mealsId = "7",
        imageRes = R.drawable.grilled_bangus_dinner,
        mealsName = "Grilled Bangus",
        ingredients = "Season bangus with salt and pepper, then grill until cooked through. Serve with a side of dipping sauce.",
        mealTime = MealTime.DINNER.label,
        calories = "320 Kcal",
        protein = "56g",
        carbs = "65g",
        fats = "45g"
    ),
    eiwdght(
        mealsId = "8",
        imageRes = R.drawable.grilled_tilapia_w_spinach_dinner,
        mealsName = "Grilled Tilapia with Spinach",
        ingredients = "Grill tilapia until golden brown. Serve with sautéed spinach on the side.",
        mealTime = MealTime.DINNER.label,
        calories = "330 Kcal",
        protein = "65g",
        carbs = "56g",
        fats = "15g"
    ),
    niawdne(
        mealsId = "9",
        imageRes = R.drawable.pork_binagoongan_dinner,
        mealsName = "Pork Binagoongan",
        ingredients = "Cook pork in shrimp paste, garlic, onions, and tomatoes.Add chili peppers for extra spice. Simmer until the pork is tender.",
        mealTime = MealTime.DINNER.label,
        calories = "370 Kcal",
        protein = "34g",
        carbs = "34g",
        fats = "34g"
    ),
    teawdn(
        mealsId = "10",
        imageRes = R.drawable.chicken_tocino_dinner,
        mealsName = "Chicken Tocino",
        ingredients = "Marinate chicken in a mixture of sugar, soy sauce, garlic, and salt. Fry until golden brown. Serve with rice.",
        mealTime = MealTime.DINNER.label,
        calories = "340 Kcal",
        protein = "34g",
        carbs = "34g",
        fats = "34g"
    ),
    elawdeven(
        mealsId = "11",
        imageRes = R.drawable.tuna_omellete_with_mango_dinner,
        mealsName = "Tuna Omelette",
        ingredients = "Whisk eggs with canned tuna, onions, and bell peppers. Fry in a pan until golden brown. Serve with slices of mango.",
        mealTime = MealTime.DINNER.label,
        calories = "330 Kcal",
        protein = "34g",
        carbs = "34g",
        fats = "34g"
    ),
    twawdelve(
        mealsId = "12",
        imageRes = R.drawable.pandesal_with_peanut_and_papaya_dinner,
        mealsName = "Bread with Peanut Butter",
        ingredients = "Spread peanut butter on warm pandesal bread. Serve with fresh papaya slices on the side.",
        mealTime = MealTime.DINNER.label,
        calories = "350 Kcal",
        protein = "15g",
        carbs = "45g",
        fats = "20g"
    ),
    thiawdrteen(
        mealsId = "13",
        imageRes = R.drawable.tuna_pandesal_dinner,
        mealsName = "Tuna Pandesal",
        ingredients = "Fill pandesal rolls with a mixture of canned tuna, mayonnaise, and seasonings. Serve as a sandwich.",
        mealTime = MealTime.DINNER.label,
        calories = "400 Kcal",
        protein = "23g",
        carbs = "45g",
        fats = "20g"
    ),
    fouadwadrteen(
        mealsId = "14",
        imageRes = R.drawable.pork_nilaga_with_cucumber_dinner,
        mealsName = "Pork Nilaga with Cucumber",
        ingredients = "Boil pork with potatoes, corn, and cabbage until tender. Serve with fresh cucumber slices on the side.",
        mealTime = MealTime.DINNER.label,
        calories = "320 Kcal",
        protein = "34g",
        carbs = "52g",
        fats = "23g"
    ),
    fivwdeteen(
        mealsId = "15",
        imageRes = R.drawable.tuna__dinner,
        mealsName = "Tuna with Rice",
        ingredients = "Serve grilled or canned tuna over a bed of steamed rice. Add a side of steamed vegetables if desired.",
        mealTime = MealTime.DINNER.label,
        calories = "350",
        protein = "12g",
        carbs = "54g",
        fats = "23g"
    )

}