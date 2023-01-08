import java.lang.Exception

fun main() {
//    var stack = Stack<Int>()
    var warriorCount: Int? = null
    while (warriorCount == null) {
        warriorCount = inputCount()
    }
    println("Сражение с $warriorCount воинами в каждой команде началось.")
    val warrior1 = Generalissimo()
    val warrior2 = Generalissimo()

    warrior2.Attack(warrior1)
    warrior1.Attack(warrior2)
    warrior2.Attack(warrior1)
    warrior1.Attack(warrior2)
    warrior1.Attack(warrior2)
    warrior1.Attack(warrior2)




//    println(warrior2.weapon.fireType)
//    println(warrior2.weapon.reloadStack())
//    println(warrior2.weapon.stack.stack.size)
//    println(warrior2.weapon.getAmmo())
//    println(warrior2.weapon.stackToShoot.stack.size)
//    println(warrior2.weapon.stack.isEmpty())
//    println(warrior2.weapon.stack.stack.size)

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
