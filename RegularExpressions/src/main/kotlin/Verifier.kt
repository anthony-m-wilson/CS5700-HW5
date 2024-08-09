package org.example

class Verifier {
    fun verify(string: String, initial: State): Boolean {
        var state = initial
        string.chunked(1).forEach {
            state = state.next(it)
        }
        return state is Valid
    }
}