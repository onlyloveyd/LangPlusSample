package puzzlers

class Lazy {
    var x = 0
    val y by lazy { 1/x }

    fun hello() {
        try {
            print(y)
        } catch (e: Exception) {
            x = 1
            print(y)
        }
    }
}

fun main(args: Array<String>) {
    Lazy().hello()
}