import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commission() {
        val ex = 10000
        val exx = 0
        val exxx = "Visa"

        val result = commission(ex, exx, exxx)

        assertEquals(100000, result)

    }
}