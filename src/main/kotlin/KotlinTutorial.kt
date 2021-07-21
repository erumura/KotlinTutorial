



fun main() {
    var a = 5
    val b = 3
println("a =" + a + "b = "+b)
    println("a+b = ${a+b}")
    println("a-b = ${a-b}")
    println("a*b = ${a*b}")
    println("a/b = ${a/b}")

    println("a%b = ${a%b}")
    println("2+2*3 = ${2+2*3}")
    println("2+2*3 = ${(2+2)*3}")
    a += 2
    println("a+=2:$a")

    println("a++ :${a++}")
    println("++a :${++a}")
    println("++a :${++a}")

    println("a-- :${a--}")
    println("--a :${--a}")
    println("--a :${--a}")

    a -= 2
    println("a-=2:$a")
    a *= 2
    println("a*=2:$a")
    a /= 2
    println("a/=2:$a")
    a %= 2
    println("a%=2:$a")
    }

