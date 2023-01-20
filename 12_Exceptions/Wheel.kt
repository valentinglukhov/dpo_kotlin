import kotlin.random.Random

class Wheel() {
    var currentPressure: Double = 0.0
    val permissiblePressure = 1.6..2.5
    val notCriticalPressure = 0.0..10.0
    var incorrectPressure: Double = 0.0

    fun pumpUp(pumpUpPressure: Double) {
        if (pumpUpPressure in notCriticalPressure) {
            currentPressure += pumpUpPressure
        } else {
            incorrectPressure = pumpUpPressure
            throw IncorrectPressure()
        }
    }

    fun checkPressure() {
        when (currentPressure) {
            in -5.0..0.0 -> throw IncorrectPressure()
            in 10.1..15.0 -> throw IncorrectPressure()
            in 0.1..1.59 -> throw TooLowPressure()
            in 2.51..10.0 -> throw TooHighPressure()
            in permissiblePressure -> print(" Давление в колесах в норме. ")
        }
    }
}