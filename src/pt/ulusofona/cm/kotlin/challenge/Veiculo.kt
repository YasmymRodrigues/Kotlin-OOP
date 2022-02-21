package pt.ulusofona.cm.kotlin.challenge

import java.util.*

abstract class Veiculo(identificador: String) {
    val identificador: String = ""
    abstract val posicao: Posicao
    abstract val dataDeAquisicao: Date

    fun requerCarta(): Boolean{ return false}



}
