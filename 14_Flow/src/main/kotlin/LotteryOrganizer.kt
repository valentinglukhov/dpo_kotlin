import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class LotteryOrganizer(vararg player: LotteryPlayer) {
    private var lotteryBag = (1..90).shuffled().toList()
    val scope = CoroutineScope(Job() + Dispatchers.Default)
    private val _sharedFlow = MutableSharedFlow<Int>(10)
    val sharedFlow = _sharedFlow.asSharedFlow()


    init {
        println("Участники лотереи:")
        for (plr in player) {
            plr.printLotteryTicket()
        }
        if (player.size >= 2) startGame()
    }

    fun startGame() {
        scope.launch {
            for (barrel in lotteryBag) {
                _sharedFlow.emit(barrel)
                delay(500)
            }
        }
    }

//    fun lotteryBag () {
//        var sequence = (1..90).toList()
//        var newList = mutableListOf<Int>()
//        println(sequence)
//        var lotteryBag = (1..90).toList()
//        for (i in 1..90) {
//            val secondBag = lotteryBag.minusElement(lotteryBag.random().also {
//                println(it)
//                newList.add(it)
//            })
//            println(newList)
//            println(secondBag)
//            lotteryBag = secondBag
//            println(lotteryBag.isEmpty())
//        }
//    }
}