package intro.generics

class GenericsClasses<T>(vararg items: T) {

    private val elements = items.toMutableList()

    fun push(element: T) = elements.add(element)

    fun peek(): T = elements.last()

    fun pop(): T = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"



}