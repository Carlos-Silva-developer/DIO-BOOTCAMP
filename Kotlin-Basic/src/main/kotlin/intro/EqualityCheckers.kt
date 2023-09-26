package intro

class EqualityCheckers {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    fun igualdadeComDoisSinais(): Boolean {
        return authors == writers
    }

    fun igualdadeComTresSinais(): Boolean {
        return authors === writers
    }

}