package com.example.kmpcomposehelloworld

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        val hello = MainRes.string.hello_word
        return "$hello,\n${platform.name}!"
    }
}