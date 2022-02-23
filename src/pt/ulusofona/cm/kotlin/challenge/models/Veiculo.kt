package pt.ulusofona.cm.kotlin.challenge.models

abstract class Veiculo(identificador: String) {
    val identificador: String = ""
    val posicao: Posicao = TODO()
    val dataDeAquisicao: Data

    fun requerCarta(): Boolean{ return false}


}
