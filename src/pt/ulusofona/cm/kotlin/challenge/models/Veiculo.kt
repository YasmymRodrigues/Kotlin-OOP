package pt.ulusofona.cm.kotlin.challenge.models

open class Veiculo() {

    open val identificador: String = ""
    open val posicao: Posicao = TODO()
    open val dataDeAquisicao: Data

    fun requerCarta(): Boolean{ return false}


}
