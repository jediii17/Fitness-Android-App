package com.example.fitness.ui.common

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.fitness.R

import androidx.compose.foundation.Image
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import com.example.fitness.ui.theme.MyColorTheme.gradientGray01

@Composable
fun IngredientsDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    ingredients: String,
    greenMainLight: Color,
    imageRes: Int? = null
) {
    if (showDialog) {
        Dialog(onDismissRequest = onDismiss) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .wrapContentHeight()
                    .clip(RoundedCornerShape(16.dp))
                    .shadow(8.dp, RoundedCornerShape(25.dp)),
                color = MaterialTheme.colorScheme.background
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {

                        if (imageRes != null) {
                            Image(
                                painter = painterResource(id = imageRes),
                                contentDescription = "Dish Image",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp)
                                    .clip(RoundedCornerShape(16.dp))
                                    .shadow(8.dp, RoundedCornerShape(16.dp))
                                    .padding(bottom = 8.dp)
                            )
                        }

                        // Dialog title
                        Text(
                            text = "How to Cook",
                            style = MaterialTheme.typography.headlineSmall.copy(
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = greenMainLight
                            ),
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp)
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        // Ingredients list inside a scrollable column
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f) // Allows the list to expand and become scrollable
                                .verticalScroll(rememberScrollState())
                                .padding(horizontal = 8.dp)
                        ) {
                            val numberedIngredients = ingredients.split(". ")
                            Column {
                                numberedIngredients.forEachIndexed { index, ingredient ->
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(vertical = 4.dp)
                                            .background(
                                                Color(0xFFF9F9F9),
                                                shape = RoundedCornerShape(8.dp)
                                            )
                                            .padding(12.dp)
                                    ) {
                                        Text(
                                            text = "${index + 1}.",
                                            style = MaterialTheme.typography.bodyMedium.copy(
                                                fontSize = 15.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = greenMainLight
                                            ),
                                            modifier = Modifier.padding(end = 8.dp)
                                        )
                                        Text(
                                            text = ingredient,
                                            style = MaterialTheme.typography.bodyMedium.copy(
                                                fontSize = 15.sp,
                                                lineHeight = 20.sp,
                                                color = gradientGray01
                                            )
                                        )
                                    }
                                }
                            }
                        }
                    }
                        Button(
                            onClick = onDismiss,
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)
                                .padding(16.dp)
                                .height(50.dp),
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = greenMainLight,
                                contentColor = Color.White
                            ),
                            elevation = ButtonDefaults.buttonElevation(8.dp)
                        ) {
                            Text(
                                "Close",
                                style = MaterialTheme.typography.labelLarge.copy(
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            )
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
        ingredients = "Brown the beef in a pot. Add tomato sauce and vegetables. Simmer until tender.",
        greenMainLight = Color(0xFF4CAF50),
        imageRes = R.drawable.kare_kare
    )
}