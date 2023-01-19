import kotlin.random.Random

class Wheel() {
    var currentPressure: Double = 0.0
    val permissiblePressure = 1.6..2.5
    val notCriticalPressure = -10.0..10.0

    fun pumpUp() {
        val pumpUpPressure = Random.nextDouble(-5.0, 15.0)
        if (pumpUpPressure in notCriticalPressure) {
            currentPressure += pumpUpPressure
            println(currentPressure)
            currentPressure = 0.0
        } else throw IncorrectPressure()
    }

    fun checkPressure() {

    }
}