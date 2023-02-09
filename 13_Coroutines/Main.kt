import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            println("1123")
            delay(2000)
            println("12321122")

        }
    }

}
