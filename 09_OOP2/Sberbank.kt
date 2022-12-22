class Sberbank(balance: Double, creditLimit: Double, bank: String) : CreditCard(balance, creditLimit, bank) {
    private val cashback: Double = 0.05

    init {
        creditBalance = creditLimit
        println("Выпущена карта $bank")
        println("Кредитный лимит: $creditLimit")
        println("Кредитный баланс: $creditBalance")
        println("Собственные средства: $balance\n")
    }

    override fun pay(cash: Double): Pair<Boolean, String> {
        if (super.pay(cash).first) {
            deposit(cash * cashback)
            return true to """Совершена покупка по карте $bank на сумму $cash:
                |Кредитный лимит: $creditLimit
                |Кредитный баланс: $creditBalance
                |Собственные средства: $balance
                |На карту $bank дополнительно начислены бонусы за покупку в размере: ${cash * cashback}
            """.trimMargin()
        }
        return false to "На карте недостаточно средств. Сумма покупки: $cash, доступно средств: ${creditBalance + balance}\n"
    }
}