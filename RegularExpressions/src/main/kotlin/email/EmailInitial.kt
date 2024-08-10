package org.example.email

import org.example.Invalid
import org.example.State

class EmailInitial : State {
    override fun next(char: String): State {
        return if (char == "@" || char == " ") Invalid() else Part1()
    }
}