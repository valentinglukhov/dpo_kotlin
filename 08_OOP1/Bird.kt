class Bird(energy: Int = 0, weight: Int = 0, maxAge: Int = 4, name: String = "Птица") :
    Animal(energy, weight, maxAge, name) {

    override fun move(): Int {
        if (super.move() == 1) {
            println("$name летит.")
        } else {
            println("У животного не хватает энергии или веса для передвижения. Энергия - $energy; вес - $weight")
        }
        return 1
    }

    override fun makeChild(): Bird {
        val newBorn = Bird(getRandomEnergy(), getRandomWeight(), this.maxAge, this.name)
        newBornList.add(newBorn)
        return newBorn
    }
}