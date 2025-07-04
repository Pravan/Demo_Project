package com.example.genai_app


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.genai_app.ui.theme.Genai_appTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Genai_appTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                        Greeting(
                            name = "Android",
                            modifier = Modifier.padding(innerPadding)

                        )
                        Greeting(
                            name = "IOS",
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Genai_appTheme {
        Greeting("Android")
    }
}

