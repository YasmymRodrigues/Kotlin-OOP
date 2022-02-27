package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import javax.xml.crypto.Data

abstract class Veiculo(var identificador: String) {

    abstract fun requerCarta(): Boolean
    //abstract fun moverPara(x:Int, y:Int) {}


}
