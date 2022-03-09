package com.rangranjan.spotifyclone.ui.dashboard

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(navController: NavController) {
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.background
    ) {
        val currentBackstackEntry by navController.currentBackStackEntryAsState()


        bottomBarScreensList.forEach { screen ->
            AddBottomNavigationItem(screen, currentBackstackEntry)
        }
    }
}

@Composable
fun RowScope.AddBottomNavigationItem(
    screen: BottomBarScreens,
    currentBackstackEntry: NavBackStackEntry?
) {
    BottomNavigationItem(
        onClick = {},
        alwaysShowLabel = false,
        icon = { BottomNavigationIcon(screen.icon) },
        label = { BottomNavigationLabel(label = screen.label) },
        selected = currentBackstackEntry?.destination?.hierarchy?.any{ it.route == screen.route } == true
    )
}

@Composable
fun BottomNavigationIcon(icon: ImageVector) {
    Icon(imageVector = icon, contentDescription = "bottom_icon")
}

@Composable
fun BottomNavigationLabel(label: String) {
    Text(text = label)
}