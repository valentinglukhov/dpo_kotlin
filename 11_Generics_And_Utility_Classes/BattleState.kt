sealed class BattleState(val team1: MutableList<AbstractWarrior>, val team2: MutableList<AbstractWarrior>) {

    class Progress(team1: MutableList<AbstractWarrior>, team2: MutableList<AbstractWarrior>) :
        BattleState(team1, team2) {
        var battleIsOver: Boolean = false
            get() = (team1.isEmpty() && team2.isEmpty()) || team2.isEmpty() || team1.isEmpty()

        fun getProgress(): Int {
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
            println("Живых игроков в команде №$teamCount - $playersAlive, общее ХП команды - $healthAmount\n")
            if (team1.isEmpty() && team2.isEmpty()) {
                println("Зафиксирована ничья.")
            } else {
                if (team2.isEmpty()) println("Зафиксирована победа команды №1.")
                if (team1.isEmpty()) println("Зафиксирована победа команды №2.")
            }
            return if (battleIsOver) 1 else 0
        }
    }
}
