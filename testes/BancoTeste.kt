package Git.KT.testes

import Git.KT.Banco

fun main(){
    val bank = Banco(nome = "DigiOne", numero = 117)

    print(bank.nome + " ")
    println(bank.numero)

    val bank2 = bank.copy(nome = "Banco 2")
    println(bank2.info())
}