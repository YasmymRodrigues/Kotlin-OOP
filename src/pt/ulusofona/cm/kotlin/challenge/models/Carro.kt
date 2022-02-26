package pt.ulusofona.cm.kotlin.challenge.models

class Carro(identificador: String, motor: Motor):Veiculo(identificador){


    override fun toString(): String {
        return "Carro | $identificador |"
        //return "Carro | $identificador | $dataDeAquisicao | $posicao | $x |$y"
    }

}

//Single inheritance
// Multilevel
// Hierarchial