import kotlin.random.Random

object Weapons {
    fun makePistol () : AbstractWeapon {
        val pistol = object : AbstractWeapon() {
            override val stackQuantity: Int = 12
            override val fireType: FireType = FireType.SingleShot
            override val type: String = "Пистолет"
        }
        return pistol
    }

    fun makeShotgun () : AbstractWeapon {
        val shotgun = object : AbstractWeapon() {
            override val stackQuantity: Int = 5
            override val fireType: FireType = FireType.SingleShot
            override val type: String = "Дробовик"
        }
        return shotgun
    }

    fun makeRifle () : AbstractWeapon {
        val rifle = object : AbstractWeapon() {
            override val stackQuantity: Int = 30
            override val fireType: FireType = FireType.Burst(Random.nextInt(1, 5))
            override val type: String = "Винтовка"
        }
        return rifle
    }

    fun makeBow () : AbstractWeapon {
        val bow = object : AbstractWeapon() {
            override val stackQuantity: Int = 3
            override val fireType: FireType = FireType.SingleShot
            override val type: String = "Лук"
        }
        return bow
    }

}