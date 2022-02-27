package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import javax.xml.crypto.Data

class VeiculoEscondido(var identificador: String) :Movimentavel, Ligavel {
    val dataDeAquisicao: Data = TODO()
    override fun ligar() {
        TODO("Not yet implemented")
    }

    override fun desligar() {}
    override fun estaLigado(): Boolean {
        TODO("Not yet implemented")
    }

    override fun moverPara(x: Int, y: Int) {
        TODO("Not yet implemented")
    }
}