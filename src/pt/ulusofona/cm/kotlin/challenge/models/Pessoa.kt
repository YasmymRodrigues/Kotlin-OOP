package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Pessoa(nome: String, dataDeNascimento: Date) {
    val nome : String =""
    private val veiculos = listOf<Veiculo>()
    val carta : Carta = TODO()
    val posicao : Posicao
    val x: Int = 0
    val y: Int = 0



    fun comprarVeiculo(veiculo: Veiculo){}
    fun pesquisarVeiculo(identificador: String): Veiculo {
        return Veiculo("");
    }
    fun venderVeiculo(identificador: String, comprador: Pessoa){}
    fun moverVeiculoPara(identificador: String, x:Int, y:Int){}
    fun temCarta():Boolean{return true}
    fun tirarCarta(){}


    override fun toString(): String {
        return "Pessoa |"
        //return "Pessoa | $nome | $dataDeNascimento |  $posicao | $x |$y"
    }
}