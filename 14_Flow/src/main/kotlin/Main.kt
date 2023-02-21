import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val player1 = LotteryPlayer("Angelina")
    val player2 = LotteryPlayer("Valentin")
    val lotteryOrganizer = LotteryOrganizer(player1, player2)
    println(player1.lotteryTicket)
    println(player1.sequence)
    println(lotteryOrganizer.sequence)
    println()

    runBlocking {
        lotteryOrganizer.sequence.collect{
            delay(100)
            println(it)
        }
    }


}
