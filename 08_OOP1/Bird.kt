class Bird(energy: Int = 0, weight: Int = 0, maxAge: Int = 3, name: String = "Птица") :
    Animal(energy, weight, maxAge, name) {

    override fun move() {
        super.move()
        println("$name летит.")
    }
}