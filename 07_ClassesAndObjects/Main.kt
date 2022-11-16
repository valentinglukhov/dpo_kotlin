fun main() {
    val samsungTv = Tv("Samsung", "Galaxy", 57.0F, Channels.getRandomChannelMap())
    val sonyTv = Tv("Sony", "Super Flat", 59.0F, Channels.getRandomChannelMap())
    var exitProgram = 0
    while (exitProgram == 0) {
        println("""Выберите с каким телевизором будете работать:
1. Samsung
2. Sony

По умолчанию все телевизоры сейчас выключены.
Нажмите 0 для выхода из меню.
        """.trimMargin())
        when (readln()) {
            "1" -> samsungTv.tvRemoteControl()
            "2" -> sonyTv.tvRemoteControl()
            "0" -> exitProgram = 1
        }
    }
//    samsungTv.printChannelList()
//    sonyTv.printChannelList()
//    samsungTv.turnOnOff()
//    sonyTv.turnOnOff()
//    sonyTv.turnOnOff()
//    samsungTv.turnOnOff()
//    samsungTv.turnOnOff()
//    samsungTv.turnOnOff()
//    samsungTv.turnOnOff()
//    samsungTv.turnUpTheVolume()
//    samsungTv.turnDownTheVolume()
//    samsungTv.turnDownTheVolume()
//    samsungTv.turnDownTheVolume()
//    samsungTv.turnDownTheVolume()
//    samsungTv.turnDownTheVolume()
//    samsungTv.turnDownTheVolume()
//    samsungTv.turnOnOff()
//    samsungTv.turnDownTheVolume()
//    samsungTv.turnDownTheVolume()
//    samsungTv.turnDownTheVolume()
//    samsungTv.turnUpTheVolume()
//    samsungTv.turnUpTheVolume()
//    samsungTv.turnUpTheVolume()
//    samsungTv.turnOnOff()
//    samsungTv.turnDownTheVolume()
//    samsungTv.turnDownTheVolume()
//    samsungTv.turnOnOff()
//    samsungTv.turnOnChannelNumber(7)
//    samsungTv.printChannelList()
//    sonyTv.printChannelList()
//    sonyTv.channelUp()
//    sonyTv.channelUp()
//    sonyTv.channelUp()
//    sonyTv.channelUp()
//    sonyTv.channelUp()
//    sonyTv.channelUp()
//    sonyTv.channelUp()
//    sonyTv.channelUp()
//    sonyTv.channelUp()
//    sonyTv.channelDown()
//    sonyTv.channelDown()
//    sonyTv.channelDown()
//    sonyTv.turnOnChannelNumber(16)
//    sonyTv.turnOnChannelNumber(4)
//    sonyTv.turnOnChannelNumber(6)
//    sonyTv.turnOnChannelNumber(2)
//    sonyTv.channelDown()
//    sonyTv.channelDown()
//    sonyTv.channelDown()
//    sonyTv.channelDown()
}
