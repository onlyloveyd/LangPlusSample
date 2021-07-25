package puzzlers

class Population(var cities: Map<String, Int>) {
    val `san francisco` by cities
    val `tallinn` by cities
    val `kotlin` by cities
}

val population = Population(mapOf(
    "san francisco" to 864_816,
    "tallinn" to 413_782,
    "kotlin" to 43_005)
)

fun main(args: Array<String>) {
    // many years have passed, now all humans live on Mars
    population.cities = emptyMap()

    with(population) {
        println("$`san francisco`; $tallinn; $kotlin")
    }
}