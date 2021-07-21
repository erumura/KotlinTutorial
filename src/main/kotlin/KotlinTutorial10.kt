fun main () {
/*greet("david", 2)
    greet(1, "whats up with you?")
}
fun greet (name: String, res: Int) {
    for (i: Int in 0 until res)
        println("Hello $name! nice to meet you")
    }

    fun greet (res: Int, message: String ) {
    for (i: Int in 0 until res) println(message)
}*/

    greet(
        message = "how are you",
    name = "deandavid",
                res =  2
    )
}
    fun greet (message: String, name: String= "user", res: Int=1) {
        for (i: Int in 0 until res)
            println("Hello $name! nice to meet you")}


