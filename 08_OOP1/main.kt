fun main() {
    val natureReserve = NatureReserve()
    val lifeCycle: IntRange = 1..10

    repeat(4) {
        natureReserve.animalList.add(natureReserve.bird.makeChild())
    }

    repeat(2) {
        natureReserve.animalList.add(natureReserve.fish.makeChild())
    }

    repeat(1) {
        natureReserve.animalList.add(natureReserve.dog.makeChild())
    }

    for (day in lifeCycle) {
        println("День №$day заповедника животных.")
        natureReserve.bird.newBornList.clear()
        natureReserve.fish.newBornList.clear()
        natureReserve.dog.newBornList.clear()
        natureReserve.animalListDied.clear()
        if (natureReserve.animalList.size == 0) {
            println("В заповеднике не осталось животных. Жизненный цикл окончен.")
            break
        }
        natureReserve.animalList.forEachIndexed { index, animal ->
            if (animal.isTooOld) {
                natureReserve.animalListDied.add(natureReserve.animalList[index])
            }
        }
        natureReserve.animalList -= natureReserve.animalListDied
        natureReserve.animalList.forEachIndexed { index, animal -> animal.randomAction()}
        natureReserve.newBorn += natureReserve.bird.newBornList
        natureReserve.newBorn += natureReserve.fish.newBornList
        natureReserve.newBorn += natureReserve.dog.newBornList
        natureReserve.animalList += natureReserve.newBorn
        println("Количество животных рождено: ${natureReserve.newBorn.size}")
        println("Количество животных живых, включая новорожденных: ${natureReserve.animalList.size}")
        println("Количество животных погибло: ${natureReserve.animalListDied.size}\n")
    }
}