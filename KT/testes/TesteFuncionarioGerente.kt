package KT.testes

import Git.KT.Funcionario
import KT.Gerente

fun main(){
    val maria = Gerente(nome = "Maria", cpf = "43456", salario = 5000.0, senha = "senha")
    ImprimeRelatorioFuncionario.imprime(maria)
}
