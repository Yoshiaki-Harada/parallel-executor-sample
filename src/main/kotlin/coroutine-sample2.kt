import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


suspend fun apiCall() {
    println("Call Api")
    delay(1000)
    println("Return Response")
}

fun main(args: Array<String>) {
    runBlocking {
        println("main start")
        launch {
            apiCall() // coroutineを中断し、スレッドを解放する
        }
        delay(500)
        println("main end")
        delay(1500)
    }
}
