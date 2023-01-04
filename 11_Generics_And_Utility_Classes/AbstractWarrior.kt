abstract class AbstractWarrior : Warrior {
    abstract val maxHealth: Int
    abstract override val chanceToAvoidHit: Int
    abstract val accuracy: Int
    abstract val weaponType: AbstractWeapon
    abstract override val isKilled: Boolean
    abstract var currentHealth: Int
}