abstract class AbstractWeapon {
    abstract val stackQuantity: Int
    abstract val fireType: FireType
    private val stack = Stack<Any>()
    val stackIsEmpty = stack.isEmpty()

    fun makeAmmo () {

    }
}