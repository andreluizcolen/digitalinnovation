package br.com.dnadopet.cursobank

class PessoaInnerClass {

        var nome:String = "André Luiz Colen"
        var cpf:String = "123.456.789-01"
        inner class Endereco {
            var rua:String ="Rua Monte Castelo"
            var numero:String="Número 123"
        }


}

fun main() {

    val jether = PessoaInnerClass()
    println("Nome " + jether.nome + " Cpf:  " + jether.cpf  + "Endereço: " + jether.Endereco().rua)

}