fun main() {
    var age =60
    when(age){
        in 1..50->println("i am a child")
        in 51..60 ->{
            println("i am  not child")
            println("i am an adult")

        }
        else->{
            println("i am a child")
       println("i am  not child")

        }


    }
    if (age<18){
        println("i am not a child")
    }else{
        println("i am  child")
      if (age >60){
           println("i am an adult")
       }else{
          println("i am not an adult")
       }
    }

    if (age<18){
        println("i am not a child")
        println("i am   child")
    }else if(age<=60) {
        println("i am  not  or child")
        }else{
            println("i am not an adult")
        println( "i am a child")
        }
//    for loop
//    i is being loopred from 1 -10
    for (i in 1..10){
        println(i)
    }
//    while loop
//    it will do the incrimend manualy so that i will incrimet for each rotetion
    var i=0
    while (i<=10){
        println(i)
        i+=2

    }
//    do ..while
//    we do it manualy to sothat it can print all the numbers
    var j=0
    do {
        println(j)
        j+=5
    }while (j<=100)

  }

