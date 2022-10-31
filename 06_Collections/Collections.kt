fun main () {
    val immutableList = List(inputListSize(1)) {kotlin.random.Random.nextInt(-5, 5)}
    println("Immutable list:\n$immutableList\n")
    val mutableList = immutableList.toMutableList()
    val multiplicatedMutableList = mutableListOf<Int>()
    mutableList.forEachIndexed { index, value ->
        if (value % 2 == 0) {
            multiplicatedMutableList.add(index, value * 10)
        } else {
            multiplicatedMutableList.add(index, value)
        }
    }
    println("An immutable list with even numbers multiplied by 10:\n$multiplicatedMutableList\n")
    println("The sum of the numbers in the list is: ${multiplicatedMutableList.sumOf { it }}")
    val positiveNumberList = multiplicatedMutableList.filter { it > 0}
    println("A list with positive numbers:\n$positiveNumberList")
    }


fun inputListSize (firstIteration: Int) : Int {
    if (firstIteration > 1) println("You didn't enter a positive integer.")
    println("Please enter a positive integer:")
    var listSize = readln().toIntOrNull() ?: inputListSize(firstIteration + 1)
    while (listSize < 0) {
        println("You didn't enter a positive integer.")
        println("Please enter a positive integer:")
        listSize = readln().toIntOrNull() ?: inputListSize(firstIteration + 1)
    }
    return listSize
}