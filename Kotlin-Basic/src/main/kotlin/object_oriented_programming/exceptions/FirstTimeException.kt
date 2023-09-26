package object_oriented_programming.exceptions

class FirstTimeException {

    val a = 10
    val b = 0


    fun main() {

        try {
            val divisao = a/b
            print(divisao)

        } catch (e: Throwable) {
            print("::: Erro ::: ${e.message}")
//            e.printStackTrace()
        }


    }
}