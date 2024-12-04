
open class Vehicle {
    fun start() {
        println("Vehicle is starting")
    }
}

open class Car : Vehicle() {
    fun drive() {
        println("Car is driving")
    }
}
class SportsCar : Car() {
    fun accelerate() {
        println("SportsCar is accelerating")
    }
}

fun main() {

    val sportsCar = SportsCar()
    sportsCar.start()
    sportsCar.drive()
    sportsCar.accelerate()
}
