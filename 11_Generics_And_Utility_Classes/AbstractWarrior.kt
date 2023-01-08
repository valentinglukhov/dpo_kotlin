abstract class AbstractWarrior : Warrior {
    abstract val maxHealth: Int
    abstract override val chanceToAvoidHit: Int
    abstract val accuracy: Int
    abstract val weapon: AbstractWeapon
    abstract override val isKilled: Boolean
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
                    println("$warrior получил урон $damageAmount")
                }
            }
        }
    }

    override fun takeDamage(damage: Int) {
        currentHealth -=damage
    }
}