fun main(){
println(GetSum( 2,  6,4,5, 7,10))
   // arrayOf(2,4,7,8,9)
}
fun GetSum (vararg number:Int): Int{
    var sum = 0
    for (num: Int in number ) sum += num
    return sum
}