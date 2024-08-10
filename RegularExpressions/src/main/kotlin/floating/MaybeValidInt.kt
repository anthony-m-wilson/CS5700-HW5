package org.example.floating

import org.example.Invalid
import org.example.State

class MaybeValidInt : State {
    override fun next(char: String): State {
        if (char in "0123456789") return MaybeValidInt()
        if (char == ".") return MaybeValidPoint()
        return Invalid()
    }
}