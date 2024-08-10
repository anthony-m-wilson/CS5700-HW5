import org.example.InitializeState
import org.example.Verifier
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestFloating {
    private val initializer = InitializeState()
    private val verifier = Verifier()

    @Test
    fun validFloating() {
        assertTrue(verifier.verify("1.0", initializer.createInitialState("floating")!!))
        assertTrue(verifier.verify("123.0", initializer.createInitialState("floating")!!))
        assertTrue(verifier.verify("0.0", initializer.createInitialState("floating")!!))
        assertTrue(verifier.verify(".0", initializer.createInitialState("floating")!!))
        assertTrue(verifier.verify(".124124", initializer.createInitialState("floating")!!))
        assertTrue(verifier.verify("123.123", initializer.createInitialState("floating")!!))
        assertTrue(verifier.verify("0.12345678", initializer.createInitialState("floating")!!))
        assertTrue(verifier.verify("34523423524346.3452344346", initializer.createInitialState("floating")!!))
    }

    @Test
    fun invalidFloating() {
        assertFalse(verifier.verify(" ", initializer.createInitialState("floating")!!))
        assertFalse(verifier.verify("0", initializer.createInitialState("floating")!!))
        assertFalse(verifier.verify(".0123.", initializer.createInitialState("floating")!!))
        assertFalse(verifier.verify("123a", initializer.createInitialState("floating")!!))
        assertFalse(verifier.verify("123a321", initializer.createInitialState("floating")!!))
        assertFalse(verifier.verify("01.3", initializer.createInitialState("floating")!!))
        assertFalse(verifier.verify("123.", initializer.createInitialState("floating")!!))
        assertFalse(verifier.verify("123.123.", initializer.createInitialState("floating")!!))
        assertFalse(verifier.verify("123.123.123", initializer.createInitialState("floating")!!))
    }
}