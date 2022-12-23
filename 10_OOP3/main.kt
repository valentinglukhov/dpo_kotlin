fun main() {
    println(
        """
        Список доступных для обмена валют и их символы:
        1. Биткоин - ₿
        2. Китайский юань - 元
        3. Японская Йена - ¥
        
        Пожалуйста введите сумму в рублях и символ валюты через пробел, в формате "100 ₿"
    """.trimIndent()
    )
    Converters.get(getSumAndCurrency(getInput()).second).convertRub(100.0)
}

fun getInput(): String {
    var input = readln()
    while (input.isBlank()) {
        println("Пожалуйста введите сумму в рублях и символ валюты через пробел, в формате \"100 ₿")
        input = readln()
    }
    return input
}

fun getSumAndCurrency(inputString: String): Pair<Double, String> {
    val sum: Double = inputString.substringBefore(" ").toDoubleOrNull() ?: return Pair(0.0, "")
    val currency: String = inputString.substringAfter(" ")
    return Pair(sum, currency)
}

