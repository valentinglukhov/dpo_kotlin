class Tv(brand: String, model: String, diagonalSize: Float, channelList: LinkedHashMap<Int, String>) {
    var isSwitchedOn: Boolean = false
        private set
    private val channelList: LinkedHashMap<Int, String> = channelList
    var currentVolume = 10
    var currentChannel = 1
    val brand = brand
    val channelsMax = channelList.size

    init {
        println("Телевизор $brand - $model, диагональ $diagonalSize\", количество каналов $channelsMax - создан.")
    }

    fun tvRemoteControl () {
        var exitRemoteControl = 0
        while (exitRemoteControl == 0) {
            println("""Вы выбрали телевизор $brand.
Меню телевизора:
1. Включить/выключить.
2. Вывести список доступных каналов.
3. Включить канал номер N.
4. Следующий канал.
5. Предыдущий канал.
6. Увеличить громкость.
7. Снизить громкость.
8. Выйти из меню телевизора.          
        """.trimMargin())
            when (readln()) {
                "1" -> turnOnOff()
                "2" -> printChannelList()
                "3" -> turnOnChannelNumber()
                "4" -> channelUp()
                "5" -> channelDown()
                "6" -> turnUpTheVolume()
                "7" -> turnDownTheVolume()
                "8" -> exitRemoteControl = 1
            }
        }
    }

    fun turnOnOff() {
        if (isSwitchedOn) {
            isSwitchedOn = !isSwitchedOn
            println("Телевизор $brand выключен.")
        } else {
            isSwitchedOn = !isSwitchedOn
            println("Телевизор $brand включен.")
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
                0 -> println("Звук выключен")
                else -> println("Громкость: $currentVolume")
            }
        } else {
            println("Звук выключен")
        }

    }

    fun turnOnChannelNumber(): Int {
        var channelNumber: Int
        if (!isSwitchedOn) turnOnOff()
        do {
                println("Введите номер канала:")
                channelNumber = (readln().toIntOrNull() ?: turnOnChannelNumber())
            if (channelNumber !in 1..channelsMax) {
                println("У телевизора $brand максимум $channelsMax каналов. Введите канал в пределах этого диапазона.")
            }
        } while (channelNumber !in 1..channelsMax)
        currentChannel = channelNumber
        println("Включен канал №$channelNumber - ${channelList[channelNumber]}")
        return currentChannel
    }

    fun channelUp() {
        if (currentChannel == channelsMax) {
            if (!isSwitchedOn) turnOnOff()
            currentChannel = 1
            println("Включен канал №$currentChannel - ${channelList[currentChannel]}")
        } else {
            if (!isSwitchedOn) turnOnOff()
            currentChannel++
            println("Включен канал №$currentChannel - ${channelList[currentChannel]}")
        }
    }

    fun channelDown() {
        if (currentChannel == 1) {
            if (!isSwitchedOn) turnOnOff()
            currentChannel = channelsMax
            println("Включен канал №$currentChannel - ${channelList[currentChannel]}")
        } else {
            if (!isSwitchedOn) turnOnOff()
            currentChannel--
            println("Включен канал №$currentChannel - ${channelList[currentChannel]}")
        }

    }

    fun printChannelList() {
        if (!isSwitchedOn) turnOnOff()
        println("Список каналов для телевизора $brand:")
        channelList.forEach { entry -> println("${entry.key} - ${entry.value}") }
    }

    companion object {
        const val maxVolume = 20
    }
}