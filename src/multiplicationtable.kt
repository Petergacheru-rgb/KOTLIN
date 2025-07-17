fun main() {
    print("Enter a number: ")
    val num = readLine()!!.toInt()

    println("Multiplication Table of $num:")
    for (i in 1..12) {
        println("$num x $i = ${num * i}")
    }
}