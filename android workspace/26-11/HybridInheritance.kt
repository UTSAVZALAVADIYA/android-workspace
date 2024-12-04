package t2611

open class Animal {
    fun animal() {
        println("This is an Animal")
    }
}
open class Bird : Animal() {
    fun bird() {
        println("This is a Bird")
    }
}

interface Flyable {
    fun fly() {
        println("This can fly")
    }
}

class Eagle : Bird(), Flyable {
    fun eagle() {
        println("This is an Eagle")
    }
}

fun main() {

    val eagle = Eagle()

    eagle.bird()
    eagle.fly()
    eagle.animal()
    eagle.eagle()

    println("")

    val bird = Bird()
    bird.bird()
    bird.animal()
}
