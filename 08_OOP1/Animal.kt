import kotlin.random.Random

open class Animal(var energy: Int, var weight: Int, val maxAge: Int = 5, val name: String) {
    open var age: Int = 1
    var isTooOld: Boolean = false
        get() = age > maxAge
    var ableToMove: Boolean = true
        get() = energy > 5 && weight > 1

    init {
        energy = getRandomEnergy()
        weight = getRandomWeight()
        println("Рождено животное $name, энергия - $energy, вес - $weight, макс. возраст - $maxAge, возраст - $age")
    }

    open fun makeChild(): Animal {
        val newBorn = Animal(getRandomEnergy(), getRandomWeight(), this.maxAge, this.name)
        return newBorn
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

    open fun move() {
        println(ableToMove)
        if (ableToMove) {
            println("Инфо - $name энергия $energy вес $weight")
            energy -= 5
            weight--
            println("$name передвигается.")
            tryIncrementAge()
        } else {
            println("У животного не хватает энергии или веса для передвижения. Энергия - $energy; вес - $weight")
        }
    }

    open fun tryIncrementAge() {
        if (Random.nextBoolean()) age++
        if (isTooOld) println("К сожалению животное состарилось и погибло.")
    }

    fun getRandomEnergy(): Int {
        return Random.nextInt(1, 10)
    }

    fun getRandomWeight(): Int {
        return Random.nextInt(1, 5)
    }
}