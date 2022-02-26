package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import javax.xml.crypto.Data

abstract class Veiculo(val identificador: String): Movimentavel {

    open fun requerCarta(): Boolean{ return false}



}
