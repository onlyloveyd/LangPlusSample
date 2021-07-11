package puzzlers

fun main(args: Array<String>) {
    val readonly = listOf(1, 2, 3)

    if (readonly is MutableList) {
        readonly.add(4)
    }

    println(readonly)
}