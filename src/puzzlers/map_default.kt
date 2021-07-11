package puzzlers


fun main(args: Array<String>) {
    val map = mapOf<Any, Any>().withDefault{
        "default"
    }

    println(map.getValue("hello"))
    println(map["hello"])

//    val map = mutableMapOf<String, Set<String>>().withDefault { mutableSetOf() }
//
//    var property: Set<String> by map
}
