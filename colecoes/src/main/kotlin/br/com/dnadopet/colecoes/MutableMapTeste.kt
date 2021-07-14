package br.com.dnadopet.colecoes

fun main() {

    val joao  = Funcionario("Joao", 5000.00, "PJ")
    val pedro = Funcionario("Pedro", 2000.00, "CLT")
    val maria = Funcionario("Maria", 3000.00, "PJ")

    val repositorio =   MutableMapRepositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)

    println("********************* FindById Encontrar Joao")
    println(repositorio.findById(joao.nome))

    println("********************* FindAll Traz Todos")
    repositorio.findAll().forEach { println(it) }

    println("********************* Remove Remover Maria")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}