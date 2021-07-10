package br.com.dnadopet.colecoes

fun main() {

    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "0Zaza"

    for (nome in nomes){ println(nomes) }
    println("*****************")

    nomes.sort()
    nomes.forEach { println(it) }
    println("*****************")


    val nomes2 = arrayOf("Joao", "Andre", "Maria")
    nomes2.sort()
    nomes2.forEach { println(it) }
    println("*****************")
}