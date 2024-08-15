package com.example.containerexemple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.containerexemple.ui.theme.ContainerExempleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContainerExempleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ContainersExemple(padding = innerPadding)
                }
            }
        }
    }
}

@Composable
fun ContainersExemple(padding: PaddingValues) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            for (i in 0..1000) {
                Text(
                    text = "Teste $i",
                    fontSize = 18.sp,
                    color = Color.Blue,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ContainersExemplesPreview() {
    ContainersExemple(padding = PaddingValues())
}