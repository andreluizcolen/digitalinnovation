package br.com.dnadopet.colecoes

fun main() {
    val salarios    =   arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("**************** Salários Somatória")
    println(salarios.somatoria())

    println("**************** Salários Média")
    println(salarios.media())
}