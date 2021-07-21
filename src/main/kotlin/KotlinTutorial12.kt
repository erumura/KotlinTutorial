const val TOP_LEVEL_VARIABLE = "i am a constant variable"
fun main(){
println(getNewMax(23, 50,23,2,67,23))
    println(TOP_LEVEL_VARIABLE)
}
fun getNewMax(first: Int, vararg remaining: Int): Int{
var max: Int= first
    for (i: Int in remaining ){
        if (i> max) max = i
println(TOP_LEVEL_VARIABLE)
    }
return max
}