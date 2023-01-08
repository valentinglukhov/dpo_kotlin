import kotlin.random.Random

class Generalissimo : AbstractWarrior() {
    override val maxHealth: Int = Random.nextInt(80, 100)
    override val chanceToAvoidHit: Int = Random.nextInt(80, 100)
    override val accuracy: Int = Random.nextInt(80, 100)
    override val weapon: AbstractWeapon = Weapons.makeRifle()
    override val isKilled: Boolean
        get() = currentHealth <= 0
    override var currentHealth: Int = Random.nextInt(79, maxHealth)

    init {
        println("""Создан воин ${this.javaClass.simpleName}
            |Максимальный уровень здоровья - $maxHealth ХП
            |Шанс избежать попадания - $chanceToAvoidHit%
            |Точность - $accuracy%
            |Оружие - ${weapon.type}
            |Текущий уровень здоровья - $currentHealth ХП
        """.trimMargin())
    }
}