package org.example.password

import org.example.Invalid
import org.example.State

class Capital : State {
    override fun next(char: String): State {
        if (char in "!@#\$%&*") return SpecialEnding()
        if (char in "A".."Z") return Capital()
        if (char in "a".."z") return Capital()
        return Invalid()
    }
}