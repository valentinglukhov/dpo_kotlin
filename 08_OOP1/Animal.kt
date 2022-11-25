import kotlin.random.Random

open class Animal(var energy: Int, var weight: Int, val maxAge: Int = 5, val name: String) {
    open var age: Int = 1
    var isTooOld: Boolean = false
    var newBornList = mutableListOf<Animal>()



    init {
        energy = getRandomEnergy()
        weight = getRandomWeight()
        println("Рождено животное $name, энергия - $energy, вес - $weight, макс. возраст - $maxAge, возраст - $age")
    }

    open fun makeChild(): Animal {
        val newBorn = Animal(getRandomEnergy(), getRandomWeight(), this.maxAge, this.name)
        newBornList.add(newBorn)
        return newBorn
    }

    fun randomAction() {
        if (isTooOld) {
            println("К сожалению животное состарилось и погибло.")
        } else {
            when (Random.nextInt(1, 5)) {
                1 -> sleep()
                2 -> eat()
                3 -> move()
                4 -> makeChild()
            }
        }
    }

    open fun sleep() {
        energy += 5
        age++
        println("$name спит.")
    }

    open fun eat() {
        energy += 3
        weight++
        tryIncrementAge()
        println("$name ест.")
    }

    open fun move(): Int {
        var ableToMove = 0
        if (energy <= 5 || weight <= 1) return ableToMove
        energy -= 5
        weight--
        tryIncrementAge()
        println("$name передвигается.")
        ableToMove = 1
        return ableToMove
    }

    open fun tryIncrementAge() {
        if (Random.nextBoolean()) age++
    }

    fun getRandomEnergy(): Int {
        return Random.nextInt(1, 10)
    }

    fun getRandomWeight(): Int {
        return Random.nextInt(1, 5)
    }
}