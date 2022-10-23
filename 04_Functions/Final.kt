fun main() {
    val originalMessage = "F2p)v\"y233{0->c}ttelciFc"
    val firstHalf = originalMessage.dropLast(originalMessage.count() / 2)
    val secondHalf = originalMessage.drop(originalMessage.count() / 2)

    println("Original message: $originalMessage\n")
    println("First half of the original message: $firstHalf\n")
    println("Second half of the original message: $secondHalf\n")

    val firstHalfResult = first(firstHalf)
    val secondHalfResult = second(secondHalf)

    println("""The result of decoding original message is:
$firstHalfResult$secondHalfResult

    """.trimMargin())
}

fun first (firstHalf: String) : String {
    var result = firstHalf.map { char -> char + (1) }.joinToString("")
    result = result.replace("5", "s", true)
    result = result.replace("4", "u", true)
    result = result.map { char -> char + (-3) }.joinToString("")
    result = result.replace("0", "o", true)
    return result
}

fun second (secondHalf: String) : String {
    var result = secondHalf.reversed()
    result = result.map { char -> char + (-4) }.joinToString("")
    result = result.replace("_", " ", true)
    return result
}