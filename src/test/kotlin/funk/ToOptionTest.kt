package funk

import com.natpryce.hamkrest.absent
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.present
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class ToOptionTest {

    @Test fun `double to int?`() {
        10.0.toIntOption() shouldMatch present(equalTo(10))
        10.5.toIntOption() shouldMatch absent()
    }

    @Test fun `string to int?`() {
        "10".toIntOption() shouldMatch present(equalTo(10))
        "10.5".toIntOption() shouldMatch absent()
        "bad".toIntOption() shouldMatch absent()
        "".toIntOption() shouldMatch absent()
    }

    @Test fun `string to double?`() {
        "10".toDoubleOption() shouldMatch present(equalTo(10.0))
        "10.5".toDoubleOption() shouldMatch present(equalTo(10.5))
        "bad".toDoubleOption() shouldMatch absent()
        "".toDoubleOption() shouldMatch absent()
    }
}