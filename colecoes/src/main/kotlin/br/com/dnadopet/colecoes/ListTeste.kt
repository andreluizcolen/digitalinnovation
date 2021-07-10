package br.com.dnadopet.colecoes

fun main() {

    val joao  = funcionario("Joao", 5000.00, "PJ")
    val pedro = funcionario("Pedro", 2000.00, "CLT")
    val maria = funcionario("Maria", 3000.00, "PJ")


    val funcionarios = listOf(joao, pedro, maria)

    println("******************* Imprimie Todos")
    funcionarios.forEach {
        println(it)
    }

    println("******************* Busca um determinado Nome")
    println(funcionarios.find { it.nome == "Maria" })

    println("******************* Classificar por algo")
    funcionarios
        .sortedBy { it.salario}
        .forEach  { println(it) }


    println("******************* GroupBy" )
    funcionarios
        .groupBy { it.contrato}
        .forEach  { println(it) }
}

data class funcionario(
    val nome: String,
    val salario: Double,
    val contrato: String
    ){
    override fun toString(): String {
        return """
            Nome    :   $nome
            Salário :   $salario
        """.trimIndent()
    }
}