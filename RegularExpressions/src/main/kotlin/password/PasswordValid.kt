package org.example.password

import org.example.Invalid
import org.example.State
import org.example.Valid

class PasswordValid : State, Valid {
    override fun next(char: String): State {
        if (char in "A".."Z") return PasswordValid()
        if (char in "a".."z") return PasswordValid()
        if (char in "1".."9") return PasswordValid()
        if (char in "!@#\$%&*;") return SpecialEnding()
        return Invalid()
    }
}