package pt.ulusofona.cm.kotlin.challenge

import java.util.*
import javax.xml.crypto.Data

class Pessoa(nome: String, dataDeNascimento: Date) {
    private val nome : String =""
    private val list = mutableListOf<Veiculo>()
    val dataDeNascimento : Date
    val carta : Carta
    val posicao : Posicao


    fun comprarVeiculo(veiculo: Veiculo){}
    fun pesquisarVeiculo(identificador: String): Veiculo{}
    fun venderVeiculo(identificador: String, comprador:Pessoa){}
    fun moverVeiculoPara(identificador: String, x:Int, y:Int){}
    fun temCarta():Boolean{return true}
    fun tirarCarta(){}



}