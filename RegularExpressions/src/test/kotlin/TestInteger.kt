import org.example.InitializeState
import org.example.Verifier
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestInteger {
    private val initializer = InitializeState()
    private val verifier = Verifier()

    @Test
    fun validInteger() {
        assertTrue(verifier.verify("1", initializer.createInitialState("integer")!!))
        assertTrue(verifier.verify("123", initializer.createInitialState("integer")!!))
        assertTrue(verifier.verify("1234567890", initializer.createInitialState("integer")!!))
        assertTrue(verifier.verify("3452342352434534524346", initializer.createInitialState("integer")!!))
    }

    @Test
    fun invalidInteger() {
        assertFalse(verifier.verify("", initializer.createInitialState("integer")!!))
        assertFalse(verifier.verify("0", initializer.createInitialState("integer")!!))
        assertFalse(verifier.verify("0123", initializer.createInitialState("integer")!!))
        assertFalse(verifier.verify("123a", initializer.createInitialState("integer")!!))
        assertFalse(verifier.verify("123a321", initializer.createInitialState("integer")!!))
        assertFalse(verifier.verify("0123210", initializer.createInitialState("integer")!!))
    }

}