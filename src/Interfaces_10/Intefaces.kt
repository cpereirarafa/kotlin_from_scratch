package Interfaces_10

class Bat : AnimalInterface, BirdInterface{
    override fun walk(){
        super.walk()
        println("But I walk like a Bat")
    }

    override fun fly(){
        super.fly()
        println("But I fly like a Bat")
    }

    override fun eat(){
        super<AnimalInterface>.eat()
        super<BirdInterface>.eat()
        println("But I eat like  a Bat")
    }
}

fun main (){

    var bat = Bat()
    bat.walk()
    bat.eat()
    bat.fly()
}