package com.example.kmpcomposehelloworld

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
internal actual fun PlatformText() {
    Text(text = Greeting().greet(), color = Color.Red)
}
