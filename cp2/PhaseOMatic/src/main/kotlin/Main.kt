fun main() {
    /* First exercise, badly in line 5, need to be 4 no 5
    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x = 0
    while (x < 5){
        println("${hobbits[x]} is a good Hobbit name")
        x += 1
    }*/

    /* Second exercise, badly bc no
    val firemen = arrayOf("Pugh", "Pugh",  "Barney Stinson", "Cuthbert", "Dribble","Grub")
    var firemanNo = 0

    while (firemanNo < 6){
        println("Fireman number $firemanNo is ${firemen[firemanNo]}")
        firemanNo += 1
    }
    */

    //CodeMagnets
    val fruit = arrayOf("Apple", "Banana", "Cherry","Blueberry", "Pomegranate")
    val index = arrayOf(1,3,4,2)
    var x = 0
    var y: Int

    while (x < 4){
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x += 1
    }
}