package pt.ulusofona.cm.kotlin.challenge.models

class Carro(identificador: String, motor: Motor): Veiculo(){
    override val identificador: String = ""
    val motor: Motor = TODO()
    override val dataDeAquisicao: Data
    override val posicao: Posicao
    val x: Int = 0
    val y: Int = 0

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | $posicao | $x |$y"
    }

}

//Single inheritance
// Multilevel
// Hierarchial