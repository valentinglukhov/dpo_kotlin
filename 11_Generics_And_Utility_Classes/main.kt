import java.lang.Exception

fun main() {
    var stack = Stack<Int>()
    var warriorCount: Int? = null
    while (warriorCount == null) {
        warriorCount = inputCount()
    }
    println("Сражение с $warriorCount воинами в каждой команде началось.")
    val warrior = Generalissimo()
    val ammo: Ammo = Ammo.BULLET
    println(ammo)
    println(warriorCount.chance())
    println(warriorCount.chance())
    println(warriorCount.chance())
    println(warriorCount.chance())
    println(warriorCount.chance())
    println(warriorCount.chance())
    println(warriorCount.chance())
    println(warriorCount.chance())
    println(ammo)
}

fun Int.chance() : Boolean {
    return kotlin.random.Random.nextInt(0, 100) < this
}

fun inputCount(): Int? {
    try {
        println("Введите количество воинов в команде:")
        var warriorCount: Int? = readln().toInt()
        return warriorCount
    } catch (e: Exception) {
        return null
    }
}
