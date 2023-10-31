package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

    Row(modifier = Modifier.padding(8.dp)){
        AsyncImage(model = ("https://developer.android.com/static/images/jetpack/compose-tutorial/profile_picture.png"),
            contentDescription = "Contact Profile Picture",
            modifier = Modifier
                // Setting image size to 40 dp
                .size(40.dp)
                // Clip image to be shaped as a circle
                .clip(CircleShape))

        // Added a horizontal space between the image and the column
        Spacer(modifier = Modifier.width(8.dp))
        
        Column {
            Text(text = msg.author)

            // Added a vertical space between the author and message texts
            Spacer(modifier = Modifier.height(4.dp))
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