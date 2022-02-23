package pt.ulusofona.cm.kotlin.challenge.models

class Carro(identificador: String, motor: Motor): Veiculo(){
    val identificador: String = ""
    val motor: Motor = TODO()
    val dataDeAquisicao: Data
    val posicao: Posicao
    val x: Int = 0
    val y: Int = 0

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | $posicao | $x |$y"
    }

}

//Single inheritance
// Multilevel
// Hierarchial