package pt.ulusofona.cm.kotlin.challenge.models

abstract class Carro(identificador: String, motor: Motor){


   // abstract fun requerCarta(): Boolean

    override fun toString(): String {
        return "Carro ||"
        //return "Carro | $identificador | $dataDeAquisicao | $posicao | $x |$y"
    }

}

//Single inheritance
// Multilevel
// Hierarchial