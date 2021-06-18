package puzzlers

fun printNumberSign(num: Int) {
    if (num < 0) {
        "negative"
    } else if (num > 0) {
        "positive"
    } else {
        "zero"
    }.let { print(it) }
}

fun main(args: Array<String>) {
    printNumberSign(-2)
    print(",")
    printNumberSign(0)
    print(",")
    printNumberSign(2)
}