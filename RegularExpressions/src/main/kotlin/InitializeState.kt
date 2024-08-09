package org.example

import org.example.binary.BinaryInitial
import org.example.email.EmailInitial
import org.example.integer.IntegerInitial
import org.example.floating.FloatingInitial
import org.example.password.PasswordInitial


class InitializeState {
    private val initializeState = mapOf(
        Pair("integer", IntegerInitial()),
        Pair("floating", FloatingInitial()),
        Pair("binary", BinaryInitial()),
        Pair("email", EmailInitial()),
        Pair("password", PasswordInitial())
    )

    fun createInitialState(type: String): State? {
        return initializeState[type]
    }
}