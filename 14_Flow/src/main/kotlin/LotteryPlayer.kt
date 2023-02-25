class LotteryPlayer(val name: String, val lotteryTicket: LotteryTicket) {

    fun dropBarrel(barrelNumber: Int) {
        if (lotteryTicket.lotterySequence.contains(barrelNumber)) {
            println("Бочонок $barrelNumber есть в билете игрока: $name.")
            for (row in lotteryTicket.lotteryTicket.indices) {
                if (!lotteryTicket.lotteryTicket[row].isEmpty()) {
                    val filteredTicket =
                        lotteryTicket.lotteryTicket[row].filterValues { it != barrelNumber }.toMutableMap()
                    lotteryTicket.lotteryTicket[row] = filteredTicket
                    if (lotteryTicket.lotteryTicket[row].isEmpty()) {
                        lotteryTicket.emptyRows++
                        println("Пустой ряд №${row + 1} у игрока $name")
                        println("$name выиграл(а) приз!")
                        println("Пустых рядов: ${lotteryTicket.emptyRows}")
                        if (lotteryTicket.emptyRows == 3) println("$name выиграл(а) ДЖЕКПОТ! Игра завершена.")
                    }
                }
            }
            println(lotteryTicket.lotteryTicket)
        }
    }

    fun printLotteryTicket() {
        println()
        println(name)
        for (row in lotteryTicket.lotteryTicket.indices) {
            println("___________________________")
            for (key in 1..9) {
                if (lotteryTicket.lotteryTicket[row].get(key) == null) {
                    print("  |")
                } else {
                    if (lotteryTicket.lotteryTicket[row].get(key)!! < 10) print(" ")
                    print(lotteryTicket.lotteryTicket[row].get(key))
                    print("|")
                }
            }
            println()
        }
        println("___________________________")
    }
}