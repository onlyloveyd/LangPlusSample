package puzzlers

open class AA(val x: Any?)

object BB : AA(CC)
object CC : AA(BB)

fun main(args: Array<String>) {
    println(BB.x)
    println(CC.x)
}