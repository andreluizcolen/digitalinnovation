package br.com.dnadopet.colecoes

fun main() {

    val joao  = Funcionario("Joao", 5000.00, "PJ")
    val pedro = Funcionario("Pedro", 2000.00, "CLT")
    val maria = Funcionario("Maria", 3000.00, "PJ")


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

