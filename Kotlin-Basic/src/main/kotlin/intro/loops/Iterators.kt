
package intro.loops

class Iterators {

    fun returnIterator(): ArrayList<String> {

        val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
        var shouts: ArrayList<String> = ArrayList()

        for (animal in zoo) {                                   // 3
            shouts.add("Watch out, it's a ${animal.name}")
        }
        return shouts
    }

}






class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}