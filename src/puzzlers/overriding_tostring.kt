package puzzlers

sealed class Maybe<out T> {

    override fun toString() : String  = when(this) {
        is Maybe.Some<T> -> "Superclass.  Some payload: ${this.payload}"
        is Maybe.None -> "Superclass. None exception: ${this.exception}"
    }

    data class Some<T>(val payload: T) : Maybe<T>()
    data class None(val exception: Exception) : Maybe<Nothing>()

}

fun main(args: Array<String>) {
    val some = Maybe.Some(payload = "String of data")
    val none = Maybe.None(exception = Exception())

    println(some)
    println(none)
}