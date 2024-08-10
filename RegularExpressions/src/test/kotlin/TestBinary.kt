import org.example.InitializeState
import org.example.Verifier
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestBinary {
    private val initializer = InitializeState()
    private val verifier = Verifier()

    @Test
    fun validBinary() {
        assertTrue(verifier.verify("1", initializer.createInitialState("binary")!!))
        assertTrue(verifier.verify("111", initializer.createInitialState("binary")!!))
        assertTrue(verifier.verify("101", initializer.createInitialState("binary")!!))
        assertTrue(verifier.verify("10101", initializer.createInitialState("binary")!!))
        assertTrue(verifier.verify("1101", initializer.createInitialState("binary")!!))
        assertTrue(verifier.verify("100001", initializer.createInitialState("binary")!!))
        assertTrue(verifier.verify("111111", initializer.createInitialState("binary")!!))
    }

    @Test
    fun invalidBinary() {
        assertFalse(verifier.verify("", initializer.createInitialState("binary")!!))
        assertFalse(verifier.verify("0", initializer.createInitialState("binary")!!))
        assertFalse(verifier.verify("12", initializer.createInitialState("binary")!!))
        assertFalse(verifier.verify("1010", initializer.createInitialState("binary")!!))
        assertFalse(verifier.verify("111a", initializer.createInitialState("binary")!!))
        assertFalse(verifier.verify("1a1", initializer.createInitialState("binary")!!))
        assertFalse(verifier.verify("1021", initializer.createInitialState("binary")!!))
        assertFalse(verifier.verify("1111110", initializer.createInitialState("binary")!!))
    }
}