class LotteryOrganizer (vararg player: LotteryPlayer) {
    private var lotteryBag = (1..90).toList()
    private var newList = mutableListOf<Int>()

    init {
        for (plr in player) {
            println(plr.name)
        }
    }


}