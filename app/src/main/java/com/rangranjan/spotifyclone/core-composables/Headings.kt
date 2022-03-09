package com.rangranjan.spotifyclone.core

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun Heading1(
    text: String,
    color: Color
) {
    Text(
        text = text,
        color = color,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    )
}

@Preview(showBackground = true)
@Composable
fun Heading1Prev() {
    Heading1(text = "Heading one", color = Color.Black)
}

@Composable
fun Heading2(
    text: String,
    color: Color
) {
    Text(
        text = text,
        color = color,
        fontSize = 8.sp,
        fontWeight = FontWeight.Normal
    )
}

@Preview(showBackground = true)
@Composable
fun Heading2Prev() {
    Heading2(text = "Heading two", color = Color.Black)
}

@Composable
fun Subtitle(
    text: String,
    color: Color
) {
    Text(
        text = text,
        color = color,
        fontSize = 8.sp,
        fontWeight = FontWeight.ExtraLight
    )
}

@Preview(showBackground = true)
@Composable
fun SubtitlePrev() {
    Subtitle(text = "Subtitle", color = Color.DarkGray)
}

