package org.example.password

import org.example.Invalid
import org.example.State

class PasswordInitial : State {
    override fun next(char: String): State {
        if (char in "A".."Z") return Capital()
        if (char in "a".."z") return Maybe()
        if (char in "1".."9") return Maybe()
        if (char in "!@#\$%&*;") return Special()
        return Invalid()
    }
}