class Stack<T> {
    val stack = mutableListOf<T>()

    fun push(item: T) {
        stack.add(item)
    }

    fun pop(): T? {
        return if (stack.isEmpty()) {
            null
        } else {
            val lastItem = stack[stack.lastIndex]
            stack.removeAt(stack.lastIndex)
            lastItem
        }
    }

    fun isEmpty(): Boolean = stack.isEmpty()

}