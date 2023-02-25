import kotlinx.coroutines.*

fun main() {
    runBlocking {
        val player1 = LotteryPlayer("Ангелина", LotteryTicket())
        val player2 = LotteryPlayer("Валентин", LotteryTicket())
        val lotteryOrganizer = LotteryOrganizer(player1, player2)
        val scope = CoroutineScope(Job() + Dispatchers.Default)

        scope.launch {
            lotteryOrganizer.sharedFlow.collect {
                println("Выпал бочонок №$it")
                player1.dropBarrel(it)
                player2.dropBarrel(it)
                if (player1.lotteryTicket.emptyRows == 3 && player2.lotteryTicket.emptyRows == 3) {
                    println("В игре зафиксирована ничья.")
                    scope.cancel()
                }
                if (player1.lotteryTicket.emptyRows == 3 || player2.lotteryTicket.emptyRows == 3) scope.cancel()
            }
        }.join()


    }


}
