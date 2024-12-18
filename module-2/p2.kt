open class Animal {

    open fun makeSound() {
        println("Some generic animal sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Woof! Woof!")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Meow! Meow!")
    }
}

fun main() {
    val dog = Dog()
    val cat = Cat()

    dog.makeSound()
    cat.makeSound()
}
