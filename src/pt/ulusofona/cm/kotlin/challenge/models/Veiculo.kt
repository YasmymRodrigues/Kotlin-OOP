package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import javax.xml.crypto.Data

abstract class Veiculo(open var identificador: String) :Ligavel, Movimentavel {

    abstract fun requerCarta(): Boolean
    override fun moverPara(x:Int, y:Int) {}


}
