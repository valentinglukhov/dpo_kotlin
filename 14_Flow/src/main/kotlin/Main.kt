import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
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
//var lotteryBag = generateSequence(1) { if (it == 90) null else it + 1}.toList()