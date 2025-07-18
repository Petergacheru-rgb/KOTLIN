//This is the parent class /Super class/Base class
open class Animal{
    var hasFeathers = true
    var hasWings = false

    fun speak (){
        println("ANimal is speaking")
    }
}
//Child CLass
class Duck: Animal(){
    var color ="White"
    fun swim(){
        println("Duck is swimming")
    }
}

fun main() {
    var a = Animal()

    var d = Duck()
    d.speak()
    println(d.color)
}