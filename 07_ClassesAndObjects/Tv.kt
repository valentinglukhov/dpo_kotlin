class Tv(brand: String, model: String, diagonalSize: Float) {
    var isSwitchedOn: Boolean = false
        private set
    private var channelList = mutableMapOf<Int, String>()

    fun turnOn () {
        if (isSwitchedOn) {
            println("Телевизор уже включен.")
        } else {
            !isSwitchedOn
            println("Телевизор включен.")
        }
    }

    companion object {
        const val maxVolume = 20
    }

}