import org.example.InitializeState
import org.example.Verifier
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestPassword {
    private val initializer = InitializeState()
    private val verifier = Verifier()

    @Test
    fun validPassword() {
        assertTrue(verifier.verify("aaaaH!aa", initializer.createInitialState("password")!!))
        assertTrue(verifier.verify("aaaaH!aaH!aa", initializer.createInitialState("password")!!))
        assertTrue(verifier.verify("1234567*9J", initializer.createInitialState("password")!!))
        assertTrue(
            verifier.verify(
                "asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH",
                initializer.createInitialState("password")!!
            )
        )
    }

    @Test
    fun invalidPassword() {
        assertFalse(verifier.verify(" ", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("a", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("a1", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("a1!", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("aaaaaa1!", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("Aaaaaa1", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("aA!a1", initializer.createInitialState("password")!!))
    }
}