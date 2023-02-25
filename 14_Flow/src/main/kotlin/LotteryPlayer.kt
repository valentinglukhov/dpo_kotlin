import kotlin.random.Random
import kotlin.random.nextInt

class LotteryPlayer (name: String, lotteryTicket: LotteryTicket) {
    val name: String = name
    var lotteryTicket = lotteryTicket
    private var firstRow = mutableListOf<Int>()

    init {
    }
}