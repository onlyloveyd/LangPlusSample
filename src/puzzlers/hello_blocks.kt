package puzzlers

fun hello(block: String.() -> Unit) {
    "Hello1".block()
    block("Hello2")
}

fun main(args: Array<String>) {
    hello { print(this) }
}