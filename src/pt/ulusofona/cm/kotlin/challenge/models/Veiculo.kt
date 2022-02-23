package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

open class Veiculo():Movimentavel {

    open val identificador: String = ""
    open val posicao: Posicao = TODO()
    open val dataDeAquisicao: Data

    open fun requerCarta(): Boolean{ return false}


}
