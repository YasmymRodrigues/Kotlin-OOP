package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

abstract class Carro(identificador: String, motor: Motor): Movimentavel, Ligavel {
    val identificador: String = ""
    abstract val motor: Motor

}