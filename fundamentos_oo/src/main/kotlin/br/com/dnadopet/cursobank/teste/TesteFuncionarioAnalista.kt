package br.com.dnadopet.cursobank.teste

import br.com.dnadopet.cursobank.Analista

fun main() {
    val joao = Analista("Joao", "123.123.123.12", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}
