package puzzlers

fun run() {
    val run: () -> Unit = {
        println("Run run run!")
    }

    // 新增一个 run 函数
    fun run() = println("Hello World")

    object : Runnable {
        override fun run() = run.invoke()
    }.run()
}

fun main(args: Array<String>) {
    run()
}