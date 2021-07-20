package KT.testes

import Git.KT.Funcionario
import KT.Analista

fun main(){
    val joao = Analista(nome = "João", cpf = "43456", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}
