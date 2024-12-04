

fun main()
{
    val a: Double = 23.5
    val b: Double = 19.8

    val smaller = a smallerThan b
    println("The smaller number is: $smaller")
}

infix fun Double.smallerThan(other: Double): Double {
    return if (this < other) this else other
}
