/*class Dog (val name: String, var weight: Int, val breed: String) {
    var activities = arrayOf("Walks")
}*/
/*
class Dog (val name: String, weight_param: Int, breed_param: String) {

    //    init {
//        println("Dog $name has been created.")
//    }
    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()
    //with getter
    //val weightInKgs : Double
    //get() = weight / 2.2

    //with setters
    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
//    init {
//        println("The breed is $breed")
//    }
}

/*  Initializer blocks
init {
    ...
}

you must initialize your properties
class Dog(....){
    ...
    var temperament: String     //needs to initialized
    var temperament = ""    //this initializes the temperament property
                              with an empty String
    lateinit var temperament: String
}

Class with no properties
class Duck {
    fun quack() {
        println("Quack! Quack! Quack!")
    }

var myDuck = Duck()
}
*/


// Use field identifier. Field refers the property's, using in getters and setters
// in place of the property name, not use property name bc will get stuck in infinite loop

*/
