import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionVisa() {
        val amount = 10000
        val transfersPerMonth = 0
        val typeOfPaymentSystem = "Visa"

        val result = commission(amount, transfersPerMonth, typeOfPaymentSystem)

        assertEquals(9650, result)

    }
    @Test
    fun commissionMir() {
        val amount = 100_000
        val transfersPerMonth = 10000
        val typeOfPaymentSystem = "Мир"

        val result = commission(amount, transfersPerMonth, typeOfPaymentSystem)

        assertEquals(99250, result)

    }

    @Test
    fun commissionMaster() {
        val amount = 100_000
        val transfersPerMonth = 0
        val typeOfPaymentSystem = "Mastercard"

        val result = commission(amount, transfersPerMonth, typeOfPaymentSystem)

        assertEquals(100_000, result)

    }

    @Test
    fun commissionMir2() {
        val amount = 10000
        val transfersPerMonth = 0
        val typeOfPaymentSystem = "Mir"

        val result = commission(amount, transfersPerMonth, typeOfPaymentSystem)

        assertEquals("платежная систем карты введена неверно", result)

    }
    @Test
    fun commissionMaster2() {
        val amount = 1000_0000
        val transfersPerMonth = 0
        val typeOfPaymentSystem = "Mastercard"

        val result = commission(amount, transfersPerMonth, typeOfPaymentSystem)

        assertEquals(9944500, result)

    }

    @Test
    fun commissionMaestro() {
        val amount = 1000000
        val transfersPerMonth = 20_000
        val typeOfPaymentSystem = "Maestro"

        val result = commission(amount, transfersPerMonth, typeOfPaymentSystem)

        assertEquals(998620, result)

    }

    @Test
    fun commissionVk() {
        val amount = 100_000
        val transfersPerMonth = 0
        val typeOfPaymentSystem = "Vk Pay"

        val result = commission(amount, transfersPerMonth, typeOfPaymentSystem)

        assertEquals(99_000, result)

    }

    @Test
    fun commissionMaestro2() {
        val amount = 10000
        val transfersPerMonth = 750_000
        val typeOfPaymentSystem = "Maestro"

        val result = commission(amount, transfersPerMonth, typeOfPaymentSystem)

        assertEquals(9800, result)

    }
    @Test
    fun commissionMaestro3() {
        val amount = 100000000
        val transfersPerMonth = 500_000
        val typeOfPaymentSystem = "Maestro"

        val result = commission(amount, transfersPerMonth, typeOfPaymentSystem)

        assertEquals(99407500, result)

    }
}