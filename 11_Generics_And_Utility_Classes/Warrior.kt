interface Warrior {
    val isKilled: Boolean
    val chanceToAvoidHit: Int

    fun attack (warrior: Warrior) {
    }

    fun takeDamage (damage: Int) {
    }
}