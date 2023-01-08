abstract class AbstractWarrior : Warrior {
    abstract val maxHealth: Int
    abstract override val chanceToAvoidHit: Int
    abstract val accuracy: Int
    abstract val weapon: AbstractWeapon
    override val isKilled: Boolean
        get() = currentHealth <=0
    abstract var currentHealth: Int

    override fun Attack(warrior: Warrior) {
        var damageAmount: Int = 0
        if (weapon.stackIsEmpty) {
            weapon.reloadStack()
            println("Ход пропущен.")
        } else {
            val stackToShoot = weapon.getAmmo()
            for (i in stackToShoot.stack) {
                if (accuracy.chance() && !warrior.chanceToAvoidHit.chance()) {
                    damageAmount += i.getDamageCount()
                    warrior.takeDamage(damageAmount)
                }
            }
            println("${warrior.javaClass.simpleName} получил урон $damageAmount от ${this.javaClass.simpleName}")
        }
    }

    override fun takeDamage(damage: Int) {
        currentHealth -=damage
    }
}