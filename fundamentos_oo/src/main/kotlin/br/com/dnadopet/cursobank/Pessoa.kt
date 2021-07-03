package br.com.dnadopet.cursobank

class Pessoa {
    var nome:String = "André Luiz"
    var cpf:String = "123.456.789-01"

}

fun main() {

    val jether = Pessoa()
    println("Nome " + jether.nome + " Cpf:  " + jether.cpf )

}
