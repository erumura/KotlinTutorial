fun main(args: Array<String>) {
val time = 14
    val  greeting = when (time) {
in 0..4 ->     "why up so early?"

        in 0..11 ->  "Good Morning!"

        12 ->         "Time for lunch!"
        13, 14 -> {
            println("yawn...")
            " time for nap!"

        }
        else ->        "Good day!"
        }
       println(greeting)

}
