import java.security.KeyStore.TrustedCertificateEntry

fun main() {
    val originalMessage = "F2p)v\"y233{0->c}ttelciFc"
    var firstHalf = originalMessage.dropLast(originalMessage.count() / 2)
    var secondHalf = originalMessage.drop(originalMessage.count() / 2)

    println("Original message: $originalMessage\n")
    println("First half of the original message: $firstHalf\n")
    println("Second half of the original message: $secondHalf\n")

    var firstHalfResult = shift(firstHalf, 1)
    firstHalfResult = replacingChar(firstHalfResult, '5', 's')
    firstHalfResult = replacingChar(firstHalfResult, '4', 'u')
    firstHalfResult = shift(firstHalfResult, -3)
    firstHalfResult = replacingChar(firstHalfResult, '0', 'o')

    var secondHalfResult = secondHalf.reversed()
    secondHalfResult = shift(secondHalfResult, -4)
    secondHalfResult = replacingChar(secondHalfResult, '_', ' ')

    println("""The result of decoding original message is:
$firstHalfResult$secondHalfResult
    """.trimMargin())
}

fun replacingChar (string: String, oldChar: Char, newChar: Char)  = string.replace(oldChar, newChar, true)
fun shift(string: String, shift: Int): String {
    val newString = string.map { char -> char + (shift) }.joinToString("")
    return newString
}