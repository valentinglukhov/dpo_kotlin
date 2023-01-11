import kotlin.random.Random
import kotlin.random.nextInt

class Battle(val team1: MutableList<AbstractWarrior>, val team2: MutableList<AbstractWarrior>) {
    val battleIsOver: Boolean
        get() = team1.isEmpty() || team2.isEmpty()

    fun battleIteration(team1: MutableList<AbstractWarrior>, team2: MutableList<AbstractWarrior>) {
        var opponent1 = team1[Random.nextInt(team1.indices)]
        var opponent2 = team2[Random.nextInt(team2.indices)]
        opponent1.attack(opponent2)
        opponent2.attack(opponent1)
        val iterator1 = team1.iterator()
        while (iterator1.hasNext()) {
            val warrior1 = iterator1.next()
            if (warrior1.isKilled) iterator1.remove()
        }

        val iterator2 = team2.iterator()
        while (iterator2.hasNext()) {
            val warrior2 = iterator2.next()
            if (warrior2.isKilled) iterator2.remove()
        }
    }
}