class Vtb (balance: Double, bank: String) : DebitCard(balance, bank) {
    val cashback: Double = 0.02
    init {
        println("Выпущена карта $bank")
        println("Собственные средства: $balance\n")
    }

    override fun deposit(cash: Double) {
        val amountCash = (cash + (cash * cashback))
        println("На карту $bank начислены ${(cash * cashback)} бонусов за пополнение. Общая сумма пополнения $amountCash")
        super.deposit(amountCash)
    }
}