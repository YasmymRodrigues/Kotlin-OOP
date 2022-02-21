package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*


abstract class Pessoa(nome: String, dataDeNascimento: Date): Movimentavel {
    private val nome : String =""
    private val list = mutableListOf<Veiculo>()
    abstract val dataDeNascimento : Date
    abstract val carta : Carta
    abstract val posicao : Posicao
    abstract val veiculo: Veiculo


    fun comprarVeiculo(veiculo: Veiculo){}
    fun pesquisarVeiculo(identificador: String): Veiculo {
        return Veiculo("dd")
    }
    fun venderVeiculo(identificador: String, comprador:Pessoa){}
    fun moverVeiculoPara(identificador: String, x:Int, y:Int){}
    fun temCarta():Boolean{return true}
    fun tirarCarta(){}



}