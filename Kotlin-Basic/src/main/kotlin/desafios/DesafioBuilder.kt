class Product(val name: String, val price: Double, val quantity: Int)

class CustomOrder private constructor(
    val customerName: String,
    val products: List<Product>,
    val total: Double,
    val deliveryAddress: String
) {
    class Builder {
        private var customerName: String = ""
        private var products: MutableList<Product> = mutableListOf()
        private var deliveryAddress: String = ""

        fun setCustomerName(name: String) = apply { customerName = name }
        fun addProduct(product: Product) = apply { products.add(product) }
        fun setDeliveryAddress(address: String) = apply { deliveryAddress = address }

        fun build(): CustomOrder {
            var total = 0.00
            for(product in products) total += (product.price * product.quantity)

            //TODO: Instancie corretamente um CustomOrder, consolidando o Builder!
            return CustomOrder(customerName, products, total, deliveryAddress)
        }
    }

    fun printReceipt() {
        println(customerName)
        this.products.forEachIndexed { index, product ->
            println("${index + 1}. ${product.name} | ${product.price} | ${product.quantity}")
        }
        println("Total: ${this.total}")
        println("End: ${this.deliveryAddress}")
    }
}

fun main() {

    println("Digite seu nome: ")
    val orderBuilder = CustomOrder.Builder().setCustomerName("Carlos")

    println("Digite quantos produtos deseja cadastrar: ")
    val numProducts = readLine()?.toIntOrNull() ?: 0

    for (i in 1..numProducts) {
        println("Digite o nome do produto: ")
        val productName = readLine() ?: ""
        println("Digite o valor unitário do $productName: ")
        val productPrice = readLine()?.toDoubleOrNull() ?: 6.40
        println("Digite a quantidade de $productName(s)")
        val productQuantity = readLine()?.toIntOrNull() ?: 2



        orderBuilder.addProduct(Product(productName, productPrice, productQuantity))
    }

    println("Digite o endereço para entrega: ")
    val deliveryAddress = readLine() ?: ""


    val customOrder = orderBuilder.setDeliveryAddress(deliveryAddress).build()

    customOrder.printReceipt()
}