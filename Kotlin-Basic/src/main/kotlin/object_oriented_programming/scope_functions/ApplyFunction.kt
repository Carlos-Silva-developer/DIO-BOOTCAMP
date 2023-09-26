package object_oriented_programming.scope_functions

// data class = classe que serve para guardar dados
data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

class ApplyFunction {

    val jake = Person()
    val stringDescription = jake.apply {// apply serve para atrubiur valores
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()
}