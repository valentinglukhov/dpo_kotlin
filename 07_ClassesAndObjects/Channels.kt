object Channels {
    const val maxVolume = 20
    var channelList = mutableListOf<String>("Матч!", "Первый канал", "Россия 1", "Россия 24",
        "НТВ", "ТНТ", "Пятница", "Карусель", "Звезда", "Мир")
    val channelMap = HashMap<Int, String>()
    fun getRandomChannelMap (): HashMap<Int, String> {
        val randomChannelList = channelList.shuffled().take(kotlin.random.Random.nextInt(5,10))
        for (n in randomChannelList.indices) {
            channelMap.put(n + 1, randomChannelList[n])
        }
        return channelMap
    }
}