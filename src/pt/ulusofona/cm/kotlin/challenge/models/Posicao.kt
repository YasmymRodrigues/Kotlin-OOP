package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Posicao(x:Int, y:Int){
    val x: Int = 0
    val y: Int = 0

    fun alterarPosicao(x:Int, y: Int){}

    override fun toString(): String {
        return "Posição | $x |$y"
    }

}