package org.example.binary

import org.example.Invalid
import org.example.State
import org.example.Valid

class BinaryValid : State, Valid {
    override fun next(char: String): State {
        if (char == "1") return BinaryValid()
        if (char == "0") return MaybeValid0()
        return Invalid()
    }
}