package desafios

class User(val id: Int, val name: String)

/*
 * No Kotlin, a declaração de um objeto (por meio da palavra-chave object)
 * é uma maneira concisa e eficaz de implementar o padrão Singleton.
 */
object UserManager {

    private val users = mutableListOf<User>()
    private const val ADICIONA_UM = 1

    fun addUser(name: String) {
        val user = User(users.size + ADICIONA_UM, name)
        users.add(user)
    }

    fun listUsers() {

        for(user in users) {
            print("${user.id} - ${user.name}")
        }
        //TODO: Inplementar a impressão/listagem dos "users", seguindo o padrão definido no enunciado.
    }
}

fun main() {
    val quantity = readLine()?.toIntOrNull() ?: 0


    for (i in 1..quantity) {
        val name = readLine() ?: ""
        UserManager.addUser(name)
    }

    UserManager.listUsers()
}