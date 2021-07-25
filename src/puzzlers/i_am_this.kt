package puzzlers

data class IAm(var foo: String) {
    fun hello() = foo.apply {
        return this
    }
}

fun main(args: Array<String>) {
    println(IAm("bar").hello())
}