package intro.loops

class Whiles {

    var cakesEaten = 0
    var cakesBaked = 0

    fun eatACake() = println("Eat a Cake")
    fun bakeACake() = println("Bake a Cake")

    fun exampleWhile() {

        while (this.cakesEaten < 5) {                    // 1
            eatACake()
            cakesEaten ++
        }


        do {                                        // 2
            bakeACake()
            cakesBaked++
        } while (cakesBaked < cakesEaten)

    }

}