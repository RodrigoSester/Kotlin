package Git.KT

data class Banco(
    val nome: String,
    val numero: Int
){
    fun info()= "$nome - $numero"
}
