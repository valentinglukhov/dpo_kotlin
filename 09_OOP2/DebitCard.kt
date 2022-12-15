open class DebitCard(override var balance: Double, protected val bank: String) :
    BankCard() {

    override fun deposit(cash: Double) {
        balance += cash
        println(
            """Карта $bank пополнена на сумму $cash
                |Собственные средства: $balance
                |
            """.trimMargin()
        )
    }

    override fun pay(cash: Double): Boolean {
        if (cash > balance) {
            println("На карте $bank недостаточно средств. Сумма покупки: $cash, доступно средств: $balance\n")
            return false
        }
        balance -= cash
        println(
            """Совершена покупка по карте $bank на сумму $cash:
                |Собственные средства: $balance
                |
            """.trimMargin()
        )
        return true
    }

    override fun getBalanceInfo() {
        println("Баланс по карте $bank составляет: $balance\n")
    }

    override fun getAvailableFunds() {
        println("Карта является дебитовой, информация по кредитным лимитам отсутствует.\n")
    }

}