fun main() {
    //while loop
    /*  var i=0
      while(i<5) println(i++)*/

    //do loop
    /*  var i=5
      do { println(i)
          i++}
          while (i < 10)*/

  //  for (i: Int in 1..10) {
//to print break
//if (i==3) break
        // if (i in 4..7) break


        //to print with continue
//if (i !in 4..7) continue

        //to print out all and diffrentiate with marked
        //  if (i !in 4..7) print("*") else print(">")
        //println(i)

        /*
        val prefix = if(i==1){
            "*"
        }  else if (i !in 4..7) {
          "-"
        } else {
          print("-")
            ">"
        }
        println("$prefix $i")
    }*/

      /*  val time = 22
         if (time in 0..11) {
             println("Good Morning")
         } else if (time ==12){
                println("Time for lunch")

        }else {


            println ("Good day")
        }


}
*/
    val time = 12
    val  greeting = if (time in 0..11) {
        "Good Morning"
    } else if (time ==12){
        "Time for lunch"

    }else {


        "Good day"
    }
println(greeting)

}

