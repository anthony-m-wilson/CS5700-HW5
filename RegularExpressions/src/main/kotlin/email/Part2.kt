package org.example.email

import org.example.Invalid
import org.example.State

class Part2 : State {
    override fun next(char: String): State {
        if (char == " " || char == "@") return Invalid()
        if (char == ".") return Part3()
        return Part2()
    }
}