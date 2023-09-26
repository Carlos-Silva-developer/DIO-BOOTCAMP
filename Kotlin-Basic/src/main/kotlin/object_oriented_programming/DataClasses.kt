package object_oriented_programming

data class DataClasses(val name: String, val id: Int) {

    override fun equals(other: Any?) = other is DataClasses && other.id == this.id
}