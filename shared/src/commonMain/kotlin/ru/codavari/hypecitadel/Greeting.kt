package ru.codavari.hypecitadel

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}