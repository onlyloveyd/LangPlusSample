package puzzlers

open class Node(val name: String) {
    fun lookup() = "lookup in: $name"
}

class Example : Node("container") {
    fun createChild(name: String): Node? = Node(name)

    val child1 = createChild("child1")?.apply {
        println("child1 ${lookup()}")
    }
    val child2 = createChild("child2").apply {
        println("child2 ${lookup()}")
    }
}

fun main(args: Array<String>) {
    Example()
}