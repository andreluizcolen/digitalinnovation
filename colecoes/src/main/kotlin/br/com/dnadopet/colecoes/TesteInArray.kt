package br.com.dnadopet.colecoes

fun main() {

    val values = IntArray(5)

    values[0]   =   1
    values[1]   =   7
    values[2]   =   6
    values[3]   =   3
    values[4]   =   2

    println("**************************")
    for (values in values){
        println(values)
    }

    println("**************************")
    values.forEach {
        println(it)
    }

    println("**************************")
    values.forEach { valor ->
        println(valor)
    }

    println("**************************")
    for (index in values.indices){
        println("Valor: "  + values[index] + "  Indice: $index")
    }

    println("**************************")
    values.sort()
    for (index in values.indices){
        println("Valor: "  + values[index] + "  Indice: $index")
    }

}