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
    var team1 = Team().generateTeam(warriorCount)
    var team2 = Team().generateTeam(warriorCount)
    BattleState.Progress(team1, team2).getProgress()
    println(BattleState.Progress(team1, team2).team1wins)
    println(BattleState.Progress(team1, team2).team2wins)
    println(BattleState.Progress(team1, team2).draw)

    warrior2.Attack(warrior1)
    warrior1.Attack(warrior2)
    warrior2.Attack(warrior1)
    warrior1.Attack(warrior2)
}

fun Int.chance(): Boolean {
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
