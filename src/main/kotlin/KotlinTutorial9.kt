fun main(){
//println(double(20))
    println(getMax2(b = 7, a = 12, c=100))
}
/*fun double (num: Int ): Int {
   return num * 2
*/
// The below code gave same as aboe, the below is called single expression function
 //fun double (num: Int) = num * 2

fun getMax2 (a:Int, b:Int) = if (a>b)a else b
fun getMax2 (a:Double, b:Double) = if (a>b)a else b
fun getMax2 (a:Int, b:Int, c:Int) = when {
    a>=b  && a>=c ->a
    b>=a && b>=c ->b
    else ->c

}


