package org.example.floating

import org.example.Invalid
import org.example.State

class MaybeValidPoint : State {
    override fun next(char: String): State {
        return if (char in "0123456789") FloatingValid() else Invalid()
    }
}