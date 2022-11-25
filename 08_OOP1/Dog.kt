class Dog(energy: Int = 0, weight: Int = 0, maxAge: Int = 7, name: String = "Собака") :
    Animal(energy, weight, maxAge, name) {

    override fun move(): Int {
        if (super.move() == 1) {
            println("$name бежит.")
        } else {
            println("У животного не хватает энергии или веса для передвижения. Энергия - $energy; вес - $weight")
        }
        return 1
    }

    override fun makeChild(): Dog {
        val newBorn = Dog(getRandomEnergy(), getRandomWeight(), this.maxAge, this.name)
        newBornList.add(newBorn)
        return newBorn
    }
}