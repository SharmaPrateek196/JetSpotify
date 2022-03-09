package com.rangranjan.spotifyclone.ui.dashboard

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun DashboardScreen(navController: NavController) {
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) {

    }
}