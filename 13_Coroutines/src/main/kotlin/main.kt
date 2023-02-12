import kotlinx.coroutines.*

suspend fun main() {
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        println("")
    }
    val scopeJob = Job()
    val scope = CoroutineScope(exceptionHandler + scopeJob)

    scope.launch {
        launch {
            for (i in 1..1000) {
                delay(100)
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
                Fibonacci.take(50000)
            }
        } catch (_: Exception) {
            println("\nПревышен таймаут вычисления.")
            scopeJob.cancel()
        }
    }.join()

}

