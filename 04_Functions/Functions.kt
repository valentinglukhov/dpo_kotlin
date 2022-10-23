fun main() {
    val originalMessage = "F2p)v\"y233{0->c}ttelciFc"
    val firstHalf = originalMessage.dropLast(originalMessage.count() / 2)
    val secondHalf = originalMessage.drop(originalMessage.count() / 2)

    println("Original message: $originalMessage\n")
    println("First half of the original message: $firstHalf\n")
    println("Second half of the original message: $secondHalf\n")

    var firstHalfResult = firstShift(firstHalf, 1)
    firstHalfResult = firstReplacingChar(firstHalfResult, '5', 's')
    firstHalfResult = firstReplacingChar(firstHalfResult, '4', 'u')
    firstHalfResult = firstShift(firstHalfResult, -3)
    firstHalfResult = firstReplacingChar(firstHalfResult, '0', 'o')

    var secondHalfResult = secondHalf.reversed()
    secondHalfResult = secondShift(secondHalfResult, -4)
    secondHalfResult = secondReplacingChar(secondHalfResult, '_', ' ')

    println("""The result of decoding original message is:
$firstHalfResult$secondHalfResult
    """.trimMargin())
}

fun firstReplacingChar (string: String, oldChar: Char, newChar: Char)  = string.replace(oldChar, newChar, true)
fun secondReplacingChar (string: String, oldChar: Char, newChar: Char)  = string.replace(oldChar, newChar, true)
fun firstShift(string: String, shift: Int): String {
    val newString = string.map { char -> char + (shift) }.joinToString("")
    return newString
}
fun secondShift(string: String, shift: Int): String {
    val newString = string.map { char -> char + (shift) }.joinToString("")
    return newString
}