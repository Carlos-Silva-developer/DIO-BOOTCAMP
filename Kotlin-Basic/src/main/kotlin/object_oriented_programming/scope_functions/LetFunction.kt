package object_oriented_programming.scope_functions

class LetFunction {

    private fun customPrint(s: String) {
        print(s.uppercase())
    }

    fun main() {


//        a função let, atribui a variavel o retorno da ultima instrução
        val empty = "test".let {         // declara a variavel empty
            customPrint(it)                     // chama "customPrint" que converte para uppercase
            it.isEmpty()                    // atribuí o retorno da função isEmpty()
        }
        println(" is empty: $empty")


        fun printNonNull(str: String?) {
            println("Printing \"$str\":")

            str?.let {          //se a variavel estiver nula, não executa o bloco
                print("\t")
                customPrint(it)
                println()
            } ?: 0                      //se nulo, retorna o valor 0
        }

        fun printIfBothNonNull(strOne: String?, strTwo: String) { //se um dos valores for nulo, não executa a função
            strOne?.let { firstString ->
                strTwo.let { secondString ->
                    customPrint("$firstString : $secondString")
                    println()
                }
            }
        }

        printNonNull(null)
        printNonNull("my string")
        printIfBothNonNull("First","Second")

    }
}