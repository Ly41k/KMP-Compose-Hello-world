package com.example.kmpcomposehelloworld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform