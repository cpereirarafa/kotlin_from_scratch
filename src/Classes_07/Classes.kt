package Classes_07

/*
class Person {
    var firstName : String = ""
}
*/

// class Person constructor( val firstName : String, val lastName : String, var age : Int?){

class Person ( val firstName : String, val lastName : String, var age : Int?){

    private var fullname = "$firstName $lastName";

    init {
        println("Person details:\nName = $fullname\nAge = $age")
    }

    fun talk(message : String = ""){
        println("$fullname says $message")
    }
}


fun main (){
//    var person = Person(firstName = "Rafael", lastName = "Câmara Pereira", age = null)
    var person = Person("Rafael", "Câmara Pereira", null)
    println("A person was added")
    person.age = 29
    println("The age was set to ${person.age}")
/*
    println("Person details:\nFirst Name = ${person.firstName}\nLast Name = ${person.lastName}")
*/
    person.talk("Good morning")
}