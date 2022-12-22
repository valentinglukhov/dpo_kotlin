class Vtb(balance: Double, bank: String) : DebitCard(balance, bank) {
    private val cashback: Double = 0.02

    init {
        println("Выпущена карта $bank")
        println("Собственные средства: $balance\n")
    }

    override fun deposit(cash: Double): String {
        val amountCash = (cash + (cash * cashback))
        super.deposit(amountCash)
        return "На карту $bank начислены ${(cash * cashback)} бонусов за пополнение. Общая сумма пополнения $amountCash\n"
    }
}