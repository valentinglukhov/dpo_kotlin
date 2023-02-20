class LotteryPlayer (name: String) {
    var lotteryTicket = mutableListOf<MutableList<Int>>()
    var firstRow = mutableListOf<Int>()

    init {
        while (firstRow.isEmpty()) {
            firstRow.add(1)
        }
        lotteryTicket.add(firstRow)
    }
}