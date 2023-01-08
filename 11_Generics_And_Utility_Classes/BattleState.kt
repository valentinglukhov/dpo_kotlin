sealed class BattleState(val team1: MutableList<AbstractWarrior>, val team2: MutableList<AbstractWarrior>) {

    class Team1Win

    class Progress(team1: MutableList<AbstractWarrior>, team2: MutableList<AbstractWarrior>) :
        BattleState(team1, team2) {
        var team1wins: Boolean = false
            get() = team2.isEmpty()
        var team2wins: Boolean = false
            get() = team1.isEmpty()
        var draw: Boolean = false
            get() = team1.isEmpty() && team2.isEmpty()

        fun getProgress() {
            var healthAmount = 0
            var teamCount = 1
            var playersAlive = 0
            for (i in team1.indices) {
                if (!team1[i].isKilled)
                    playersAlive++
                healthAmount += team1[i].currentHealth
            }
            println("Живых игроков в команде №$teamCount - $playersAlive, общее ХП команды - $healthAmount")
            healthAmount = 0
            teamCount++
            playersAlive = 0
            for (i in team2.indices) {
                if (!team2[i].isKilled)
                    playersAlive++
                healthAmount += team2[i].currentHealth
            }
            println("Живых игроков в команде №$teamCount - $playersAlive, общее ХП команды - $healthAmount")
        }
    }
}
