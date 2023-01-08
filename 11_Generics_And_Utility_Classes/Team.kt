import kotlin.random.Random
import kotlin.random.nextInt

class Team () {
    var warriorList = mutableListOf<AbstractWarrior>()

    fun generateTeam (warriorCount: Int): MutableList<AbstractWarrior> {
        for (i in 1..warriorCount) {
            when (Random.nextInt(1..100)) {
                in 1..10 -> warriorList.add(Generalissimo())
                in 11..40 -> warriorList.add(Marshal())
                in 41..100 -> warriorList.add(Soldier())
            }
        }
        return warriorList
    }
}