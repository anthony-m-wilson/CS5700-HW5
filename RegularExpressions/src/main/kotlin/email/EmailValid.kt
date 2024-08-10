package org.example.email

import org.example.Invalid
import org.example.State
import org.example.Valid

class EmailValid : State, Valid {
    override fun next(char: String): State {
        if (char == " " || char == "@" || char == ".") return Invalid()
        return EmailValid()
    }
}