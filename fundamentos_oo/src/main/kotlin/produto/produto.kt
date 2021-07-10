package produto

data class produto(var cod: Int, var nome: String, var valor: Double) {

    // Class toString Implementada
    override fun toString(): String {
        return "Nome do Produto: $nome"
    }
}

fun main() {

    // toString
    val produto = produto(1,"mouse", 10.0)
    println(produto)

    //Equals Se não fosse DataClass retornaria falso
    val produto1 = produto(1,"mouse", 10.0)
    val produto2 = produto(1,"mouse", 10.0)
    println("*************************************")
    println(produto1 == produto2)

    //Equals Se trocar apenas valor do produto fic falso
    val produto3 = produto(1,"mouse", 10.0)
    val produto4 = produto(1,"mouse", 12.0)
    println("*************************************")
    println(produto3 == produto4)


}