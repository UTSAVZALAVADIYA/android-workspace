
class student(name:String, eno:Int)
{
    var Name=name
    var Eno=eno

    companion object
    {
        var collage="ABC"
        fun displayCollage()
        {
            println("Your Collage Name Is : $collage")
        }
    }

    fun diplay()
    {
        println("Your Name Is : $Name")
        println("Your Enrollment Number Is : $Eno")
    }
}

fun main()
{
    println("Enter Your Name : ")
    var name= readln().toString()

    println("Enter Your Enrollment Number ")
    var eno= readln().toInt()

    var STU=student(name,eno)
    STU.diplay()
    student.displayCollage()

    println("")

    var student2=student("xyz",102)
    student2.diplay()
    student.displayCollage()



}
