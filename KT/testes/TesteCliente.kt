package KT.testes

import Git.KT.ClienteTipo
import KT.Cliente

fun main(){
    val jose = Cliente(
        nome = "José Ricardo",
        cpf = "12234",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)
}