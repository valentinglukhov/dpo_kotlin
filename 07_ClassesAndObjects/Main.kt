fun main() {
    val samsungTv = Tv("Samsung", "Galaxy", 57.0F, Channels.getRandomChannelMap())
    val sonyTv = Tv("Sony", "Super Flat", 59.0F, Channels.getRandomChannelMap())
    samsungTv.printChannelList()
    sonyTv.printChannelList()
    samsungTv.turnOnOff()
    sonyTv.turnOnOff()
    sonyTv.turnOnOff()
    samsungTv.turnOnOff()
    samsungTv.turnOnOff()
    samsungTv.turnOnOff()
    samsungTv.turnOnOff()
    samsungTv.turnUpTheVolume()
    samsungTv.turnDownTheVolume()
    samsungTv.turnDownTheVolume()
    samsungTv.turnDownTheVolume()
    samsungTv.turnDownTheVolume()
    samsungTv.turnDownTheVolume()
    samsungTv.turnDownTheVolume()
    samsungTv.turnOnOff()
    samsungTv.turnDownTheVolume()
    samsungTv.turnDownTheVolume()
    samsungTv.turnDownTheVolume()
    samsungTv.turnUpTheVolume()
    samsungTv.turnUpTheVolume()
    samsungTv.turnUpTheVolume()
    samsungTv.turnOnOff()
    samsungTv.turnDownTheVolume()
    samsungTv.turnDownTheVolume()
    samsungTv.turnOnOff()
    samsungTv.turnOnChannelNumber(7)
}
//var channelMap = mutableMapOf<Int, String>(
//    1 to "Матч!",
//    2 to "Первый канал",
//    3 to "Россия 1",
//    4 to "Россия 24",
//    5 to "НТВ",
//    6 to "ТНТ",
//    7 to "Пятница",
//    8 to "Карусель",
//    9 to "Звезда",
//    10 to "Мир"
//)