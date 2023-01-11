import kotlin.random.Random

class Marshal : AbstractWarrior() {
    override val maxHealth: Int = Random.nextInt(50, 80)
    override val chanceToAvoidHit: Int = Random.nextInt(50, 80)
    override val accuracy: Int = Random.nextInt(50, 80)
    override val weapon: AbstractWeapon = Weapons.makeShotgun()
    override val isKilled: Boolean
        get() = currentHealth <= 0
    override var currentHealth: Int = Random.nextInt(49, maxHealth)

    init {
        println("""Создан воин ${this.javaClass.simpleName}
            |Максимальный уровень здоровья - $maxHealth ХП
            |Шанс избежать попадания - $chanceToAvoidHit%
            |Точность - $accuracy%
            |Оружие - ${weapon.type}
            |Текущий уровень здоровья - $currentHealth ХП
            |
        """.trimMargin())
    }
}