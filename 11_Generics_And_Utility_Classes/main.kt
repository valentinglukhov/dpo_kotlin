import java.lang.Exception

fun main() {
    var warriorCount: Int? = null
    while (warriorCount == null) {
        warriorCount = inputCount()
    }
    println("Сражение с $warriorCount воинами в каждой команде началось.")
    val team1 = Team().generateTeam(warriorCount)
    val team2 = Team().generateTeam(warriorCount)
    val battle = Battle(team1, team2)
    while (!BattleState.Progress(team1, team2).battleIsOver) {
        battle.battleIteration(team1, team2)
        BattleState.Progress(team1, team2).getProgress()
    }
}

fun Int.chance(): Boolean {
    return kotlin.random.Random.nextInt(0, 100) < this
}

fun inputCount(): Int? {
    try {
        println("Введите количество воинов в команде:")
        val warriorCount: Int? = readln().toInt()
        return warriorCount
    } catch (e: Exception) {
        return null
    }
}
