package puzzlers

fun f1() {
    (1..4).forEach {
        if (it == 2) return
        print(it)
    }
}

fun f2() {
    (1..4).forEach(fun(it) {
        if (it == 2) return
        print(it)
    })
}

fun main(args: Array<String>) {
    f1()
    f2()
}