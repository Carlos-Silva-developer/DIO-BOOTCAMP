package intro

class NullSafaty {

    var neverNull: String = "Não pode ser Nulo"
    var nullable: String? = "'?' junto ao tipo, faz com que a variavel possa receber um valor nulo"


    var inferredNonNull = "Caso não seja explicito atravéx do '?', o compilador vai interpretar como não nula"

    fun strLength(notNull: String): Int {
        return notNull.length
    }

//    Caso o tipo recebido ou o retorno da função possam ser nulos deve ser explicito na declaração atravéz do '?'
    fun strMaybeNull(text: String?): Any? {
        return text
    }

}