package puzzlers

fun main(args: Array<String>) {
    val s: String? = null
//    if (s?.isEmpty()) println("is empty")
    if (s?.isEmpty() == true) println("is empty")
    if (s.isNullOrEmpty()) println("is null or empty")
}