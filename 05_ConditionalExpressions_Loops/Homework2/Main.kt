fun main () {

    fibonacciSequence(inputNumber())

}

fun inputNumber () : Int {
    println("Please enter a positive integer:")
    var n: Int = readln().toIntOrNull() ?: inputNumber()
    while (n < 0) {
        println("You didn't enter a positive integer.")
        println("Please enter a positive integer:")
        n = readln().toIntOrNull() ?: inputNumber()
    }
    return n
}

fun fibonacciSequence (n: Int) : Unit {
    println("You entered a number: $n")
    var fN1: Int = 1
    var fN2: Int = 0
    for (f in 0 .. n) {
        val fN: Int = fN1 + fN2
        fN2 = fN1
        fN1 = fN
        if (f == n - 2) println("Fibonacci number: $fN")
    }
}