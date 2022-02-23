package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

open class Veiculo(val identificador: String,val posicao: Posicao, val dataDeAquisicao: Data): Movimentavel {

    open fun requerCarta(): Boolean{ return false}


}
