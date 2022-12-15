class Sberbank(balance: Double, creditLimit: Double, bank: String) : CreditCard(balance, creditLimit, bank) {
    private val cashback: Double = 0.05

    init {
        creditBalance = creditLimit
        println("Выпущена карта $bank")
        println("Кредитный лимит: $creditLimit")
        println("Кредитный баланс: $creditBalance")
        println("Собственные средства: $balance\n")
    }

    override fun pay(cash: Double): Boolean {
        if (super.pay(cash) == true) {
            println("На карту $bank дополнительно начислены бонусы за покупку в размере: ${cash * cashback}")
            deposit(cash * cashback)
            return true
        }
        return false
    }
}