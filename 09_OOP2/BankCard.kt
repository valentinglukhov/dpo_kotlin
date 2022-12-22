abstract class BankCard {
    protected abstract val balance: Double
    var lastTransaction: String = ""
        get() = println(field).toString()
    abstract fun deposit(cash: Double): String
    abstract fun pay(cash: Double): Boolean
    abstract fun getBalanceInfo(): String
    abstract fun getAvailableFunds(): String

}