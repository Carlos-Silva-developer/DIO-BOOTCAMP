package object_oriented_programming

class Enums {
    enum class State { IDLE, RUNNING, FINISHED }

    fun simpleEnums(state: State): String {

        val message = when (state) {
            State.IDLE -> "Its Idle"
            State.RUNNING -> "It's Running"
            State.FINISHED -> "It's Finished"
        }

        return message
    }


}