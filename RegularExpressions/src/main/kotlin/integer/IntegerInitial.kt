package org.example.integer

import org.example.Invalid
import org.example.State

class IntegerInitial : State {
    override fun next(char: String): State {
        return if (char in "123456789") {
            IntegerValid()
        } else {
            Invalid()
        }
    }

}