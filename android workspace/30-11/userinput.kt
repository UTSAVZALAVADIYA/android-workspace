package t2911


fun main() {


    println("Enter the size of the array:")
    val size = readLine()!!.toInt()


    val numbers = IntArray(size)
    println("Enter $size numbers:")
    for (i in 0 until size) {
        numbers[i] = readLine()!!.toInt()
    }



    println("Array elements are:")
    for (num in numbers) {
        println(num)
    }
}
