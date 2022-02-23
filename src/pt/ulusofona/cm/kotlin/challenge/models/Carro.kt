package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

class Carro(identificador: String, motor: Motor){
    val identificador: String = ""
    val motor: Motor = TODO()
    val dataDeAquisicao: Date
    val posicao: Posicao
    val x: Int = 0
    val y: Int = 0

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | $posicao | $x |$y"
    }

}