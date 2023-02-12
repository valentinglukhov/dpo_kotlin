import kotlinx.coroutines.*

fun main() {
    runBlocking {
        val scope = CoroutineScope(this.coroutineContext)
        scope.launch {
                for (i in 1..300) {
                    delay(10)
                    if (i % 100 == 0) println(".") else print(".")
                }
            }

        launch {
            delay(500)
            Fibonacci.take(10000)
        }
        launch {
            delay(1000)
            Fibonacci.take(15000)
        }
        try {
            withTimeout(3000) {
                delay(3000)
                launch { Fibonacci.take(50000) }
            }
        } catch (_: Exception) {
            println("\nПревышен таймаут вычисления.")
        }
    }
}

