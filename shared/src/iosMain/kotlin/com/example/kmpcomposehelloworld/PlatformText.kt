package com.example.kmpcomposehelloworld

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
internal actual fun PlatformText() {
    Text(
        text = Greeting().greet(),
        color = Color.Red,
        textAlign = TextAlign.Center,
        fontSize = 24.sp
    )
}
