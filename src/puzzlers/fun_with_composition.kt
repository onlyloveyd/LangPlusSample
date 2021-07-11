package puzzlers

val increment = { i: Int -> i + 1 }
val bicrement = { i: Int -> i + 2 }
val double = { i: Int -> i * 2 }
val one = { 1 }

infix fun <T, R> (() -> T).then(another: (T) -> R) = { another(this()) }
operator fun <T, R1, R2> ((T) -> R1).plus(another: (T) -> R2): (T) -> Pair<R1, R2> = { x: T -> this(x) to another(x) }

fun main(args: Array<String>) {
    val equilibrum = one then double then (increment + bicrement)
    println(equilibrum())
//    val step1 = one then double then ({ i: Int -> i + 1 to i + 2 })
//    val step2 = { double(one()) } then ({ i: Int -> i + 1 to i + 2 })
//    val step3 = { { i: Int -> i + 1 to i + 2 }(double(one())) }
//    val step4 = { double(one()) + 1 to double(one()) + 2 }
//    val step5 = { 2 + 1 to 2 + 2 }
//    val step6 = { 3 to 4 }

//    print(step6())
}

infix fun String.love(lover: String): String {
    return "$this love $lover"
}