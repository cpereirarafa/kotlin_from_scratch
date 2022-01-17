package JumpReturn_05

fun main (){

    val intArray : Array<Int> = arrayOf(10, 20, 30, 40, 0, 50, 60)

    println("For with break")
    for(number in intArray){

        if(number == 30)
            break

        println("Number in array = $number")
    }

    println("For with continue")
    for(number in intArray){
            if(number == 0)
                continue

            println("Number in array = $number")
    }

    labelForI@ for(i in 1 .. 100){
        labelForJ@ for(j in 1 .. 100){

            if(i == 19 && j == 20){
                continue@labelForI
            }

            if(i == 20 && j == 20){
                break@labelForJ
            }

            println("i = $i, j = $j")
        }
    }

    fun printIntegerList(intArray : Array<Int>){
        intArray.forEach(fun(item : Int){

            if(item == 0) return

            println("Integer = $item")
        })
    }

    printIntegerList(intArray)
}