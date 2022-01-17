package Properties_09

/*
class Person {
    var firstName : String = ""
}
*/

// class Person constructor( val firstName : String, val lastName : String, var age : Int?){

open class Person (open val firstName : String, val lastName : String, var age : Int?){

    lateinit var language : String
    private var fullname = "${this.firstName} $lastName";
    var isAdult : Boolean
        get(){

            println("Getting isAdult")

            if (age == null || age!! < 18)
                return false

            return true
        }
        set(value) {

            println("Setting isAdult")

            age = if(value) 18 else null
        }

    init {
        println("Person details:\nName = $fullname\nAge = $age")
    }

    open fun talk(message : String = ""){
        println("$firstName $lastName says $message")
    }
}

class Engineer(var fieldOfStudy : String, firstName: String, lastName: String, age: Int?) : Person(firstName, lastName, age){

    override val firstName = super.firstName.uppercase()

    override fun talk(message: String) {

        super.talk(message)
        println("I am an engineer")
    }
}

fun main (){

    var engineer = Engineer("Computer Engineering", "Rafael", "Câmara Pereira", 29)
    println("Engineer details:\nFirst Name = ${engineer.firstName}\nLast Name = ${engineer.lastName}\n" +
            "Age = ${engineer.age}\nField of Study = ${engineer.fieldOfStudy}")

    engineer.talk("Good morning")

    println("${engineer.firstName} is an adult? ${engineer.isAdult}")

    engineer.isAdult = false

    println("${engineer.firstName} is an adult? ${engineer.isAdult}")
    println("${engineer.firstName} age is ${engineer.age}")

    engineer.language = "English, Portuguese, Spanish"
    println("${engineer.firstName} speaks ${engineer.language}")
}