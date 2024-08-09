package org.example.integer

import org.example.Invalid
import org.example.State
import org.example.Valid

class IntegerValid : State, Valid {
    override fun next(char: String): State {
        return if (char in "0123456789") IntegerValid() else Invalid()
    }
}