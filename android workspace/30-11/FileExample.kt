import java.io.File

fun main() {
    val fileName = "example.txt"

    val file = File(fileName)
    file.writeText("Hello, this is a file example in Kotlin")

    val content = file.readText()
    println("File content:")
    println(content)
}