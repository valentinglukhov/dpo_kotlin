import kotlin.random.Random
import kotlin.random.nextInt

class LotteryPlayer (name: String) {
    val name: String = name
    var lotteryTicket = LotteryTicket().lotteryTicket
    private var firstRow = mutableListOf<Int>()
    val sequence = (1..90).shuffled()

    init {
        while (firstRow.size < 10) {
            firstRow.add(Random.nextInt(1..10))
        }
        lotteryTicket.add(firstRow)
    }
}