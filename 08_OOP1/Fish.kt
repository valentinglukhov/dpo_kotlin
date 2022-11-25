class Fish(energy: Int = 0, weight: Int = 0, maxAge: Int = 3, name: String = "Рыба") :
    Animal(energy, weight, maxAge, name) {

    override fun move(): Int {
        if (super.move() == 1) {
            println("$name плывет.")
        } else {
            println("У животного не хватает энергии или веса для передвижения. Энергия - $energy; вес - $weight")
        }
        return 1
    }

    override fun makeChild(): Fish {
        val newBorn = Fish(getRandomEnergy(), getRandomWeight(), this.maxAge, this.name)
        newBornList.add(newBorn)
        return newBorn
    }
}