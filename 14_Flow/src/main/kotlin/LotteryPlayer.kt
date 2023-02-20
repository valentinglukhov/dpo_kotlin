import kotlin.random.Random
import kotlin.random.nextInt

class LotteryPlayer (name: String) {
    val name: String = name
    var lotteryTicket = mutableListOf<MutableList<Int>>()
    var firstRow = mutableListOf<Int>()

    init {
        while (firstRow.size < 10) {
            firstRow.add(Random.nextInt(1..10))
        }
        lotteryTicket.add(firstRow)
    }
}