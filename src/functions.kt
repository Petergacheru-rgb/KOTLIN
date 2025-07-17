fun main() {
    //Standard-Library Function/Built-in functions

    var result = Math.sqrt(81.0)
    println("The result is $result")

    var number = Math.round(73.9)
    println(number)

    school()
    divide()
    student(name="Peter", age = 20, gender = "Male")
    student(name="Peter", age = 20, gender = "Male")
    student(name="Peter", age = 20, gender = "Male")
}

//User-Defined Functions
fun school(){
    println("eMobilis")
}
fun divide (){
    var  num1 = 56
    var  num2 = 6
    println(num1/num2)
}
//Parameter and Argument
fun student(name: String,age: Int,gender: String){
    println("$name $age $gender")

}