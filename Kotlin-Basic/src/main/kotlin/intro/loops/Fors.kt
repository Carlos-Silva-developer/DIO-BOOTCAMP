package intro.loops


class Fors {

    fun returnCakes(cakes: List<String>): List<String>? {

        var cakesToReturn = ArrayList<String>()

        for (cake in cakes) {
            cakesToReturn.add("Yummy, it's a $cake cake!")
        }

        return cakesToReturn
    }



}