package org.example.email

import org.example.Invalid
import org.example.State

class Part1 : State {
    override fun next(char: String): State {
        if (char == " ") return Invalid()
        if (char == "@") return Part2()
        return Part1()
    }
}