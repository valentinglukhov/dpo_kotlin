class Fish(energy: Int = 0, weight: Int = 0, maxAge: Int = 2, name: String = "Рыба") :
    Animal(energy, weight, maxAge, name) {

    override fun move() {
        super.move()
        println("$name плывет.")
    }
}