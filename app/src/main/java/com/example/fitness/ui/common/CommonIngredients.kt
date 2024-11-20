package com.example.fitness.ui.common

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.fitness.R
import com.example.fitness.ui.theme.MyColorTheme.gradientGray01

import androidx.compose.foundation.Image
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource

@Composable
fun IngredientsDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    ingredients: List<String>,
    greenMain_light: Color,
    imageRes: Int? = null
) {
    if (showDialog) {
        Dialog(onDismissRequest = onDismiss) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .wrapContentHeight()
                    .clip(RoundedCornerShape(16.dp)),
                color = MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(16.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {

                    if (imageRes != null) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                                .clip(RoundedCornerShape(100.dp))
                        ) {
                            Image(
                                painter = painterResource(id = imageRes),
                                contentDescription = "Dish Image",
                                modifier = Modifier.fillMaxSize()
                            )
                        }

                        Spacer(modifier = Modifier.height(16.dp))
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .verticalScroll(rememberScrollState())
                    ) {
                        Text(
                            text = "Ingredients",
                            style = MaterialTheme.typography.headlineSmall.copy(
                                fontSize = 20.sp,
                                fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                            ),
                            color = greenMain_light,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(1.dp)
                                .background(
                                    color = Color(0xFFF1F1F1),
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .shadow(8.dp, shape = RoundedCornerShape(16.dp))

                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        ingredients.forEach { ingredient ->
                            Text(
                                text = "- $ingredient",
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier.padding(vertical = 4.dp),
                                color = gradientGray01

                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = onDismiss,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp)
                            .clip(RoundedCornerShape(15)),
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
        onDismiss = { },
        ingredients = listOf(
            "1 pound of chicken",
            "2 tablespoons soy sauce",
            "1/4 cup brown sugar",
            "3-4 cloves garlic",
            "Salt and pepper to taste"
        ),
        greenMain_light = Color(0xFF4CAF50),
        imageRes = R.drawable.kare_kare // Pass your drawable resource
    )
}

