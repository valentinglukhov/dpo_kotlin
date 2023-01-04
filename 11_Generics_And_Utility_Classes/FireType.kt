sealed class FireType() {
    abstract val burstSize: Int

    object SingleShot : FireType() {
        override val burstSize: Int = 1
    }

    data class Burst(override val burstSize: Int) : FireType() {
    }
}
