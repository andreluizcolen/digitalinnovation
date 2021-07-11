package br.com.dnadopet.colecoes

data class Funcionario(
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