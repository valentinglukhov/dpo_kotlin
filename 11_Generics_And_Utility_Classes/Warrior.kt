interface Warrior {
    val isKilled: Boolean
    val chanceToAvoidHit: Int

    fun Attack (warrior: Warrior) {

    }

    fun takeDamage (damage: Int) {

    }
}