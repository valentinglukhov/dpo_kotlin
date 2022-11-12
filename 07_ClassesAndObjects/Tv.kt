class Tv(brand: String, model: String, diagonalSize: Float, channelList: HashMap<Int, String>) {
    var isSwitchedOn: Boolean = false
        private set
    private val channelList: HashMap<Int, String> = channelList
    var currentVolume = 10
    var currentChannel = 1
    val brand = brand
    var overall = HashMap<String, HashMap<Int, String>>()
//    init {
//        channelList = channelList
//        overall.put(brand, channelList)
//        println(channelList)
//        println(overall)
//    }

    fun turnOnOff() {
        if (isSwitchedOn) {
            isSwitchedOn = !isSwitchedOn
            println("Телевизор выключен.")
        } else {
            isSwitchedOn = !isSwitchedOn
            println("Телевизор включен.")
        }
    }

    fun turnUpTheVolume() {
        if (!isSwitchedOn) {
            println("Нельзя изменить громкость на выключенном ТВ.")
            return
        }
        if (currentVolume < maxVolume) {
            currentVolume++
            println("Громкость: $currentVolume")
        } else {
            println("Это максимальная громкость.")
        }
    }

    fun turnDownTheVolume() {
        if (!isSwitchedOn) {
            println("Нельзя изменить громкость на выключенном ТВ.")
            return
        }
        if (currentVolume >= 1) {
            currentVolume--
            when (currentVolume) {
                0 -> println("Звук выключен");
                else -> println("Громкость: $currentVolume")
            }
        } else {
            println("Звук выключен")
        }

    }

    fun turnOnChannelNumber(channelNumber: Int) {
        if (isSwitchedOn) {
            currentChannel = channelNumber
            println("Включен канал №$channelNumber")
        } else {
            turnOnOff()
            println("Включен канал №$channelNumber")
        }
    }

    fun channelUp () {

    }

    fun printChannelList () {
        println("Список каналов для телевизора $brand:")
        println(channelList)
//        for ((key, value) in overall[brand]) println ("$key - $value")
        println(overall[brand])
    }
    companion object Channels {
        const val maxVolume = 20
//        var channelList = mutableListOf<String>("Матч!", "Первый канал", "Россия 1", "Россия 24",
//            "НТВ", "ТНТ", "Пятница", "Карусель", "Звезда", "Мир")
//        var channelMap = LinkedHashMap<Int, String>()
//        fun getRandomChannelMap (): LinkedHashMap<Int, String> {
//            val randomChannelList = channelList.shuffled().take(kotlin.random.Random.nextInt(5,10))
//            for (n in randomChannelList.indices) {
//                channelMap.put(n + 1, randomChannelList[n])
//            }
//            return channelMap
//        }
    }
}