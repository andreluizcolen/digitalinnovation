package br.com.dnadopet.colecoes

fun main() {

    val pair: Pair<String, Double> = Pair("joao", 1000.00)
    val map1    =   mapOf(pair)
    val map2    =   mapOf(
        "Pedro" to 1000.00,
        "Maria" to 3000.00)

    println("*************************** Map01")
    map1.forEach{ (k, v) -> println("Chave: $k  Valor: $v")}

    println("*************************** Map02 Sintaxe do Infix")
    map2.forEach{ (k, v) -> println("Chave: $k  Valor: $v")}

}