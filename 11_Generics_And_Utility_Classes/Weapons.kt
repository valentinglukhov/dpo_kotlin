object Weapons {
    fun makePistol () : AbstractWeapon {
        val pistol = object : AbstractWeapon() {
            override val stackQuantity: Int = 12
            override val fireType: FireType = SingleShot
        }
        return pistol
    }

    fun makeShotgun () : AbstractWeapon {
        val shotgun = object : AbstractWeapon() {
            override val stackQuantity: Int = 5
            override val fireType: FireType = SingleShot
        }
        return shotgun
    }

    fun makeRifle () : AbstractWeapon {
        val rifle = object : AbstractWeapon() {
            override val stackQuantity: Int = 30
            override val fireType: FireType = Burst(5)
        }
        return rifle
    }

    fun makeBow () : AbstractWeapon {
        val bow = object : AbstractWeapon() {
            override val stackQuantity: Int = 3
            override val fireType: FireType = Burst(5)
        }
        return bow
    }

}