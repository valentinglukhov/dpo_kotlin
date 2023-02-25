import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val player1 = LotteryPlayer("Ангелина", LotteryTicket())
    val player2 = LotteryPlayer("Валентин", LotteryTicket())
    val lotteryOrganizer = LotteryOrganizer(player1, player2)


    runBlocking {
        lotteryOrganizer.sharedFlow.collect{
            delay(100)
            println(it)
        }
    }


}
