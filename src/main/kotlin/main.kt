import kotlinx.coroutines.runBlocking

fun main() {
    val parallelExecutor = ParallelExecutor(capacity = 10)
    val seq = sequence {
        for (i in 0 until 100) {
            yield("$i")
        }
    }
    val resultCh = parallelExecutor.run(
        inputSeq = seq,
        callFunction = { word -> callApi(word) }
    )

    runBlocking {
        for (item in resultCh) {
            item.onSuccess {
                println(it)
            }.onFailure { ex ->
                throw ex
            }
        }
    }
}

suspend fun callApi(word: String) = "call-$word"