package puzzlers

fun main(args: Array<String>) {
    println(listOf(1, 2, 3) == listOf(1, 2, 3))
    println(listOf(1, 2, 3).asSequence() == listOf(1, 2, 3).asSequence())
    println(sequenceOf(1, 2, 3) == sequenceOf(1, 2, 3))
}