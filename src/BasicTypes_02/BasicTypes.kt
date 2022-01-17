package BasicTypes_02

fun main (args: Array<String>){
    println("Hello world")

    var x : Double = 3.156
    println("x = $x")
    x = 5.23
    println("x = $x")

    val creditCardNumber = 1234_1234_1234_1234L
    println("Credit card: $creditCardNumber")

    val aNullableInt : Int?
    aNullableInt = 20
    println("Nullable int: $aNullableInt")

    val anInt : Int? = 123
    val aLong : Long? = anInt?.toLong()
    println("A long nullable: $aLong")

    var aConvertedFloat = "123.45".toFloat()
    println("Float Converted: $aConvertedFloat")

    var a : Double = 0.0
    var b : Double = -0.0
    if(a == b)
        println("a and b are equals")
    else
        println("a and b are different")

    var z : Double = 10.00
    var a1 : Double = z
    var b1 : Double = z
    if(a1 === b1)
        println("a1 and b1 are identicals")
    else
        println("a1 and b1 are different")

    val aTrue1 = (100 > 99) && (2 > 1)
    println("True value && = $aTrue1")

    val aTrue2 = (100 > 99) || (10 > 100)
    println("True value || = $aTrue2")
}