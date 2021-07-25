package puzzlers

data class Container(
    val name: String,
    private val items: List<Int>
) : List<Int> by items

fun main(args: Array<String>) {
    val (name, items) = Container("Kotlin", listOf(1, 2, 3))
    println("Hello $name, $items")
}