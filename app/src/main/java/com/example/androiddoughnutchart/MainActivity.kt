package com.example.androiddoughnutchart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddoughnutchart.ui.theme.AndroidDoughnutChartTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidDoughnutChartTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        Greeting()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Canvas(
        modifier = Modifier
            .size(100.dp)
            .padding(8.dp)
    ) {
        val path = Path().apply {
            moveTo(center.x, 0f)
            lineTo(size.width, size.height)
            lineTo(0f, size.height)
            lineTo(center.x, 0f)
            close()
        }

        drawPath(path = path, color = Color.Red, style = Stroke())
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidDoughnutChartTheme {
        Greeting()
    }
}