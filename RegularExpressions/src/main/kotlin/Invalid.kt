package org.example

class Invalid: State {
    override fun next(char: String): State {
        return Invalid()
    }
}