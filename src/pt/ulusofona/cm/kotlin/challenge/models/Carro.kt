package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Carro(identificador: String, motor: Motor) : Veiculo(identificador){
    val dataDeAquisicao: Date = TODO()
    val posicao: Posicao

    override fun requerCarta(): Boolean { return false}
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
        return "Carro ||"
        //return "Carro | $identificador | $dataDeAquisicao | $posicao | $x |$y"
    }

}

//Single inheritance
// Multilevel
// Hierarchial