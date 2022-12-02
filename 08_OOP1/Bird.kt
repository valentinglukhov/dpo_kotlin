class Bird(energy: Int = 0, weight: Int = 0, maxAge: Int = 3, name: String = "Птица") :
    Animal(energy, weight, maxAge, name) {

    override fun makeChild(): Bird {
        val newBorn = Bird(getRandomEnergy(), getRandomWeight(), this.maxAge, this.name)
        return newBorn
    }

    override fun move(): Boolean {
        if (super.move()) println("$name летит.")
        return ableToMove
    }
}