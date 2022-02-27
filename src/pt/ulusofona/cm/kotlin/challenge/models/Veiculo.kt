package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import javax.xml.crypto.Data

class Veiculo(var identificador: String) {

    fun requerCarta(): Boolean{ return false}
    fun moverPara(x:Int, y:Int) {}


}
