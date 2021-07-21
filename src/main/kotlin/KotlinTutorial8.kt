fun main() {
/*greet("hans", res=3)
}
fun greet (name: String, res: Int) {
    for (i: Int in 0 until res) {
        println("Hello $name! nice to meet you")
    }
}*/
  //val max=  getMax(num1 = 12, num2 = 4)
//println(max)
    //Below code gives the same output as above
    println(getMax(num1 = 12, num2 = 4))
}


fun getMax(num1: Int, num2: Int) : Int{
    var max = if (num1 > num2) num1 else (num2)
   return max
}