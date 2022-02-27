package pt.ulusofona.cm.kotlin.challenge.models

class Carro(identificador: String, motor: Motor): Veiculo(identificador){


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