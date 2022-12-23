interface CurrencyConverter {
    val currencyCode: String
    val exchangeRate: Double
    fun convertRub (sum: Double) {
        println("$sum рублей = ${sum / exchangeRate} $currencyCode")
    }
}