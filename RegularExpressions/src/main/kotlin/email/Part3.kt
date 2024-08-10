package org.example.email

import org.example.Invalid
import org.example.State

class Part3 : State {
    override fun next(char: String): State {
        if (char == " " || char == "@" || char == ".") return Invalid()
        return EmailValid()
    }
}