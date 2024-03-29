package com.example.composebasics.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Navy,
    onPrimary = Chartreuse,
    surface = Blue,
    onSurface = Navy
)

private val LightColorPalette = lightColors(
    primary = LightBlue,
    onPrimary = Navy,
    surface = Blue,
    onSurface = Color.White
)

@Composable
fun ComposeBasicsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}