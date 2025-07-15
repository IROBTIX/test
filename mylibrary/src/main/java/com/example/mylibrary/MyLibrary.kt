package com.example.mylibrary

import java.util.Currency // unused import
/**
 * Created by Alexandra Tirlea on 15.07.2025.
 * Raiffeisen Bank RO
 */
class MyLibrary {
    private fun getGreeting(): String {
        return "Hello from MyLibrary!"
    }

    fun main() {
        val myLibrary = MyLibrary()
        println(myLibrary.getGreeting())
    }
}
