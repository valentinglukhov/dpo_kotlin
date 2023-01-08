class Stack<T> {
    val stack = mutableListOf<T>()

    fun push(ammo: T) {
        stack.add(ammo)
    }

    fun pop(): T? {
        return if (stack.isEmpty()) {
            null
        } else {
            val ammo = stack[stack.lastIndex]
            stack.removeAt(stack.lastIndex)
            ammo
        }
    }

    fun isEmpty(): Boolean = stack.isEmpty()

}