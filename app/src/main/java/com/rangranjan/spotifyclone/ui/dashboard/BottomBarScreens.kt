package com.rangranjan.spotifyclone.ui.dashboard

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import com.rangranjan.spotifyclone.navigation.HOME_GRAPH_ROUTE
import com.rangranjan.spotifyclone.navigation.LIBRARY_GRAPH_ROUTE
import com.rangranjan.spotifyclone.navigation.PREMIUM_GRAPH_ROUTE
import com.rangranjan.spotifyclone.navigation.SEARCH_GRAPH_ROUTE

// labels
const val HOME_LABEL = "Home"
const val Search_LABEL = "Search"
const val Library_LABEL = "Library"
const val Premium_LABEL = "Premium"

val bottomBarScreensList = listOf(
    BottomBarScreens.Home,
    BottomBarScreens.Search,
    BottomBarScreens.Library,
    BottomBarScreens.Premium
)

sealed class BottomBarScreens(val route: String, val icon: ImageVector, val label: String) {
    object Home: BottomBarScreens(HOME_GRAPH_ROUTE, Icons.Default.Home, HOME_LABEL)
    object Search: BottomBarScreens(SEARCH_GRAPH_ROUTE, Icons.Default.Search, Search_LABEL)
    object Library: BottomBarScreens(LIBRARY_GRAPH_ROUTE, Icons.Default.Star, Library_LABEL)
    object Premium: BottomBarScreens(PREMIUM_GRAPH_ROUTE, Icons.Default.ShoppingCart, Premium_LABEL)
}