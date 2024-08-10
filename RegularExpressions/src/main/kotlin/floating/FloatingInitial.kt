package org.example.floating

import org.example.Invalid
import org.example.State
import org.example.floating.MaybeValid0

class FloatingInitial: State {
    override fun next(char: String): State {
        if (char == ".") return MaybeValidPoint()
        if (char == "0") return MaybeValid0()
        if (char in "123456789") return MaybeValidInt()
        return Invalid()
    }
}