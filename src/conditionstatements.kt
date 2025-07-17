import  java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter any number : ")
    var nummber =  read.nextInt()

    if (nummber > 0){
        println("$nummber is positive")
    }
    else if (nummber <  0){
        println("$nummber is negative")
    }
    else{
        println("$nummber is neutral")
    }

}