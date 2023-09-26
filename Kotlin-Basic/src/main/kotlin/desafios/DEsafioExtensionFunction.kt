package desafios

fun main() {
    val titulo = readLine() ?: ""
    val autor = readLine() ?: ""

    // Aqui usamos a Extension Function "generateSlug()" nas Strings de Entrada.
    val slugTitulo = titulo.generateSlug()
    val slugAutor = autor.generateSlug()

    println("Slug gerado para o livro:")
    println(buildString {
        append(slugTitulo)
        append("_")
        append(slugAutor)
    })

}

fun String.generateSlug(): String {

    return this.replace(" ", "-").lowercase().replace(".", "")


}
