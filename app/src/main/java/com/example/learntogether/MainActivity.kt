package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        titre = "Jetpack Compose tutorial",
                        description = "Jetpack Compose is a modern toolkit for building native Android UI. \n" +
                                "Compose simplifies and accelerates UI development on Android with less code, \n" +
                                "powerful tools, and intuitive Kotlin APIs.",
                        longtext = "In this tutorial, you build a simple UI component with declarative functions. \n" +
                                "You call Compose functions to say what elements you want and the Compose compiler does the rest. \n" +
                                "Compose is built around Composable functions. These functions let you define your app's UI programmatically \n" +
                                "because they let you describe how it should look and provide data dependencies, \n" +
                                "rather than focus on the process of the I's construction, such as initializing \n" +
                                "an element and then attaching it to a parent. \n" +
                                "To create a Composable function, you add the @Composable annotation to the function name."
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(titre: String, description: String, longtext: String, modifier: Modifier= Modifier) {
    Column {
        Text(
            text = titre,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = longtext,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun GreetingImage(titre: String, description: String, longtext: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
        )
        GreetingText(
                titre = titre,
                description = description,
                longtext = longtext
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LearnTogetherPreview() {
    LearnTogetherTheme {
        GreetingImage(
            titre = "Jetpack Compose tutorial",
            description = "Jetpack Compose is a modern toolkit for building native Android UI. \n" +
                    "Compose simplifies and accelerates UI development on Android with less code, \n" +
                    "powerful tools, and intuitive Kotlin APIs.",
            longtext = "In this tutorial, you build a simple UI component with declarative functions. \n" +
                    "You call Compose functions to say what elements you want and the Compose compiler does the rest. \n" +
                    "Compose is built around Composable functions. These functions let you define your app's UI programmatically \n" +
                    "because they let you describe how it should look and provide data dependencies, \n" +
                    "rather than focus on the process of the I's construction, such as initializing \n" +
                    "an element and then attaching it to a parent. \n" +
                    "To create a Composable function, you add the @Composable annotation to the function name."
        )
    }
}
