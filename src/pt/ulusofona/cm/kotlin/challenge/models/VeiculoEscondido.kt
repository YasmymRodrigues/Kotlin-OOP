package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import javax.xml.crypto.Data

abstract class VeiculoEscondido(override var identificador: String) :Veiculo(identificador), Ligavel {
    val dataDeAquisicao: Data = TODO()

    abstract override fun desligar()
}