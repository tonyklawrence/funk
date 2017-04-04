package funk

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class CompositionTest {

    @Test fun composition() {
        val f = { i: Int -> i + 1 }
        val g = { i: Int -> i * 2 }

        (f compose g)(1) shouldMatch equalTo(3)
        (g compose f)(1) shouldMatch equalTo(4)
    }
}