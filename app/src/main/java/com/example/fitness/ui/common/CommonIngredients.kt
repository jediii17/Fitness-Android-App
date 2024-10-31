package com.example.fitness.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Composable
fun IngredientsDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    ingredients: List<String>,
    greenMain_light: Color
) {
    if (showDialog) {
        Dialog(onDismissRequest = onDismiss) {
            Surface(
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier.padding(16.dp),
                color = MaterialTheme.colorScheme.background
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Ingredients", style = MaterialTheme.typography.bodyLarge)

                    ingredients.forEach { ingredient ->
                        Text(text = "- $ingredient")
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = onDismiss,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .clip(RoundedCornerShape(80)),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = greenMain_light,
                            contentColor = Color.White
                        )
                    ) {
                        Text("Close")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun IngredientsDialogPreview() {
    IngredientsDialog(
        showDialog = true,
        onDismiss = {  },
        ingredients = listOf(
            "1 pound of chicken",
            "2 tablespoons soy sauce",
            "1/4 cup brown sugar",
            "3-4 cloves garlic",
            "Salt and pepper to taste"
        ),
        greenMain_light = Color(0xFF4CAF50)
    )
}
