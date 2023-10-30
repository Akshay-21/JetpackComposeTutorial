package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting1("Android", "World")
                }
            }
        }
    }
}

@Composable
fun Greeting1(name: String, world: String, modifier: Modifier = Modifier) {
    Text(text = "Hello $name!", modifier = modifier)
    Text(text = world, color = Color.Red, fontSize = 30.sp)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview1() {
    ComposeTutorialTheme {
        Greeting1("Android", "World")
    }
}