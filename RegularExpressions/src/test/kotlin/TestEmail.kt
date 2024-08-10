import org.example.InitializeState
import org.example.Verifier
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestEmail {
    private val initializer = InitializeState()
    private val verifier = Verifier()

    @Test
    fun validEmail() {
        assertTrue(verifier.verify("a@a.a", initializer.createInitialState("email")!!))
        assertTrue(verifier.verify("asdf.asdf@asdf.asdf", initializer.createInitialState("email")!!))
        assertTrue(verifier.verify("a#&^@b)(&*.#$^a", initializer.createInitialState("email")!!))
        assertTrue(verifier.verify("a.a.a.a@b.c", initializer.createInitialState("email")!!))
        assertTrue(verifier.verify("a123.321a@a123.321a", initializer.createInitialState("email")!!))
    }

    @Test
    fun invalidEmail() {
        assertFalse(verifier.verify(" ", initializer.createInitialState("email")!!))
        assertFalse(verifier.verify("a", initializer.createInitialState("email")!!))
        assertFalse(verifier.verify("a@a", initializer.createInitialState("email")!!))
        assertFalse(verifier.verify("a@a.", initializer.createInitialState("email")!!))
        assertFalse(verifier.verify("a@a.a.", initializer.createInitialState("email")!!))
        assertFalse(verifier.verify("a@a@a.a", initializer.createInitialState("email")!!))
    }
}