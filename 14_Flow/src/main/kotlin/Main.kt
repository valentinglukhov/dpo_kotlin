import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val player1 = LotteryPlayer("Angelina")
    val player2 = LotteryPlayer("Valentin")
    val lotteryOrganizer = LotteryOrganizer(player1, player2)
    println(player1.lotteryTicket)
    println(lotteryOrganizer)


}
