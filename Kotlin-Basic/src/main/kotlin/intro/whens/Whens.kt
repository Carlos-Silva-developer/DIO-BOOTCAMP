package intro.whens

class Whens {

    var returnVarFun: Any? = null
    var obj = Any()


        //Expressions
        var returnVar = when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"

        }



    fun cases(obj: Any): Any? {

        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }.also { returnVarFun = it }

        return returnVarFun
    }
}