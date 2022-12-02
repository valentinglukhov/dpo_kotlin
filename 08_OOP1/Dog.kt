class Dog(energy: Int = 0, weight: Int = 0, maxAge: Int = 4, name: String = "Собака") :
    Animal(energy, weight, maxAge, name) {

    override fun makeChild(): Dog {
        val newBorn = Dog(getRandomEnergy(), getRandomWeight(), this.maxAge, this.name)
        return newBorn
    }

    override fun move(): Boolean {
        if (super.move()) println("$name бежит.")
        return ableToMove
    }
}