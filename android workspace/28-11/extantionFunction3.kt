package tops28


class Person {
    fun isAdult(age: Int): Boolean
    {
        return age >= 18
    }
}


fun main()
{
    val person = Person()
    println("Adult Status: " + person.isAdult(25))
    println("Voting Eligibility: " + person.canVote(25))
}

fun Person.canVote(age: Int): Boolean {
    return age >= 18
}
