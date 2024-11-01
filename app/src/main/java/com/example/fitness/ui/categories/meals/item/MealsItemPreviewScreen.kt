import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.fitness.R
import com.example.fitness.ui.common.DialogSuccess
import com.example.fitness.ui.common.PrimaryButton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun MealsItemPreviewScreen(navController: NavHostController) {
    var isDialogOpen by remember { mutableStateOf(false) }
    var selectedMeal by remember { mutableStateOf("Breakfast") }
    var showFinishedDialog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Meal Plan",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.Black,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = "Stay motivated on your journey to be healthier.",
            style = MaterialTheme.typography.bodySmall,
            color = Color.Gray,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(80.dp))

        Text(
            text = "Day 1",
            style = MaterialTheme.typography.displayLarge,
            color = Color.Black,
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            TabButton("Breakfast", selectedMeal == "Breakfast") { selectedMeal = "Breakfast" }
            TabButton("Lunch", selectedMeal == "Lunch") { selectedMeal = "Lunch" }
            TabButton("Dinner", selectedMeal == "Dinner") { selectedMeal = "Dinner" }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .clip(RoundedCornerShape(20.dp))
                .clickable { isDialogOpen = true }
        ) {
            Image(
                painter = painterResource(id = R.drawable.chickentinola),
                contentDescription = "Meal Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.6f))
                        )
                    )
                    .fillMaxWidth()
                    .padding(12.dp)
            ) {
                Text(
                    "Chicken Tinola with Rice",
                    color = Color.White,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    "High in protein",
                    color = Color.White,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            NutritionInfo("300", "Calories")
            NutritionInfo("15g", "Protein")
            NutritionInfo("40g", "Carbs")
            NutritionInfo("4g", "Fats")
        }

        if (isDialogOpen) {
            AlertDialog(
                onDismissRequest = { isDialogOpen = false },
                confirmButton = {
                    Button(onClick = { isDialogOpen = false }) {
                        Text("Close")
                    }
                },
                text = {
                    Column {
                        Text("Ingredients")
                        Text("- Chicken")
                        Text("- Ginger")
                        Text("- Green Papaya")
                        Text("- Spinach")
                    }
                }
            )
        }

        Spacer(Modifier.height(20.dp))

        NavigationOptions(
            isLastMeal = selectedMeal == "Dinner",
            onMealFinishedClick = { showFinishedDialog = true },
            onDoneClick = { navController.popBackStack() }
        )

        if (showFinishedDialog) {
            DialogSuccess(
                modifier = Modifier.fillMaxSize(),
                icon = R.drawable.ic_success,
                text = "Good job!",
                buttonText = "OKAY"
            ) {
                showFinishedDialog = false
                CoroutineScope(Dispatchers.IO).launch {
                }
                navController.popBackStack()
            }
        }
    }
}

@Composable
fun NavigationOptions(
    isLastMeal: Boolean,
    onMealFinishedClick: () -> Unit,
    onDoneClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 28.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        PrimaryButton(
            iconSuffix = if (isLastMeal) R.drawable.ic_flag else R.drawable.ic_check,
            text = if (isLastMeal) "FINISH MEAL PREP" else "DONE",
            onClick = { if (isLastMeal) onMealFinishedClick() else onDoneClick() }
        )
    }
}

@Composable
fun TabButton(text: String, isSelected: Boolean, onClick: () -> Unit) {
    Text(
        text = text,
        color = if (isSelected) Color.White else Color.Black,
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier
            .background(
                color = if (isSelected) Color(0xFF2A9D8F) else Color.LightGray,
                shape = RoundedCornerShape(20.dp)
            )
            .clickable { onClick() }
            .padding(horizontal = 20.dp, vertical = 10.dp)
    )
}

@Composable
fun NutritionInfo(value: String, label: String) {
    Box(
        modifier = Modifier
            .size(65.dp)
            .clip(CircleShape)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(value, style = MaterialTheme.typography.titleLarge, color = Color.Black)
            Text(label, style = MaterialTheme.typography.labelSmall)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MealsItemPreviewScreenPreview() {
    val navController = rememberNavController()
    MealsItemPreviewScreen(navController)
}
