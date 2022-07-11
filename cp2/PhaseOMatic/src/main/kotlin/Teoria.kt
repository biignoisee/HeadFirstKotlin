fun main() {
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()
    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)
}

/*
String Template:

var x = 42
var value = "Value of x is $x"

    var myArray = arrayOf(1, 2, 3)
    var arraySize = "myArray has ${myArray.size} items"
    var firstItem = "The first item is ${myArray[0]}"

Include use string templates if expressions
    var result = "myArray is ${if (myArray.size > 10) "large" else "small"}"

Math.random vs Random.nexInt
*/

/*Part two
Explicitly define the arrays type
var myArray: Array<Byte> = arrayOf(1, 2, 3)

create array with val not can be change but with can add new element of replace by indexOf

*/