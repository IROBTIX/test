package com.example.mylibrary

import android.util.Log

/**
 * Created by Alexandra Tirlea on 15.07.2025.
 * Raiffeisen Bank RO
 */
class MyLibrary {
    private fun getGreeting(): String {
        return "Hello from MyLibrary!"
    }

    private fun veryLongMethod(
        a: String? = null,
        b: String? = null,
        c: String? = null,
        d: String? = null,
        e: String? = null,
        f: String? = null,
        g: String? = null,
        h: String? = null,
        i: String? = null,
        j: String? = null,
    ) {

        Log.e("X_TAG", "msg")
    }

    fun main() {
        val myLibrary = MyLibrary()
        veryLongMethod()
        println(myLibrary.getGreeting())
    }
}
