package puzzlers

open class C {
    open fun sum(x: Int = 1, y: Int = 2): Int = x + y
}

class D : C() {
    override fun sum(y: Int, x: Int): Int = super.sum(x, y)
}

fun main(args: Array<String>) {
    val d: D = D()
    val c: C = d
    print(c.sum(x = 0))
    print(d.sum(x = 0))
}