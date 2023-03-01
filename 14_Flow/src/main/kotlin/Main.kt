import kotlinx.coroutines.*

fun main() {

    val player3 = LotteryPlayer("Есения", LotteryTicket())
    val player1 = LotteryPlayer("Ангелина", LotteryTicket())
    val player2 = LotteryPlayer("Валентин", LotteryTicket())
    val lotteryOrganizer = LotteryOrganizer(player3, player2, player1)
    val scope = CoroutineScope(Job() + Dispatchers.Default)

    runBlocking {
        scope.launch {
            lotteryOrganizer.players.forEach { player ->
                launch {
                    lotteryOrganizer.sharedFlow.collect {
                        player.dropBarrel(it)
                        if (player.lotteryTicket.emptyRows == 3) scope.cancel()
                    }
                }
            }
        }.join()
    }
}

//lotteryOrganizer.sharedFlow.collect {
//    println("Выпал бочонок №$it")
//    player1.dropBarrel(it)
//    player2.dropBarrel(it)
//    if (player1.lotteryTicket.emptyRows == 3 && player2.lotteryTicket.emptyRows == 3) {
//        println("В игре зафиксирована ничья.")
//        scope.cancel()
//    }
//    if (player1.lotteryTicket.emptyRows == 3 || player2.lotteryTicket.emptyRows == 3) scope.cancel()
//}