package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import javax.xml.crypto.Data

class Veiculo(val identificador: String): Movimentavel {

    fun requerCarta(): Boolean{ return false}
    override fun moverPara(x: Int, y: Int) {
        TODO("Not yet implemented")
    }


}
