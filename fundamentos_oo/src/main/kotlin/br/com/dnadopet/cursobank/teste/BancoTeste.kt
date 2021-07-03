package br.com.dnadopet.cursobank.teste

import br.com.dnadopet.cursobank.Banco


fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 304)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Teste")
}