import kotlinx.coroutines.*

fun main() {
    runBlocking {
        launch {
            for (i in 1..500) {
                delay(10)
                if (i % 200 == 0) println(".") else print(".")
            }
        }

        launch {
            delay(1000)
            Fibonacci.take(10000)
        }
        launch {
            delay(1500)
            Fibonacci.take(15000)
        }
        withTimeout(3000) {
            delay(3000)
            launch { Fibonacci.take(50000) }
        }

    }
}

