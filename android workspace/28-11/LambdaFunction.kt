class Calculator {
    fun operate(a: Int, b: Int, operation: (Int, Int) -> Int)
    {
        val result = operation(a, b)
        println("The result of the operation is: $result")
    }
}

fun main() {
    val calculator = Calculator()

    val add: (Int, Int) -> Int = { x, y -> x + y }

    calculator.operate(10, 20, add)

    calculator.operate(10, 20) { x, y -> x * y }
}
