package puzzlers

fun f1(): Int {
    return return 42
}

fun f2() {
    throw throw Exception()
}

fun main() {
    println(f1())
    println(f2())
}