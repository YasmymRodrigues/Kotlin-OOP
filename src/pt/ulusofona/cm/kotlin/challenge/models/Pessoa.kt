package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*


class Pessoa(nome: String, dataDeNascimento: Date) {
    val nome : String =""
    private val veiculos = mutableListOf<Veiculo>()
    val dataDeNascimento : Date
    val carta : Carta
    val posicao : Posicao
    val veiculo: Veiculo
    //abstract val bicicleta: Bicicleta
    val x: Int = 0
    val y: Int = 0


    fun comprarVeiculo(veiculo: Veiculo){}
    fun pesquisarVeiculo(identificador: String): Veiculo {
        return veiculo
    }
    fun venderVeiculo(identificador: String, comprador: Pessoa){}
    fun moverVeiculoPara(identificador: String, x:Int, y:Int){}
    fun temCarta():Boolean{return true}
    fun tirarCarta(){}


    override fun toString(): String {
        return "Pessoa | $nome | $dataDeNascimento |  $posicao | $x |$y"
    }
}