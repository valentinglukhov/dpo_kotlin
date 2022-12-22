abstract class BankCard {
    protected abstract val balance: Double
    abstract fun deposit(cash: Double): String
    abstract fun pay(cash: Double): Pair<Boolean, String>
    abstract fun getBalanceInfo(): String
    abstract fun getAvailableFunds(): String

}