/*fun main(){
    doSomething("HOLA",1)
    timeThree(1)
    maxValue(1)
}

fun doSomething(msg: String, i: Int){
    if (i > 0){
        var x = 0
        while (x < i) {
            println(msg)
            x += 1
        }
    }
}

fun timeThree(x: Int): Int {
    val y = x * 3       //no funciona porque el compilador lo especifica como val y no var
    return y
}

fun maxValue(args: Array<Int>): Int{
    var max = args[0]
    var x = 1
    while (x < args.size){
        var item = args[x]
        max = if (max >= item) max else item
        x += 1
    }
    return max
}*/

/*Into functions, it has parameters, and we call function set arguments
fun main (){
    printSum(5, 6)
}

fun printSum(int1: Int, int2: Int){
    val result = int1 + int2
    println(result)
}

Each argument you pass must be the same type as the parameter it lands in.
*/

/*     Teoria 2
Si queremos retornar usamos return y despues de pasar parametro forzamos con el data type del vlaor que retornaremos
fun max(a: Int, b: Int): Int {
    val maxValue = if (a > b) a else b
    return maxValue
}

fun printSum(int1: Int, int2: Int): Unit {  -> unit quiere decir que no retornara nada
    val result = int1 + int2
    println(result)
}

*/


/*  Teoria 3, si es una funcion que contiente una sola expresion
fun max(a: Int, b: Int): Int {
    val maxValue = if (a > b) a else b
    return maxValue
}
 en vez de {}, usamos =
fun max(a: Int, b: Int): Int = if (a > b) a else b
*/


/*
Loop for
var x = 1
while (x < 11) {
    x = x + 1
}
for (x in 1...10){
    println(x)
}
 */

/* For loops is amazing
for (x in 15 downTo 1) println(x)

for (x in 1 ...100 step 2) println(x)

for (item in optionsParam) {
    println("$item is an item in the array")
}

for((index, item) in optionsParam.withIndex()) {
    println("Index $index has item $item")
}

*/