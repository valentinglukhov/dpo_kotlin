enum class Ammo(val damage: Double, val criticalDamageChance: Int, val criticalDamageRatio: Double) {
    ARROW(10.0, 30, 1.3),
    BULLET(20.0, 70, 1.5),
    SHOTGUNBULLET(30.0, 50, 1.7);

    fun getDamageCount(): Double {
        return if (criticalDamageChance.chance())
            damage * criticalDamageRatio
        else
            damage
    }

}