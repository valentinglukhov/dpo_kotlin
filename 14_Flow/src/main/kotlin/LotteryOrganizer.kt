import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class LotteryOrganizer(vararg player: LotteryPlayer) {
    private var lotteryBag = (1..90).shuffled().toList()
    val scope = CoroutineScope(Job() + Dispatchers.Default)
    private val _sharedFlow = MutableSharedFlow<Int>(10)
    val sharedFlow = _sharedFlow.asSharedFlow()


    init {
        println("Участники лотереи:")
        for (plr in player) {
            println()
            println(plr.name)
            for (row in plr.lotteryTicket.lotteryTicket.indices) {
                println("___________________________")
                for (key in 1..9) {
                    if (plr.lotteryTicket.lotteryTicket[row].get(key) == null) {
                        print("  |")
                    } else {
                        if (plr.lotteryTicket.lotteryTicket[row].get(key)!! < 10) print(" ")
                        print(plr.lotteryTicket.lotteryTicket[row].get(key))
                        print("|")
                    }
                }
                println()
            }
            println("___________________________")
        }
        if (player.size >= 2) startGame()
    }

    fun startGame () {
        scope.launch {
            for (barrel in lotteryBag) {
                _sharedFlow.emit(barrel)
            }
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