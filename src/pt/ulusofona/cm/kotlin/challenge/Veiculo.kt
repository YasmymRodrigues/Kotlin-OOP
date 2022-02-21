package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Veiculo(identificador: String):Movimentavel, Ligavel {
    val identificador: String = ""
    abstract val posicao: Posicao
    abstract val dataDeAquisicao: Date

    fun requerCarta(): Boolean{ return false}
    override fun ligar() {
        TODO("Not yet implemented")
    }

    override fun desligar() {
        TODO("Not yet implemented")
    }

    override fun estaLigado(): Boolean {
        TODO("Not yet implemented")
    }


}
