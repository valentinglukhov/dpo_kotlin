open class CreditCard(
    override var balance: Double,
    private val creditLimit: Double,
    protected val bank: String
) :
    BankCard() {
    protected var creditBalance: Double
    private val overdraft: Double
        get() = creditLimit - creditBalance

    init {
        creditBalance = creditLimit
    }

    override fun deposit(cash: Double) : String {
        val toDebit: Double
        when {
            overdraft < cash -> {
                toDebit = cash - overdraft
                balance += toDebit
                creditBalance += overdraft
            }

            overdraft >= cash -> {
                creditBalance += cash
            }
        }
        return (
                """Карта $bank пополнена на сумму $cash
                |Кредитный лимит: $creditLimit
                |Кредитный баланс: $creditBalance
                |Собственные средства: $balance
                |
            """.trimMargin()
                )
    }

    override fun pay(cash: Double): Boolean {
        val toCredit: Double
        if (cash > (creditBalance + balance)) {
            lastTransaction =
                "На карте недостаточно средств. Сумма покупки: $cash, доступно средств: ${creditBalance + balance}\n"
            return false
        }
        if (cash > balance) {
            toCredit = cash - balance
            creditBalance -= toCredit
            balance -= (cash - toCredit)
        } else {
            balance -= cash
        }
        lastTransaction =
            """Совершена покупка по карте $bank на сумму $cash:
                |Кредитный лимит: $creditLimit
                |Кредитный баланс: $creditBalance
                |Собственные средства: $balance
                |
            """.trimMargin()
        this.lastTransaction
        return true
    }

    override fun getBalanceInfo() : String {
        val balanceInfo: String = "Баланс по карте $bank составляет: $balance\n"
        return balanceInfo
    }

    override fun getAvailableFunds() : String {
        val availableFunds: String = """Инфомация о доступных средствах по карте $bank
                |Кредитный лимит: $creditLimit
                |Кредитный баланс: $creditBalance
                |Собственные средства: $balance
                |
        """.trimMargin()
        return availableFunds
    }

}