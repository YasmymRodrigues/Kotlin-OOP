package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

abstract class Bicicleta(identificador: String, val dataDeAquisicao: Data, val posicao: Posicao): Movimentavel {
     val identificador: String = ""
     val x : Int = 0
     val y: Int = 0

     abstract fun requerCarta()


     override fun toString(): String {
          return "Bicicleta | $identificador | $dataDeAquisicao |  $posicao | $x |$y"
     }
}