package object_oriented_programming.exceptions

class IllegalVoterException(message: String) : Throwable(message)

data class Person(val name: String?)

class CustomException {

    @Throws(IllegalVoterException::class)
    fun vote(name: String, age: Int) {
        if (age < 16) {
            throw IllegalVoterException("$name não tem idade suficiente")
        }
        println("Voto de $name contabilizado!")
    }

    fun main() {

        var qtdVotos = 0;

        qtdVotos += try { vote("Carlos", 37 ); 1; } catch (e: IllegalVoterException) { 0 }
        qtdVotos += try { vote("Maria", 50 ); 1; } catch (e: IllegalVoterException) { 0 }
        qtdVotos += try { vote("Roberta", 15 ); 1; } catch (e: IllegalVoterException) { 0 }
        qtdVotos += try { vote("Mario", 69 ); 1; } catch (e: IllegalVoterException) { 0 }
        qtdVotos += try { vote("Pituca", 2 ); 1; } catch (e: IllegalVoterException) { 0 }

        println(qtdVotos)
    }

    fun aux() {

        val person = Person(null)

        val name = person.name ?: throw IllegalVoterException("Name Required")

        println(name)

    }
}