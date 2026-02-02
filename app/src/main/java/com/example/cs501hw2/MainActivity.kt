package com.example.cs501hw2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cs501hw2.ui.theme.CS501HW2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CS501HW2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DashboardScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun DashboardScreen(modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("Sadid Ethun and Saksham Goel") }
    Column(modifier = modifier) {
        Text("CS501 Dashboard")
        Greeting(name = name)
        FilledButton(onClick = {
            name = if (name == "Sadid Ethun and Saksham Goel") "CS501 Students" else "Sadid Ethun and Saksham Goel"
        })
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hello $name!", modifier = modifier)
}

@Composable
fun FilledButton(onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text("Press Me!")
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardPreview() {
    CS501HW2Theme {
        DashboardScreen()
    }
}