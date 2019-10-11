import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun doSomething() {}
fun main(args: Array<String>) {
    GlobalScope.launch {
        for (i in 0..100000) {
            launch {
                doSomething()
            }
        }
    }
    Thread.sleep(2000L) // プログラムを終了させない為にmain thread で2秒待つ
}
