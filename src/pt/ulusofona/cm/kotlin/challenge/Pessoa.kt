package pt.ulusofona.cm.kotlin.challenge

import java.util.*
import javax.xml.crypto.Data

class Pessoa(nome: String, dataDeNascimento: Date) {
    private val nome : String =""
    private val list = mutableListOf<Veiculo>()
    abstract val dataDeNascimento : Date
    abstract val carta : Carta
    abstract val posicao : Posicao


    fun comprarVeiculo(veiculo: Veiculo){}
    fun pesquisarVeiculo(identificador: String): Veiculo{ return Veiculo(nome, posicao, dataDeNascimento )}
    fun venderVeiculo(identificador: String, comprador:Pessoa){}
    fun moverVeiculoPara(identificador: String, x:Int, y:Int){}
    fun temCarta():Boolean{return true}
    fun tirarCarta(){}



}