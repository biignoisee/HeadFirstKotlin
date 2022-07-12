class Song (val title: String, val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }
    fun stop() {
        println("Stopped playing $title")
    }
}

fun main () {
    val songOne = Song("Playing God", "Polyphia")
    val songTwo = Song("Nephele", "Animals as Leader")
    val songThree = Song("Absolom", "Peryphery")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}

/*How object are created
var myDog = Dog("Fido", 70, "Mixed")
Dog is a constructor always is invoked when create a new object
A constructor runs when you instantiate an object.
It’s used to define properties and initialize them

class Song (val title: String, val artist: String) {        since Song(...) -> constructor
    ...
}
Behind scenes, each property is a variable that's local to the object
    val title: String,
    val artist: String)

*/
