package puzzlers

operator fun (() -> Unit).plus(f: () -> Unit) = {
    this()
    f()
}

fun main(args: Array<String>) {
    ({ print("Hello, ") } + { print("World") })()
}

//val aa = println("hello")
//val a = { println("hello") }
//fun b() = println("b")
//fun c() = { println("c") }
//fun d(e: () -> Unit) {
//    e()
//}
//
//fun f(e: () -> Unit) = {
//    e()
//}
//
//fun main(){
//    println(aa)
//    println(a)
//    b()
//    c()()
//    c().invoke()
//    d(c())
//    f(c())()
//}