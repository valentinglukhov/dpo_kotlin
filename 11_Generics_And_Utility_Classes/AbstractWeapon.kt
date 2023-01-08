abstract class AbstractWeapon {
    abstract val stackQuantity: Int
    abstract val fireType: FireType
    abstract val type: String
    val stack = Stack<Ammo>()
    val stackIsEmpty
        get() = stack.isEmpty()
    val stackToShoot = Stack<Ammo>()
    val burstSize by lazy { fireType.burstSize }

    fun getAmmo() : Stack<Ammo> {
        if (burstSize <= stack.stack.size) {
            for (i in 1..burstSize) {
                val ammo = stack.pop()
                if (ammo != null) stackToShoot.push(ammo)
            }
        } else {
                for (i in 1..stack.stack.size) {
                    val ammo = stack.pop()
                    if (ammo != null) stackToShoot.push(ammo)
                }
        }
        return stackToShoot
    }

    fun reloadStack(): Stack<Ammo> {
        while (stackQuantity > stack.stack.size) {
            val ammo = makeAmmo()
            if (ammo != null) stack.push(ammo)
        }
        println("Оружие перезаряжено.")
        return stack
    }

    fun makeAmmo(): Ammo? {
        return when (type) {
            "Пистолет" -> return Ammo.BULLET
            "Дробовик" -> return Ammo.SHOTGUNBULLET
            "Винтовка" -> return Ammo.BULLET
            "Лук" -> return Ammo.ARROW
            else -> {return null}
        }
    }
}