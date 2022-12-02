class Dog(energy: Int = 0, weight: Int = 0, maxAge: Int = 4, name: String = "Собака") :
    Animal(energy, weight, maxAge, name) {

    override fun move() {
        super.move()
        println("$name бежит.")
    }
}