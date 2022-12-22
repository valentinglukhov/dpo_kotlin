fun main () {
    val sberBank = Sberbank(10000.0, 10000.0, "Сбербанк")
    val vtb = Vtb(10000.0, "ВТБ")
    println(sberBank.deposit(1000.0))
    sberBank.pay(15000.0)
    sberBank.lastTransaction
    sberBank.pay(1000.0)
    sberBank.lastTransaction
    println(sberBank.deposit(1500.0))
    println(sberBank.deposit(10000.0))
    println(sberBank.getAvailableFunds())
    println(sberBank.getBalanceInfo())

    println(vtb.deposit(1000.0))
    vtb.pay(5000.0)
    vtb.lastTransaction
    vtb.pay(1000.0)
    vtb.lastTransaction
    vtb.pay(6000.0)
    vtb.lastTransaction
    println(vtb.deposit(1500.0))
    println(vtb.deposit(10000.0))
    println(vtb.getAvailableFunds())
    println(vtb.getBalanceInfo())
}