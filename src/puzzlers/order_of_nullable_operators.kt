package puzzlers

fun main(args: Array<String>) {
    val x: Int? = 2
    val y: Int = 3

    val sum = x?:0 + y

    println(sum)
}