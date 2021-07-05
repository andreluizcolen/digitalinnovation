package br.com.dnadopet.cursobank.teste

import br.com.dnadopet.cursobank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}