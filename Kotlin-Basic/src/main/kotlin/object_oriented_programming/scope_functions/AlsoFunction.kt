package object_oriented_programming.scope_functions

data class AlsoPerson(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

//similar ao aplly, porem necessita do it.
class AlsoFunction {

    fun writeCreationLog(p: AlsoPerson) {
        println("A new person ${p.name} was created.")
    }

    fun main() {

        val jake = AlsoPerson("Carlos", 37, "Backend")
            .also {
                writeCreationLog(it)
            }

    }
}