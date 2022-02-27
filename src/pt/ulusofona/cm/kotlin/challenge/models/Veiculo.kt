package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import javax.xml.crypto.Data

open class Veiculo(var identificador: String) {

    final fun requerCarta(): Boolean{ return false}
    final fun moverPara(x:Int, y:Int) {}


}
