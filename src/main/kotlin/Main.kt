fun main() {
    val resuit = commission(260_000)
    println(resuit)

}

fun commission(amount: Int, transfersPerMonth: Int = 0, typeOfPaymentSystem: String = "Vk Pay") =
    when (typeOfPaymentSystem) {
        "Visa" -> commissionForVisaAndMir(amount)
        "Мир" -> commissionForVisaAndMir(amount)
        "Mastercard" -> commissionForMastercardAndMaestro(amount, transfersPerMonth)
        "Maestro" -> commissionForMastercardAndMaestro(amount, transfersPerMonth)
        "Vk Pay" -> amount
        else -> {
            "платежная систем карты введена неверно"
        }
    }


fun commissionForVisaAndMir(amount: Int): Int {
    val amountCommission = (amount * 0.75) / 100
    return if (amountCommission > 350) (amount - amountCommission).toInt() else amount - 350
}

fun commissionForMastercardAndMaestro(amount: Int, transfersPerMonth: Int ) = when (transfersPerMonth) {
    0 -> if (amount > 750_000) amount - masterAndMaestro(amount - 750_000) else amount
    range(
        0..750_000,
        transfersPerMonth
    ) -> if (amount > 750_000 - transfersPerMonth) amount - masterAndMaestro(amount - 750_000 - transfersPerMonth) else amount

    else -> {
        masterAndMaestro(amount)
    }


}

fun masterAndMaestro(amount1: Int): Int {
    val amountCommission = (amount1 * 0.6) / 100
    return if (amountCommission > 200) (amountCommission).toInt() else 200
}

fun range(range: IntRange, transfersPerMonth: Int): Int {
    var result = 0
    for (i in range) {
        if (i == transfersPerMonth) {
            result = transfersPerMonth
        }
    }
    return result

}


