import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


fun main() {
    GlobalScope.launch {
        delay(1000L) // 1秒待つ
        println("World!") // print after delay
    }
    println("Hello,")
    Thread.sleep(2000L) // プログラムを終了させない為にmain thread で2秒待つ
}