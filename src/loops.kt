fun main() {
    //While Loop
    var count = 45
    while (count <= 50){
        println("Number is $count")
        count++
    }
  //Program 2
    var num = 10
    while (num >= 5){
        println("Number is $num")
        num--
    }

    //Do...WHile Loop
    var x = 1
    do {
        println("Number is $x")
        x++
    }
        while (x <= 5)

        //For Loop

        for (num in 30..40){
            println("Number is $num")
        }
         for (letter in 'a'..'d'){
             println("Letter is $letter")
         }
    //  Continue

    for (num in 1..10){
        if (num ==5) {
            continue
        }
            println("num = $num")
        }
    //Break
    for (letter in 'a'..'h'){
        if (letter=='f'){
            break
        }
        println("letter=$letter")
    }

    }




