package br.com.dnadopet.colecoes

import java.util.logging.Filter

fun main() {

    val salarios = doubleArrayOf(1000.0 , 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }


//    Maior valor
    println("Maior salário: ${salarios.maxOrNull()}")
//    Menor Salário
    println("Menor salário: ${salarios.minOrNull()}")
//    Medio Salário
    println("media salário: ${salarios.average()}")

    println("***************************")

    val salariosFilterMaior2500 = salarios.filter { it > 1500.00 }
    println(salariosFilterMaior2500)
    println("***************************")


}