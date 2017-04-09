package funk

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class CompositionTest {

    @Test fun composition() {
        val f: (String) -> Int = String::length
        val g: (Int) -> String = Int::toString

        (f compose g)("string") shouldMatch equalTo("6")
        (g compose f)(100) shouldMatch equalTo(3)
        ((f compose g) compose f)("string") shouldMatch equalTo(1)
    }

    @Test fun `compose with unit`() {
        val f: () -> String = { "string" }
        val g: (String) -> Int = String::length
        val h: (Int) -> Unit = {}

        (f compose g)() shouldMatch equalTo(6)
        (g compose h)("a string") shouldMatch equalTo(Unit)
        ((f compose g) compose h)() shouldMatch equalTo(Unit)
    }
}