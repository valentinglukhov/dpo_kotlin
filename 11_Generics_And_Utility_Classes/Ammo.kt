enum class Ammo(val damage: Int, val criticalDamageChance: Int, val criticalDamageRatio: Int) {
    ARROW(10, 30, 2),
    BULLET(20, 70, 3),
    SHOTGUNBULLET(30, 50, 4);

    fun getDamageCount(): Int {
        return if (criticalDamageChance.chance())
            damage * criticalDamageRatio
        else
            damage
    }
}