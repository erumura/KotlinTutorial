fun main() {
    val time = 1
    val isSunday= false
    val greeting = when {
        isSunday -> "Will be on bed all day"
      time  in 0..4 -> "why up so early?"

     time   in 0..11 -> "Good Morning!"

     time ==  12 -> "Time for lunch!"
      time ==  13 || time == 14 -> {
            println("yawn...")
            " time for nap!"

        }
        else -> "Good day!"
    }
    println(greeting)

}