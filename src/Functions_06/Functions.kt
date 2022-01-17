package Functions_06
/*
fun addTwoInts(x : Int, y : Int) : Int {
    return x + y
}
*/
fun addTwoInts(x : Int, y : Int) : Int = x + y

fun rectangleArea(width : Double, height : Double = width) : Double = width * height

fun greet(person : String?) : Unit {

    print("Good afternoon ")

    if(person != null)
        print("$person")

    println("")
}

fun functionA(vararg intParams : Int){
    for (integer in intParams){
        println("Integer = $integer")
    }
}

infix fun Int.plus(x : Int) : Int {
    return this + x
}

tailrec fun factorial (n : Long = 1, fact : Long = 1) : Long {
    if(n == 1L)
        return fact
    return factorial(n - 1, n * fact)
}

fun main (){

    println("Add 2 numbers = ${addTwoInts(10, 20)}")
    println("Area of a rectangle = ${rectangleArea(10.0)}")
    greet("Rafael Pereira")
    functionA(1, 2, 3, 4)
    println("Single parameter")
    functionA(10)
    println("3 + 2 = ${3 plus 2}")
    println("Factorial = ${factorial(25)}")

}