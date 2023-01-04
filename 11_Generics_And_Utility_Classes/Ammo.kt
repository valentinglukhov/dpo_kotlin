enum class Ammo(val damage: Int, val criticalDamageChance: Int, val criticalDamageRatio: Int) {
    ARROW(10, 30, 30),
    BULLET(20, 70, 50),
    SHOTGUNBULLET(30, 50, 70);

    fun getDamageCount(): Int {
        return if (criticalDamageChance.chance())
            damage * criticalDamageRatio
        else
            damage
    }

}