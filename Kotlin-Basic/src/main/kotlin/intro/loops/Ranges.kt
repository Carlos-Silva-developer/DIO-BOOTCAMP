package intro.loops

class Ranges {

    var meuArrayIn = ArrayList<Int>()
    var meuArrayUntil = ArrayList<Int>()
    var meuArrayComSteps = ArrayList<Int>()
    var meuArraydeStrings = ArrayList<String>()

    fun forComIn() {
        for (i in 0..3) meuArrayIn.add(i)
    }

    fun forComUntil() {
        for (i in 0 until 3) meuArrayUntil.add(i)
    }

//    vai de 2 a 60 pulando a cada 2 numeros, neste caso os numeros pares
    fun forComSteps() {
        for(i in 2..60 step 2) meuArrayComSteps.add(i)
    }

//    conta de forma decrescente do 30 ao 0 em intervalos de 3
    fun forComDownTo() {
        for(i in 30 downTo 0 step 3) {
            meuArrayComSteps.add(i)
        }
    }

    fun forComAlfaNumericos() {
        for (anything in 'a'..'d') {
            meuArraydeStrings.add(anything.toString())
        }
    }

}