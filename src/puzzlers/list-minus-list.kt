package puzzlers

//
//fun main(args: Array<String>) {
//    val list = listOf(1, 2, 3)
//    print(list - 1)
//    print(list - listOf(1))
//
//    val ones = listOf(1, 1, 1)
//    print(ones - 1)
//    print(ones - listOf(1))
//
//
//}

//fun main() {
//    val list = listOf(1, 2, 3)
//    println(2 in list)
//    println(4 in list)
//    println(list + 5)
//    println(list + listOf(1, 2, 3))
//    println(list + arrayOf(1, 2, 3))
//    println(list + sequenceOf(1, 2, 3))
//
//    val (v, w, x) = list
//    println(v)
//    println(w)
//    println(x)
//
//    println(list.component1())
//    println(list.component2())
//    println(list.component3())
//    println(list.component4())
//    println(list.component5())
//
//}


operator fun Location.minus(location: Location): Location {
    return Location(this.x - location.x, this.y - location.y)
}

operator fun Location.plus(location: Location): Location {
    return Location(this.x + location.x, this.y + location.y)
}

operator fun Location.contains(location: Location): Boolean {
    return this.x > location.x && this.y > location.y
}


class Location(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y

    override operator fun equals(other: Any?): Boolean =
        other is Location && this.x == other.x && this.y == other.y

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }

    override fun toString(): String {
        return "($x, $y)"
    }
}

fun main() {
    val location = Location(520, 1314)
    val (x, y) = location

    println(x)
    println(y)

    val other = Location(1, 2)
    println(location - other)
    println(location + other)
    println(location == other)
    println(other in location)
}
