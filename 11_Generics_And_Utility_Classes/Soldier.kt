import kotlin.random.Random

class Soldier : AbstractWarrior() {
    override val maxHealth: Int = Random.nextInt(30, 50)
    override val chanceToAvoidHit: Int = Random.nextInt(30, 50)
    override val accuracy: Int = Random.nextInt(30, 50)
    override val weaponType: AbstractWeapon = Weapons.makePistol()
    override val isKilled: Boolean
        get() = currentHealth <= 0
    override var currentHealth: Int = Random.nextInt(29, maxHealth)

    init {
        println("""Создан воин ${this.javaClass.simpleName}
            |Максимальный уровень здоровья - $maxHealth ХП
            |Шанс избежать попадания - $chanceToAvoidHit%
            |Точность - $accuracy%
            |Оружие - ${weaponType.type}
            |Текущий уровень здоровья - $currentHealth ХП
        """.trimMargin())
    }
}