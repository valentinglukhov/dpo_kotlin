import kotlin.random.Random

fun main() {
    val natureReserve = NatureReserve()
    val lifeCycle: IntRange = 1..7

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
        for (index in natureReserve.animalList.indices) {
            when (Random.nextInt(1, 5)) {
                1 -> natureReserve.animalList[index].sleep()
                2 -> natureReserve.animalList[index].eat()
                3 -> natureReserve.animalList[index].move()
                4 -> { val newBorn = natureReserve.animalList[index].makeChild()
                    natureReserve.animalList.add(newBorn)
                }
            }
        }

        println("Количество животных в заповеднике: ${natureReserve.animalList.size}")
        println("Количество животных погибло: ${natureReserve.animalListDied.size}\n")
    }
}