class Employee(var name: String, var position: String,var salary: Double,var status: String){
    fun work(){
        println("EMployee is working")
    }
}

fun main() {
    var employee1 = Employee("Martha","CEO",560000.00,"Married")

    println(employee1.name + " " + employee1.position + " " + employee1.salary +" "+ employee1.status)

    var employee2 = Employee("JOB","HR",500000.00,"Single")

    println(employee2.name + " " + employee2.position + " " + employee2.salary +" "+ employee2.status)

    var employee3 = Employee("Mathew","Secretary",150000.00,"Married")

    println(employee3.name + " " + employee3.position + " " + employee3.salary +" "+ employee3.status)

    var employee4 = Employee("ANN","Receptionist",90000.00,"Married")

    println(employee4.name + " " + employee4.position + " " + employee4.salary +" "+ employee4.status)
}