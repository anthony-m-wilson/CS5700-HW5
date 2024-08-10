package org.example.password

import org.example.Invalid
import org.example.State

class Maybe : State {
    override fun next(char: String): State {
        if (char in "A".."Z") return Capital()
        if (char in "a".."z") return Maybe()
        if (char in "!@#\$%&*") return Special()
        return Invalid()
    }
}