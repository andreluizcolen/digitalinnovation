package br.com.dnadopet.cursobank.teste

import br.com.dnadopet.cursobank.ClienteTipo

fun main() {

    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    val pj = ClienteTipo.PJ

    println(">> ${pf.name} - ${pf.descricao}")
    println(">> ${pj.name} - ${pj.descricao}")

}