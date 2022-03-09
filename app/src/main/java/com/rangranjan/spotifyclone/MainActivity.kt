package com.rangranjan.spotifyclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rangranjan.spotifyclone.navigation.DASHBOARD_ROUTE
import com.rangranjan.spotifyclone.ui.dashboard.DashboardScreen
import com.rangranjan.spotifyclone.ui.theme.SpotifyCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpotifyCloneTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = DASHBOARD_ROUTE
                ) {
                    composable(DASHBOARD_ROUTE) {
                        DashboardScreen(navController = navController)
                    }
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
    SpotifyCloneTheme {
        Greeting("Android")
    }
}