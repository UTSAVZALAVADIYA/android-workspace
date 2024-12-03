fun main() {
    println("Enter Any Character: ")
    val char = readln().toString()

    if (char.length == 1) {

        if (char == "a" || char == "A") {
            println("$char is a vowel")
        } else if (char == "e" || char == "E") {
            println("$char is a vowel")
        } else if (char == "i" || char == "I") {
            println("$char is a vowel")
        } else if (char == "o" || char == "O") {
            println("$char is a vowel")
        } else if (char == "u" || char == "U") {
            println("$char is a vowel")
        } else {
            println("$char is a consonant")
        }
    } else {
        println("Please Enter Only One Character....")
    }
}
