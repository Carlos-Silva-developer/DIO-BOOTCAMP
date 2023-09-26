package intro

class ClassesKotlin {

    class Customer

    class Contact(val id: Int, var email: String)

    fun runClasses() {

//        mesmo sendo vazia a classe Customer herda AS FUNÇÕES NATIVAS DA CLASSE
        val customer = Customer()

        val contact = Contact(1, "mary@gmail.com")


//      para referenciarmos um valor de dentro da classe uasmos ${}
        println("Contact id: ${contact.id}" )
        println("Contact email: ${contact.email}")

        println("Contact data: $contact")


    }

}