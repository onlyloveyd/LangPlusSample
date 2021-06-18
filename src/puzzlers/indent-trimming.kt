package puzzlers

fun main(args: Array<String>) {
    val world = "multiline world"
    println("""
    	Hello
    	\$world
	""".trimIndent())
}