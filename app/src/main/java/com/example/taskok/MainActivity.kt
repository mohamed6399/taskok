package com.example.taskok

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskok.ui.theme.TaskokTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskokTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        androidx.compose.foundation.layout.Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(4.dp) // Réduction de l'espace entre les Text
        ) {
            DisplayImage(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "All task completed",
                fontSize = 24.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
            )

            Text(
                text = "Nice work",
                fontSize = 16.sp,
            )
        }
    }
}



        @Preview(showBackground = true)
        @Composable
        fun GreetingPreview() {
            TaskokTheme {
                Greeting("Android")
            }
        }

        @Composable
        fun DisplayImage(modifier: Modifier = Modifier) {
            Box(
                modifier = modifier.fillMaxSize(),
                contentAlignment = Alignment.Center

                ) {
                Image(
                    painter = painterResource(id = R.drawable.taskok), // Assurez-vous que 'compose' est bien dans res/drawable
                    contentDescription = "My Image"
                )
            }
        }

        @Preview(showBackground = true)
        @Composable
        fun DisplayImagePreview() {
            DisplayImage()
        }



