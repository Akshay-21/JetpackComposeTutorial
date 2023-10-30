package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Text(text = "Hello World!!!")
            MessageCard(Message("Android", "Jetpack Compose"))
        }
    }
}

@Composable
fun MessageCard(msg:Message) {

    Row{
        AsyncImage(model = ("https://developer.android.com/static/images/jetpack/compose-tutorial/profile_picture.png"),
            contentDescription = "Contact Profile Picture")

        Column {
            Text(text = msg.author)
            Text(text = msg.body)
        }
    }
}

@Preview
@Composable
fun ShowPreviewMessageCard() {
    MessageCard(Message("Lexi", "Hey, take a look at jetpack compose, it's great"))
}


data class Message(val author: String, val body: String)