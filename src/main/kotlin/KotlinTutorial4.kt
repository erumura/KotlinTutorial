fun main(){
    println("2>1 is  ${2>1}")
    println("2<1 is  ${2<1}")
    println("1>=1 is  ${1>=1}")
    println("1==1 is  ${1==1}")
    println("2==1 is  ${2 ==1}")
    println("2!=1 is  ${2 !=1}")
    println("!2>1 is  ${!(2>1)}")

    println("true && false = ${true && false}")
    println("true || false = ${true || false}")

    //val condition = (2>1 )|| (3>2) && (2>3)
    val condition = ((2>1 )|| (3>2)) && (2>3)

    println(condition)






}