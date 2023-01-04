abstract class AbstractWarrior : Warrior {
    abstract val maxHealth: Int
    abstract override val chanceToAvoidHit: Int
    abstract val accuracy: Int
    abstract override val isKilled: Boolean



}