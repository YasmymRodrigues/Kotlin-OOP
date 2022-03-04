package pt.ulusofona.cm.kotlin.challenge.models


class VeiculoEscondido(override var identificador: String) :Veiculo(identificador) {
    override fun requerCarta(): Boolean {
        return true;
    }

    override fun ligar() {

    }

    override fun desligar() {
        TODO("Not yet implemented")
    }

    override fun estaLigado(): Boolean {
        TODO("Not yet implemented")
    }


}