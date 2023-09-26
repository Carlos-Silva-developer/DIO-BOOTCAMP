package intro.generics

class GenericsFunctions {

//  * indica que o parâmetro passado será do tipo varargs
    fun <E> mutableStackOf(vararg elements: E) = GenericsClasses(*elements)

    fun mainGenerics(): GenericsClasses<Double> {
        return mutableStackOf(0.62, 3.14, 2.7)
    }

}