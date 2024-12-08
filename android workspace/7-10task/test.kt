

open class Person(var name: String, var age: Int)
{
    fun person() {
        println("Person: $name, Age: $age")
    }
}

class Student(name: String, age: Int, var grade: String) : Person(name, age) {
    fun display() {
        println("Student: name:$name,age: $age, Grade is:: $grade")
    }
}

class Teacher(name: String, age: Int, var subject: String) : Person(name, age) {
    fun Tteacher() {
        println("Teacher: $name, Age: $age, Subject: $subject")
    }
}

class School {

    companion object {
        private var totalPeople = 0
    }

    fun addPerson(st:Student)
    {
        totalPeople++
    }

    fun addPerson(te:Teacher)
    {
        totalPeople++
    }

    fun getTotalPeople(): Int {
        return totalPeople
    }

}


fun main()
{
    var stu1 = Student("utsav", 19, "A")
    var stu2 = Student("vivek", 22, "B")
    var stu3 = Student("krisha",19,"A+")

    var t1 = Teacher(" mrs bansi", 26, "cs")
    var t2 = Teacher(" mr vivek",34,"PHP")

    var s1 = School()
    s1.addPerson(stu1)
    s1.addPerson(stu2)
    s1.addPerson(stu3)
    s1.addPerson(t1)
    s1.addPerson(t2)


    println("Students:")
    stu1.display()
    stu2.display()
    stu3.display()

    println("--------------------")
    println("Teachers:")
    t1.Tteacher()
    t2.Tteacher()

    println("")
    println("Total num: "+s1.getTotalPeople())



}