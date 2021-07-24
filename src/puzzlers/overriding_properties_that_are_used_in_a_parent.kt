package puzzlers

open class Parent(open val a: String) {
    init { print(a) }
}

class Children(override val a: String): Parent(a)

fun main(args: Array<String>) {
    Children("abc")
}