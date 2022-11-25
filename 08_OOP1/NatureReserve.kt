open class NatureReserve() {
    var animalList = mutableListOf<Animal>()
    var animalListDied = mutableListOf<Animal>()
    var newBorn = mutableListOf<Animal>()
    val bird = Bird()
    val fish = Fish()
    val dog = Dog()

    init {
        animalList.add(bird)
        animalList.add(fish)
        animalList.add(dog)
    }
}