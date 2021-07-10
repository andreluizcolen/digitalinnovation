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

//    Quantidade de salarios em um intervalo
    println(salarios.count{it in 1000.0..3000.0 })
    println("***************************")

//    Busca um determinado valor
    println(salarios.find { it == 2250.00 })
    println(salarios.find { it == 2259.99 })
    println("***************************")

//    Busca qualquer aonde a expressão eh valida. Retorna true ou false
    println(salarios.any { it == 1000.00 })
    println(salarios.any { it == 8000.00 })

}