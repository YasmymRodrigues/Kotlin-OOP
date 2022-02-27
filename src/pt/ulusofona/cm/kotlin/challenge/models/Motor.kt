package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Motor(cavalos: Int, cilindrada: Int): Ligavel {
    val cavalos: Int = 0
    val cilindrada: Int = 0
    val ligado: Boolean = false
    override fun ligar() {
        TODO("Not yet implemented")
    }

    override fun desligar() {
        TODO("Not yet implemented")
    }

    override fun estaLigado(): Boolean {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "Moto | $cavalos | $cilindrada"
    }


}