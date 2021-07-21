fun main(){
    val names= arrayOf("james", "jane", "joe", "jeremy", "john")

    for (index : Int in names.indices)

        println("index: $index Element: ${names [index ]}")
  // var hello1= "HELLO"


 ////   for (hello: Char in hello1)
    //    println(hello)

//for (printname: String in names)
 //   println(printname)

//    //This will print 1 to 10
for (i : Int in 1..10)// same as below

    //This will print 1 to 10
    for (t :Int in 1 until 11)
    println(t)

    //This will pirnt in decending order 10 to 1
   for (r :Int in 10 .. 1)//same as below

   //This will print in desending order 11 to 1
        for (w: Int in 11 downTo  1)
     println(w)

    //This will print the range but will always skip one number
    for (odd : Int in 10 until 30 step 2)
        println(odd)

}
