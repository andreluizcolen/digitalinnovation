package br.com.dnadopet.cursobank.teste

import br.com.dnadopet.cursobank.Gerente

fun main() {
    val maria = Gerente("Maria do Carmo", "123.123.123.12", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)

}
