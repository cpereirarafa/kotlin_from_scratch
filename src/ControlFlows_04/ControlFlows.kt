package ControlFlows_04

fun main (){

    var a : Double = 1.2
    var b : Double = 5.2
    var comparative = if(a > b) "larger than" else if (a < b) "smaller than" else "equals to"
    println("A is $comparative B")
/*
    if(a == b)
        println("A is equal to B")
    else if(a > b)
        println("A is larger than B")
    else
        println("A is smaller than b")
*/

    var c : Char = 'a'
    var charResult : String = when (c){
        'a' -> "First char of the alphabet"
        'z' -> "Last char of the alphabet"
        else -> "Another char of the alphabet"
    }
    println ("Char of the alphabet = $charResult")

    fun checknumber (inputNumber : Int) = when (inputNumber){
        0 -> {
            println("Number is 0")
            println("Using 2 line cases")
        }
        1,2 -> println("Number is 1 or 2")
        in 3 .. 10 -> println("Number between 3 and 10")
        else -> println("Number bigger than 10")
    }

    checknumber(10)

    val intArray : Array<Int> = arrayOf(11, 22, 43, 55)
    println("A normal for loop:")
    for(intNumber in intArray)
        println("Number = $intNumber")

    println("A for loop using indexes:")
    for(idx in intArray.indices)
        println("Value at index $idx = ${intArray[idx]}")

    println("A for loop using a pair of indexes and values:")
    for((idx, value) in intArray.withIndex())
        println("Value at index $idx = $value")

    var x : Long = 10
    while(x > 0)
        println("x = ${x--}")
}