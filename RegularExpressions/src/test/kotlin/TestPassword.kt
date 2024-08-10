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
        assertTrue(verifier.verify("asdpoihj;loij@aH", initializer.createInitialState("password")!!))
        assertTrue(verifier.verify("AAA1a!asd", initializer.createInitialState("password")!!))
        assertTrue(verifier.verify("aA!a1aA!a1", initializer.createInitialState("password")!!))
        assertTrue(verifier.verify("aAa123#Aa", initializer.createInitialState("password")!!))
        assertTrue(verifier.verify("12abAB12@s", initializer.createInitialState("password")!!))
        assertTrue(verifier.verify("12abAB12@1", initializer.createInitialState("password")!!))
    }

    @Test
    fun invalidPassword() {
        assertFalse(verifier.verify(" ", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("a", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("a1", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("1a", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("a1!a1!a!", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("1!a1!a1!", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("!a1!a1!a", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("aaaaaa1!", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("Aaaaaa1", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("aA!a1", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("Fals3", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("aaaaaaaa{a", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("aaaaaa1{a", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("aaaaaaA{a", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("{aaaaaa1A", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("aaaaaa1\$A{", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("aaaaaa1\${A", initializer.createInitialState("password")!!))
        assertFalse(verifier.verify("aaaaaa\$A#1#{", initializer.createInitialState("password")!!))
    }
}