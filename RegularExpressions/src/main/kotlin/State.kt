package org.example

interface State {
    fun next(char: String): State
}
