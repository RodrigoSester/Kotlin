package KT
class Pessoa {
    var nome: String = "Rodrigo"
    var cpf: String = "860.212.220-91"
    private set // Assim apenas seto a váriavel dentro da class, sem poder alterar ela fora, apenas fazer o get

    inner class Endereco {
        var rua: String = "Av. Guilherme Schell"
    }
}

fun main() {
    val rodrigo = Pessoa()

    println(rodrigo.nome)
    println(rodrigo.cpf)

    println(rodrigo.Endereco().rua)
}