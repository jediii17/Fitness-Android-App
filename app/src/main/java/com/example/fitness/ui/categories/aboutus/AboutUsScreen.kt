package com.example.fitness.ui.categories.aboutus

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.fitness.ui.common.CommonHeader
import com.example.fitness.util.defaultPadding

@Composable
fun AboutUsScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CommonHeader(
                modifier = Modifier
                    .fillMaxWidth()
                    .defaultPadding(),
                text = "About Us",
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Welcome to Precision & Wellness!",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Text(
                text = "We believe that health and fitness should be accessible to everyone. Our mission is to empower individuals to achieve their wellness goals, nutritional guidance, and motivational support—all offline and at your fingertips.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Text(
                text = "Our Features:",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Column(
                modifier = Modifier
                    .background(Color(0xFFF0F0F0), RoundedCornerShape(8.dp))
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(text = "• Filipino Foods", style = MaterialTheme.typography.bodyLarge)
                Text(text = "• Workout ", style = MaterialTheme.typography.bodyLarge)
                Text(text = "• Offline Accessibility", style = MaterialTheme.typography.bodyLarge)
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Join our vibrant community and embark on your fitness journey today! Together, we'll conquer challenges and achieve greatness!",
                style = MaterialTheme.typography.bodyLarge.copy(fontStyle = FontStyle.Italic, fontSize = 15 .sp),
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Text(
                text = "Precision & Wellness Team:",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Column(
                modifier = Modifier
                    .background(Color(0xFFF0F0F0), RoundedCornerShape(8.dp))
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(text = "• Cire Paul Cruz - Creator \n" +
                       " \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t•Lead Developer\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t•Back End Developer\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t•Front End Developer\n", style = MaterialTheme.typography.bodyLarge)
                Text(text = "• Riza Patrice Anciano - Documentation " +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSpecialist", style = MaterialTheme.typography.bodyLarge)
                Text(text = "• Trisha Rhinoa Caisip - Documentation " +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSpecialist", style = MaterialTheme.typography.bodyLarge)
                Text(text = "• Christian Elmo Layto - Documentation " +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSpecialist", style = MaterialTheme.typography.bodyLarge)
            }
        }
    }
}

@Preview(backgroundColor = 0xFFFFFFFF, showBackground = true)
@Composable
fun AboutUsScreenPreview() {
    AboutUsScreen(navController = rememberNavController())
}
