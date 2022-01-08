package com.himbrhms.runtracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.himbrhms.runtracker.view.theme.RunTrackerTheme
import com.himbrhms.runtracker.util.Logger
import com.himbrhms.runtracker.util.className

class MainActivity : ComponentActivity() {

    companion object {
        private val logger = Logger(this::class.className)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logger.info("onCreate")
        setContent {
            RunTrackerTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RunTrackerTheme {
        Greeting("Android")
    }
}