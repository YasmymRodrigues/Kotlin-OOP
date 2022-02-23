package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Motor(cavolos: Int, cilindrada: Int) {
    val cavalos: Int = 0
    val cilindrada: Int = 0
    val ligado: Boolean = false

    override fun toString(): String {
        return "Moto | $cavalos | $cilindrada"
    }

}