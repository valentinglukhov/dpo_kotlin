abstract class BankCard {
    abstract protected val balance: Double
    abstract fun deposit(cash: Double)
    abstract fun pay(cash: Double) : Boolean
    abstract fun getBalanceInfo()
    abstract fun getAvailableFunds()

}