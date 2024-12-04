class Employee {

    fun display(empId: Int, name: String) {
        println("Employee ID: $empId")
        println("Employee Name: $name")
    }

    fun display(empId: Int, name: String, salary: Double) {
        println("Employee ID: $empId")
        println("Employee Name: $name")
        println("Employee Salary: $$salary")
    }
}

fun main() {
    val employee = Employee()

    employee.display(1001, "utsav")
    println("===============================================")

    employee.display(1002, "uday", 75000.00)
}
