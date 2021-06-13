package puzzler

fun main(args: Array<String>) {
    val world = "multiline world"
    println(
        """
    	Hello
    	\$world
	""".trimIndent()
    )


//    val love = "OpenCV \nor Android"
//    println("""I Love $love""")
//    println("""I Love \$love""")

    val spaceTrim = """
        Yes
            No
        Other
    """.trim()
    println(spaceTrim)

    val spaceTrimMargin = """
        Yes
            No
        Other
    """.trimMargin()
    println(spaceTrimMargin)

    val spaceTrimIndent = """
        Yes
            No
        Other
    """.trimIndent()
    println(spaceTrimIndent)
    println()
    println()
    println()
    println()


    val marginOne = """
        |Yes
            |No
        |Other
    """.trimMargin()
    println(marginOne)

    val marginTwo = """
        >Yes
            >No
        >Other
    """.trimMargin()
    println(marginTwo)

    val marginThree = """
        >Yes
            >No
        >Other
    """.trimMargin(">")
    println(marginThree)

}