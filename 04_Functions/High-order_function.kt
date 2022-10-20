fun main() {
    val originalMessage = "F2p)v\"y233{0->c}ttelciFc"
    val firstHalf = originalMessage.dropLast(originalMessage.count() / 2)
    val secondHalf = originalMessage.drop(originalMessage.count() / 2)


    shift(firstHalf, 1, 'G', 'A') { firstHalf, shift, oldChar, newChar ->
    var result = firstHalf.map {char -> char + (shift)}.joinToString("")
    result = result.replace(oldChar, newChar, true)
    println(result)
    }
}


fun shift(string: String,
          shift: Int,
          oldChar: Char,
          newChar: Char,
          replacingChar: ((string: String, shift: Int, oldChar: Char, newChar: Char) -> Unit)? = null
        ): String {
        val newString = string.map { char -> char + (shift) }.joinToString("")
        replacingChar?.invoke(string, shift, oldChar, newChar)
        return newString
        }