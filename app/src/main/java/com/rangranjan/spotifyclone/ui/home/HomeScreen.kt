package com.rangranjan.spotifyclone.ui.home

import android.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.rangranjan.spotifyclone.core.Heading1
import com.rangranjan.spotifyclone.core.TopBarIcon
import com.rangranjan.spotifyclone.ui.theme.SpotifyCloneTheme

@Composable
fun HomeScreen() {
    SpotifyCloneTheme() {
        Surface(color = MaterialTheme.colors.surface) {
            Column(Modifier.fillMaxWidth()) {
                HomeScreenTopBar()
            }
        }
    }
}

@Composable
fun HomeScreenTopBar() {
    SpotifyCloneTheme {
        Surface(color = MaterialTheme.colors.surface) {
            ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
                val (heading, settings, history, notification) = createRefs()

                Heading1(
                    text = "Good evening",
                    modifier = Modifier.constrainAs(heading) {
                        start.linkTo(parent.start, margin = 16.dp)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    }
                )

                TopBarIcon(
                    label = "Notifications",
                    icon = Icons.Outlined.Notifications,
                    onClick = {},
                    modifier = Modifier.constrainAs(notification) {
                        end.linkTo(history.start)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    }
                )

                TopBarIcon(
                    label = "History",
                    icon = Icons.Outlined.AccountCircle,
                    onClick = {},
                    modifier = Modifier.constrainAs(history) {
                        end.linkTo(settings.start)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    }
                )

                TopBarIcon(
                    label = "Settings",
                    icon = Icons.Outlined.Settings,
                    onClick = {},
                    modifier = Modifier.constrainAs(settings) {
                        end.linkTo(parent.end)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenTopBarPrev() {
    HomeScreenTopBar()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPrev() {
    HomeScreen()
}