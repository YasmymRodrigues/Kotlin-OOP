package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Pessoa(nome: String, dataDeNascimento: Date) {
    val nome : String =""
    private val veiculos = listOf<Veiculo>()
    val dataDeNascimento = Date()
    val carta : Carta = TODO()
    val posicao : Posicao
    open val veiculo: Veiculo
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