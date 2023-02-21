import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.shareIn

class LotteryOrganizer(vararg player: LotteryPlayer) {
    private var lotteryBag = (1..90).toList()
    private var newList = mutableListOf<Int>()
    val scope = CoroutineScope(Job() + Dispatchers.Default)
    val sequence =
        (1..90).shuffled().asFlow().shareIn(scope = scope, started = SharingStarted.WhileSubscribed(), replay = 90)


    init {
        for (plr in player) {
            println(plr.name)
            println("Бочонок")
        }
    }

    fun lotteryBag () {
        var sequence = (1..90).toList()
        var newList = mutableListOf<Int>()
        println(sequence)
        var lotteryBag = (1..90).toList()
        for (i in 1..90) {
            val secondBag = lotteryBag.minusElement(lotteryBag.random().also {
                println(it)
                newList.add(it)
            })
            println(newList)
            println(secondBag)
            lotteryBag = secondBag
            println(lotteryBag.isEmpty())
        }
    }
}