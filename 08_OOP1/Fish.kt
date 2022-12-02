class Fish(energy: Int = 0, weight: Int = 0, maxAge: Int = 2, name: String = "Рыба") :
    Animal(energy, weight, maxAge, name) {

    override fun makeChild(): Fish {
        val newBorn = Fish(getRandomEnergy(), getRandomWeight(), this.maxAge, this.name)
        return newBorn
    }

    override fun move(): Boolean {
        if (super.move()) println("$name плывет.")
        return ableToMove
    }
}