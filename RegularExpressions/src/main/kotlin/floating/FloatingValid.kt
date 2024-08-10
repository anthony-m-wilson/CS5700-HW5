package org.example.floating

import org.example.Invalid
import org.example.State
import org.example.Valid

class FloatingValid : State, Valid {
    override fun next(char: String): State {
        if (char in "0123456789") return FloatingValid()
        return Invalid()
    }
}