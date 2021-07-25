package puzzlers

typealias L = (String) -> Unit

fun foo(one: L = {}, two: L = {}) {
    one("one")
    two("two")
}

fun main(args: Array<String>) {
    foo { print(it) }
    foo({ print(it) })
}