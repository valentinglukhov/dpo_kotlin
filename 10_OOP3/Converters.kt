object Converters {
    val convertersList: List<CurrencyConverter> = listOf(RubToBitcoin(), RubToUan(), RubToJpy())
    fun get(currencyCode: String) : CurrencyConverter {
        when (currencyCode) {
            "₿" -> return convertersList[0]
            "元" -> return convertersList[1]
            "¥" -> return convertersList[2]
            else -> return object : CurrencyConverter {
                override val currencyCode: String = currencyCode
                override val exchangeRate: Double = 0.0
                override fun convertRub(sum: Double) {
                    println("Код валюты $currencyCode в справочнике не найден.")
                }
            }
        }
    }
}