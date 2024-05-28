package com.example.getfitapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import com.example.getfit.ui.themes.AppTypography

private val LightColors = lightColorScheme(
    primary = LightBlue500,
    onPrimary = White,
    primaryContainer = LightBlue700,
    onPrimaryContainer = White,
    secondary = Green500,
    onSecondary = White,
    secondaryContainer = Green300,
    onSecondaryContainer = DarkGrey,
    background = LightGrey,
    onBackground = DarkGrey,
    surface = White,
    onSurface = DarkGrey,
    error = Red,
    onError = White
)

private val DarkColors = darkColorScheme(
    primary = LightBlue700,
    onPrimary = White,
    primaryContainer = LightBlue500,
    onPrimaryContainer = DarkGrey,
    secondary = Green300,
    onSecondary = DarkGrey,
    secondaryContainer = Green500,
    onSecondaryContainer = White,
    background = DarkGrey,
    onBackground = LightGrey,
    surface = DarkGrey,
    onSurface = LightGrey,
    error = Red,
    onError = DarkGrey
)

@Composable
fun GetFitAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColors
    } else {
        LightColors
    }

    MaterialTheme(
        colorScheme = colors,
        typography = AppTypography,
        content = content
    )
}
