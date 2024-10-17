package com.example.fitness.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitness.R
import com.example.fitness.ui.theme.greenMain_light

@Composable
fun DialogSuccess(modifier: Modifier = Modifier, text: String = "Updated successfully ", buttonText: String = "OKAY",  onclick: () -> Unit) {
    Box(modifier = modifier
        .fillMaxSize()
        .background(Color.Gray.copy(0.3f))){
        Column(
            modifier = Modifier
                .fillMaxWidth(.99f)
                .padding(horizontal = 16.dp)
                .align(Alignment.Center)
                .background(
                    Color.White, RoundedCornerShape(20.dp)
                )
                .border(
                    1.dp, Color(0xFFBDBDBD),
                    RoundedCornerShape(20.dp)
                )
                .clip(RoundedCornerShape(10.dp))
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.goals),
                contentDescription = "Login Image",
                modifier = Modifier.size(110.dp)
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                fontWeight = FontWeight.Normal,
                text = text,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
            )
            Button(
                onClick = onclick,
                colors = ButtonDefaults.buttonColors(
                    containerColor = greenMain_light,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp)
                    .padding(16.dp),
            ){
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    fontWeight = FontWeight.Normal,
                    text = buttonText,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}