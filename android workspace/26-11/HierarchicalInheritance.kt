
open class A
{
    fun A1()
    {
        println(" A called")
    }
}

class B : A()
{
    fun B1()
    {
        println(" b called")
    }
}

class C : A()
{
    fun C1()
    {
        println(" c called")
    }
}

fun main()
{
    var B=B()
    B.A1()
    B.B1()

    println("")

    var C=C()
    C.A1()
    C.C1()
}
