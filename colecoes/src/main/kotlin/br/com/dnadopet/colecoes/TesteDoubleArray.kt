package br.com.dnadopet.colecoes

fun main() {

    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 3000.00
    salarios[2] = 500.00

    salarios.forEach { println(it) }
    println("*************")

    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.10
    }
    salarios.forEach { println(it) }
    println("*************")

    val salarios2 = doubleArrayOf(1000.00, 300.00, 1500.00)
    salarios2.sort()
    salarios2.forEach { println(it) }



}