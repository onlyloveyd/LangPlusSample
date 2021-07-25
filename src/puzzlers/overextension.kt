package puzzlers

operator fun String.invoke(x: () -> String) = this + x()
fun String.z() = "!$this"
fun String.toString() = "$this!"

fun main(args: Array<String>) {
    println("x"{"y"}.z())
}