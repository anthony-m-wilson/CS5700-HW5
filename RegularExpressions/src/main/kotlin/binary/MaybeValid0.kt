package org.example.binary

import org.example.Invalid
import org.example.State

class MaybeValid0 : State {
    override fun next(char: String): State {
        if (char == "1") return BinaryValid()
        if (char == "0") return MaybeValid0()
        return Invalid()
    }
}