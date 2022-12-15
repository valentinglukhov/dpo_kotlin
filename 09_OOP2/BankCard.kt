abstract class BankCard {
    abstract val balance: Double
    abstract fun deposit(cash: Double)
    abstract fun pay(cash: Double) : Boolean
    abstract fun getBalanceInfo()
    abstract fun getAvailableFunds()

}