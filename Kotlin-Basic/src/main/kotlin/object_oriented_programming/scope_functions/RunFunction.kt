package object_oriented_programming.scope_functions

class RunFunction {

//    similar a fun let, porém não necessita da chamada de 'it'
    fun getNullableLength(ns: String?): Int {
        println("for \"$ns\":")
        return ns?.run {
            println("\tis empty? " + isEmpty())     // nesta linha o let utilizaria it.isEmpty()
            println("\tlength = $length")
            length
        } ?: 0
    }

    fun showValues() {

//        println( getNullableLength(null))     // utiliza o ?: para retornar length 0 quando vier com valor nulo
        getNullableLength(null)
        getNullableLength("")
        getNullableLength("some string with Kotlin")

    }

}