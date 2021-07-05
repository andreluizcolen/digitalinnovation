package br.com.dnadopet.cursobank.teste

import br.com.dnadopet.cursobank.Funcionario
import br.com.dnadopet.cursobank.Pessoa
import java.math.BigDecimal

fun main() {
    val jether = Pessoa("André Luiz","123.456.789.01")
    println(jether.nome)
    println(jether.cpf)

    val joao = Funcionario("Joao", "123.123.123.12", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

}