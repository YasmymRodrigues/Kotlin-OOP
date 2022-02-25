package pt.ulusofona.cm.kotlin.challenge.models

import javax.xml.crypto.Data

class Carro(identificador: String, posicao: Posicao, dataDeAquisicao: Data, motor: Motor): Veiculo(identificador, posicao, dataDeAquisicao){

    val x: Int = 0
    val y: Int = 0

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | $posicao | $x |$y"
    }

}

//Single inheritance
// Multilevel
// Hierarchial