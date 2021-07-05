package br.com.dnadopet.cursobank.teste

import br.com.dnadopet.cursobank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {

    val jose = Cliente(
        nome = "Jose",
        cpf = "123.123.123.99",
        clienteTipo = ClienteTipo.PF,
        senha = "1423456"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)

}

