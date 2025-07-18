class student {
    var name = "Peter"
    var gender = "Male"

    fun walk (){
        print("Walking")
    }
}

fun main() {
    var student1 = student()
    println(student1.gender)

    student1.walk()
}