package amr.belajar.kotlin.coroutine.app
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis
@OptIn(InternalCoroutinesApi::class)
fun main() = runBlocking {
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println("Completed in $timeOne ms vs $timeTwo ms")

    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Your profit is ${income.await() - capital.await()}")
    launch {
        delay(1000)
        println("Coroutine!")
    }
    println("Hello,")
    delay(2000)

    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.join()
    println("Other task")

    val job1 = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job1!")
    }

    job1.start()
    println("Other task1")

    val job2 = launch {
        delay(5000)
        println("Start new job2!")
    }

    delay(2000)
    job2.cancel(CancellationException("time's up!"))
    println("Cancelling job2...")
    if (job2.isCancelled){
        println("job2 is cancelled because ${job2.getCancellationException().message}")
    }

}

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}