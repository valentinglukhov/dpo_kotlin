import java.math.RoundingMode

class LotteryTicket {
    var sequence = (1..90).toList()
    var lotteryTicket = mutableListOf<MutableMap<Int, Int>>()
    var firstRow = mutableMapOf<Int, Int>()
    var secondRow = mutableMapOf<Int, Int>()
    var thirdRow = mutableMapOf<Int, Int>()
    var newSequence = mutableListOf<Int>()
    var intermediateSequence = mutableListOf<Int>()
    var lotterySequence = mutableListOf<Int>()
    var emptyRows: Int = 0

    init {
        while (firstRow.size < 5) {
//            println(firstRow.size)
//            println(newSequence.size)
//            println(firstRow)
            intermediateSequence.clear()
            newSequence = sequence.minusElement(sequence.random().also {
                val key: Int = (it.toDouble() / 10).toBigDecimal().setScale(0, RoundingMode.UP).toInt()
//                println("Выпал номер $it с ключом $key")
                if (firstRow.containsKey(key)) {
//                    println("Ключ $key уже содержится в списке.")
                    intermediateSequence.add(it)
                } else {
                    firstRow.put(key, it)
                    lotterySequence.add(it)
                }
            }).toMutableList()
            newSequence += intermediateSequence
            sequence = newSequence
        }
        while (secondRow.size < 5) {
            intermediateSequence.clear()
            newSequence = sequence.minusElement(sequence.random().also {
                val key: Int = (it.toDouble() / 10).toBigDecimal().setScale(0, RoundingMode.UP).toInt()
                if (secondRow.containsKey(key)) {
                    intermediateSequence.add(it)
                } else {
                    secondRow.put(key, it)
                    lotterySequence.add(it)
                }
            }).toMutableList()
            newSequence += intermediateSequence
            sequence = newSequence
        }
        while (thirdRow.size < 5) {
            intermediateSequence.clear()
            newSequence = sequence.minusElement(sequence.random().also {
                val key: Int = (it.toDouble() / 10).toBigDecimal().setScale(0, RoundingMode.UP).toInt()
                if (thirdRow.containsKey(key)) {
                    intermediateSequence.add(it)
                } else {
                    thirdRow.put(key, it)
                    lotterySequence.add(it)
                }
            }).toMutableList()
            newSequence += intermediateSequence
            sequence = newSequence
        }
        lotteryTicket.add(firstRow)
        lotteryTicket.add(secondRow)
        lotteryTicket.add(thirdRow)

    }
}