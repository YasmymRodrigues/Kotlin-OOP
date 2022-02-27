package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Pessoa(nome: String, dataDeNascimento: Date) {
    val nome : String =""
    val carta : Carta = TODO()
    var veiculos: List<Veiculo>
    var posicao : Posicao
    var x: Int = 0
    var y: Int = 0



    //fun comprarVeiculo(veiculo: Veiculo){}
//    fun pesquisarVeiculo(identificador: String): Veiculo {
//        return Veiculo("");
//    }
    fun venderVeiculo(identificador: String, comprador: Pessoa){}
    fun moverVeiculoPara(identificador: String, x:Int, y:Int){}
    fun temCarta():Boolean{return true}
    fun tirarCarta(){}


    override fun toString(): String {
        return "Pessoa |"
        //return "Pessoa | $nome | $dataDeNascimento |  $posicao | $x |$y"
    }
}