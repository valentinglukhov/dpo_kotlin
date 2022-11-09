fun main() {
    val samsungTv = Tv("Samsung", "Galaxy", 27.0F)
    println(samsungTv.isSwitchedOn)
    samsungTv.turnOn()
    println(samsungTv.isSwitchedOn)
}