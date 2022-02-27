package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import javax.xml.crypto.Data

abstract class VeiculoEscondido(var identificador: String) :Movimentavel, Ligavel {
    val dataDeAquisicao: Data = TODO()

    abstract override fun desligar()
}