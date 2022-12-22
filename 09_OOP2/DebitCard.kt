open class DebitCard(override var balance: Double, protected val bank: String) :
    BankCard() {

    override fun deposit(cash: Double): String {
        balance += cash
        return """Карта $bank пополнена на сумму $cash
                |Собственные средства: $balance
            """.trimMargin()
    }

    override fun pay(cash: Double): Pair<Boolean, String> {
        if (cash > balance) {
            return false to "На карте $bank недостаточно средств. Сумма покупки: $cash, доступно средств: $balance\n"
        }
        balance -= cash
        return true to """Совершена покупка по карте $bank на сумму $cash:
                |Собственные средства: $balance
                |
            """.trimMargin()
    }

    override fun getBalanceInfo(): String {
        val balanceInfo: String = "Баланс по карте $bank составляет: $balance\n"
        return balanceInfo
    }

    override fun getAvailableFunds(): String {
        val availableFunds: String = "Карта является дебитовой, информация по кредитным лимитам отсутствует.\n"
        return availableFunds
    }

}