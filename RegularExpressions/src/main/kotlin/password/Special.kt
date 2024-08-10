package org.example.password

import org.example.Invalid
import org.example.State

class Special : State {
    override fun next(char: String): State {
        if (char in "A".."Z") return PasswordValid()
        if (char in "a".."z") return Special()
        if (char in "!@#\$%&*") return Special()
        return Invalid()
    }
}