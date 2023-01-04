abstract class AbstractWeapon {
    abstract val stackQuantity: Int
    abstract val fireType: FireType
    abstract val type: String
    private val stack = Stack<Ammo>()
    val stackIsEmpty = stack.isEmpty()
    val stackToShoot = Stack<Ammo>()
    val burstSize by lazy { fireType.burstSize }

    fun getAmmo(fireType: FireType, ammo: Ammo) : Stack<Ammo> {
        if (burstSize <= stack.stack.size) {
            for (ammo in 1..burstSize) {
                val ammo = stack.pop()
                if (ammo != null) stackToShoot.push(ammo)
            }
        } else {
                for (ammo in 1..stack.stack.size) {
                    val ammo = stack.pop()
                    if (ammo != null) stackToShoot.push(ammo)
                }
        }
        return stackToShoot
    }

    fun reloadStack(ammo: Ammo): Stack<Ammo> {
        while (stackQuantity > stack.stack.size) {
            val ammo = makeAmmo()
            if (ammo != null) stack.push(ammo)
            println(stack)
        }
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