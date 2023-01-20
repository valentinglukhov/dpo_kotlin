import kotlin.random.Random

fun main() {
    val wheel = Wheel()
    val pumpUp = runCatching { wheel.pumpUp(15.0) }

    if (pumpUp.isSuccess) {
        print("При накачке ${wheel.currentPressure} атмосфер процедура удалась.")
        val checkPressure = runCatching { wheel.checkPressure() }
        if (checkPressure.isSuccess) {
            println("Эксплуатация возможна.")
        } else {
            when (checkPressure.exceptionOrNull()) {
                is IncorrectPressure -> println("При накачке ${wheel.incorrectPressure} атмосфер процедура не удалась.")
                is TooHighPressure ->
                    println(" Эксплуатация невозможна — давление превышает нормальное.")

                is TooLowPressure ->
                    println(" Эксплуатация невозможна — давление ниже нормального.")
            }
        }
    } else {
        println("При накачке ${wheel.incorrectPressure} атмосфер процедура не удалась.")
    }
}

class TooHighPressure : Throwable(message = "Слишком высокое давление в колесе")

class TooLowPressure : Throwable(message = "Слишком низкое давление в колесе")

class IncorrectPressure : Throwable(message = "Некорректное давление в колесе")

