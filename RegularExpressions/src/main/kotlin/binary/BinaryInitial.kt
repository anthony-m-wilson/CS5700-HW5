package org.example.binary

import org.example.Invalid
import org.example.State

class BinaryInitial: State {
    override fun next(char: String): State {
        return if (char == "1") BinaryValid() else Invalid()
    }
}