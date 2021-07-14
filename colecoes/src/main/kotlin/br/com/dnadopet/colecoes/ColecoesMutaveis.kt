package br.com.dnadopet.colecoes

fun main() {

    val joao  = Funcionario("Joao", 5000.00, "PJ")
    val pedro = Funcionario("Pedro", 2000.00, "CLT")
    val maria = Funcionario("Maria", 3000.00, "PJ")

    println("******************* MutableList ")
    val funcionarios    =   mutableListOf(joao, maria)
    funcionarios.forEach{println(it)}

    println("******************* MutableList Add Pedro")
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("******************* MutableList Remover Pedro")
    funcionarios.remove(pedro)
    funcionarios.forEach{println(it)}

    println("******************* MutableSet")
    val funcionariosSet   =   mutableSetOf(joao)
    funcionariosSet.forEach{println(it)}

    println("******************* MutableSet Add Pedro Maria")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach{println(it)}

    println("******************* MutableSet Remove Maria")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach{println(it)}



}