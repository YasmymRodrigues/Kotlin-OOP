package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Carro(identificador: String, motor: Motor): Movimentavel, Ligavel {
    val identificador: String = ""
    abstract val motor: Motor
    abstract val dataDeAquisicao: Date
    abstract val posicao: Posicao
    val x: Int = 0
    val y: Int = 0

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | $posicao | $x |$y"
    }

}