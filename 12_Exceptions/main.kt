import kotlin.random.Random

fun main() {
    val wheel = Wheel()
    try {
        repeat(10) { wheel.pumpUp() }
    } catch (e: IncorrectPressure) {
        println("Некорректное давление в колесе")
    } finally {
        println("Finally block")
    }


}

class TooHighPressure : Throwable(message = "Слишком высокое давление в колесе")

class TooLowPressure : Throwable(message = "Слишком низкое давление в колесе")

class IncorrectPressure : Throwable(message = "Некорректное давление в колесе")

