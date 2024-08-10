package org.example.floating

import org.example.Invalid
import org.example.State

class MaybeValid0 : State {
    override fun next(char: String): State {
        if (char == ".") return MaybeValidPoint()
        return Invalid()
    }
}