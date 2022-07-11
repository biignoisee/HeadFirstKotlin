fun main() {
    // Part1 -> println("Hello World!")
    //fun -> references in function
    //main -> principal name of function only one time
    //args:Array<String> -> parameters into parenthesis for build a function
    //Kotlin 1.3 , no more use parameter args for initialize an app

    /*Part2
    var x = 1
    println("Before the loop: x = $x.")
    while (x < 4){
        println("In the loop: x = $x.")
        x += 1
    }
    print("After the loop: x = $x.")
    //Difference between println and print: println new line
    */
    val a = 3
    val b = 1
    println(if (a < b) "a is greater than b" else "b is greater than a")
    println("This line runs no matter what")

    //EXERCISE
    var x = 1
    while (x < 3){
        print(if(x == 1)"Yab" else "Dab")
        print("ba")
        x += 1
    }
    if(x == 3) println("Do")
}

//In kotlin exist 3 loop: while, for and do while
//When use if, must include an else clause, alwayss...
/*
    if (x > y) {
    println("x is greater than y")
    } else {
    println("x is not greater than y")
    }

    OR

    println(if (x > y) "x is greater than y" else "x is not grater than y")
    Remember use println for this used
*/

/*
REPL -> Read-Eval-Print-Loop  quickly tru out snippets of code outside
is necessary that use for validate knowledge
*/