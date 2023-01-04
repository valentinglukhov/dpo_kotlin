interface Warrior {
    val isKilled: Boolean
    val chanceToAvoidHit: Int

    fun Attack (warrior: Warrior) {
        println("Attack")

    }

    fun takeDamage (damage: Int) {
        println("Take damage")
    }
}