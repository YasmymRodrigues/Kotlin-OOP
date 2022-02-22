package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*


abstract class Pessoa(nome: String, dataDeNascimento: Date): Movimentavel {
    private val nome : String =""
    private val list = mutableListOf<Veiculo>()
    abstract val dataDeNascimento : Date
    abstract val carta : Carta
    abstract val posicao : Posicao
    abstract val veiculo: Veiculo
    private val x: Int = 0
    private val y: Int = 0


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