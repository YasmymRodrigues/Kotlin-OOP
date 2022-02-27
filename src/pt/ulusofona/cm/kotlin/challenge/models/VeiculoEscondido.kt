package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import javax.xml.crypto.Data

open class VeiculoEscondido(override var identificador: String)  :Veiculo(identificador)  {
    override fun requerCarta(): Boolean {
        TODO("Not yet implemented")
    }

    override fun ligar() {
        TODO("Not yet implemented")
    }

    override fun desligar() {
        TODO("Not yet implemented")
    }


    override fun estaLigado(): Boolean {
        TODO("Not yet implemented")
    }


}