package object_oriented_programming.function_types

class InfixPerson(val name: String) {
    var likedPeople = mutableListOf<InfixPerson>()
    infix fun likes(other: InfixPerson) { likedPeople.add(other) }  // 6
}

class InfixFunction {

    fun main() {

        infix fun Int.times(str: String) = str.repeat(this)
        println(6 times "Bye! ")

        val pair = "Ferrari" to "Katrina"
        println(pair)

        infix fun String.onto(other: String) = Pair(this, other)
        val myPair = "McLaren" onto "Lucas"
        println(myPair)

        val sophia = InfixPerson("Sophia")
        val claudia = InfixPerson("Claudia")
        sophia likes claudia        //usa a infix function
        claudia likes sophia

        println("Sophia likes: ${sophia.likedPeople[0].name}")
        println("Claudia lokes: ${claudia.likedPeople[0].name}")

    }
}