package puzzlers

fun numbers(list: List<Int>) {
    list.forEach {
        if (it > 2) return
        print(it)
    }
    print("ok")
}

fun main(args: Array<String>) {
    numbers(listOf(1, 2, 3))
}