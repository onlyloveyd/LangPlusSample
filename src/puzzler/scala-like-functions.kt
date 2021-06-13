package puzzler

fun hello(): () -> Unit = {
    println("Hello, World")
}

fun main(args: Array<String>) {
    hello()
}
