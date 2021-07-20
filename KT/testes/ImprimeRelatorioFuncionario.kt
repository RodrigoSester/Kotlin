package KT.testes

import Git.KT.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}