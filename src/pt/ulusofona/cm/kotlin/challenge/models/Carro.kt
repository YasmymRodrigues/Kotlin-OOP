package pt.ulusofona.cm.kotlin.challenge.models

abstract class Carro(identificador: String, motor: Motor):Veiculo(identificador){


    abstract override fun requerCarta(): Boolean

    override fun toString(): String {
        return "Carro | $identificador |"
        //return "Carro | $identificador | $dataDeAquisicao | $posicao | $x |$y"
    }

}

//Single inheritance
// Multilevel
// Hierarchial