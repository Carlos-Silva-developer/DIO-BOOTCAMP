package object_oriented_programming.scope_functions

class WithFunction (val host: String, val port: Int) {

    private val configuration = Configuration(host = host, port = port)

    fun showValues() {
        with(configuration) {
            println("Declarando configuration como parâmetro             ::: $host:$port :::")
        }

        configuration.run {
            println("Utilizando .run a declaração do valor das variaveis ::: $host:$port :::")
        }


//         instead of:
//        println("Declarando configuration.'atributo' para cada atributo ::: ${configuration.host}:${configuration.port} :::") //mais verboso

    }
}

class Configuration(var host: String, var port: Int)