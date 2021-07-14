package br.com.dnadopet.colecoes

fun main() {

    val joao  = Funcionario("Joao", 5000.00, "PJ")
    val pedro = Funcionario("Pedro", 2000.00, "CLT")
    val maria = Funcionario("Maria", 3000.00, "PJ")

//    Sao 3 conjuntos
    val funcionarios1    =   setOf(joao, pedro)
    val funcionarios2    =   setOf(maria)
    val funcionarios3    =   setOf(joao, pedro, maria)

    println("******************* União de Sets")
    val resultado = funcionarios1.union(funcionarios2)
    resultado.forEach{println(it)}

    println("******************* Subtrair Conjunto 01 - Conjunto 02")
    val ressultSubstract = funcionarios3.subtract(funcionarios2)
    ressultSubstract.forEach{println(it)}

    println("******************* Intersect Retorna o que tem de comum nos dois conjuntos ")
    val ressultIntersect = funcionarios3.intersect(funcionarios2)
    ressultIntersect.forEach{println(it)}

}