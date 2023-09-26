package intro

class Variables {

    var varA: String = "initial"  // 1
    val valB: Int = 1             // 2
    val valC = 3                  // 3
    var varE: Int = 20

    fun retornaVariaveis(): String {
        return "varA: $varA\nvalB: $valB\nvalC: $valC\nvarE: $varE"
    }

}