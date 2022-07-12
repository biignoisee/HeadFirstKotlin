open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger  = 10

    open fun makeNoise() {
        println("The Animal is making a noise")
    }
    open fun eat() {
        println("The Animal is eating")
    }
    open fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }
}

class Hippo: Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }

}

open class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf : Canine() {
    override val image = "wold.jpg"
    override val food = "meat"
    override val habitat = "forests"
    override fun makeNoise() {
        println("Hooooowl!")
    }

    override fun eat(){
        println("The Wolf is eating $food")
    }
}

class Vet {
    fun giveShot (animal: Animal) {
        //Code to do something medical
        animal.makeNoise()
    }
}


fun main () {
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals){
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}




/*
To use a class as a superclass, it must be declared as open : class, properties and functions

Agregar a la subclase las propiedades usaremos override siempre y cuando las propiedades inicien con val
si es con var, no, ni en la superclase se agrega open, ni en la subclase, solo se inicializa

* The function parameters in the subclass must match those in the superclass.
* The function return types must be compatible.

Declaring the function as afinal in the Car class means that it can no longer be overridden in any of Car's subclasses.

Inheritance guarantees that all subclasses have the functions and properties defined in the superclass

You can use a supertype for a function’s parameters and return type
Polymorphism means “many forms”. It allows different subclasses to have different
implementations of the same function.

Can you explain polymorphism again?
A: Sure. Polymorphism is the ability to use any subtype object in place of its supertype. As
different subclasses can have different implementations of the same function, it allows each
object to respond to function calls in the way that’s most appropriate for each object

*/