package StringArray_03

fun main (){

    var c : Char = 'c'
    c = '\u0040'
    println("Copyright char = $c")

    val  myName = "Rafael"
    for(eachChar in myName) {

        println("eachchar: $eachChar")
    }
    myName.forEach {

        c: Char ->  println("forEach: $c")
    }

    val stringArray : Array<String> = arrayOf("a", "b", "c", "d")
    stringArray.forEach {
        string: String -> println("String = $string")
    }

    val intNumbers : Array<Int> = Array<Int>(5, { i -> 2 * i })
    intNumbers.forEach {
        number : Int -> println("Integers = $number")
    }

    val multiLineText = """
        Line1
        Line2
    """
    println("MultilineText: $multiLineText")

    val multiLineComplexText = """
    | These are the Kotlin from Scratch tutorial files
    | Available as a Udemy course
    | I am the student, Rafael Câmara Pereira
    | Brazilian, Java Android developer
    | Msc in Computer Engineering
    | Currently living in Lleida, Catalonia, Spain
    """.trimMargin("|")
    println("Complex Text: $multiLineComplexText")

}