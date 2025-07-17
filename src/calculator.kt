import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter first number")
    val num1 = read.nextDouble()
    println("Enter operators(+,-,*,/)")

    val operator = readLine()!!

    println("Enter second number")
    val num2 = read.nextDouble()
    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 != 0.0) {
                num1 / num2
            } else {
                println("Error! Division by zero.")
                return
            }
        }
        else -> {
            println("Invalid operator.")
            return
        }
    }

    println("Result: $num1 $operator $num2 = $result")
}
