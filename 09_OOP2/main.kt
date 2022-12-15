fun main () {
    val sberBank = Sberbank(10000.0, 10000.0, "Сбербанк")
    val vtb = Vtb(10000.0, "ВТБ")
    sberBank.deposit(1000.0)
    sberBank.pay(15000.0)
    sberBank.pay(1000.0)
    sberBank.deposit(1500.0)
    sberBank.deposit(10000.0)
    sberBank.getAvailableFunds()
    sberBank.getBalanceInfo()


    vtb.deposit(1000.0)
    vtb.pay(5000.0)
    vtb.pay(1000.0)
    vtb.pay(6000.0)
    vtb.deposit(1500.0)
    vtb.deposit(10000.0)
    vtb.getAvailableFunds()
    vtb.getBalanceInfo()
}