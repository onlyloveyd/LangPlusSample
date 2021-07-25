package puzzlers

fun main(args: Array<String>) {
    val j = wtf@{ n: Int -> wtf@(wtf@n + wtf@2) }(10)
    print(j)
}