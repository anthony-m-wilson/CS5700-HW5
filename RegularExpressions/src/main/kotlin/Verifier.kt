package org.example

import org.example.password.PasswordInitial

class Verifier {
    fun verify(string: String, initial: State): Boolean {
        if (initial is PasswordInitial && string.length < 8) return false

        var state = initial
        string.forEach { state = state.next(it.toString()) }
        return state is Valid
    }
}