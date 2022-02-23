package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Bicicleta(identificador: String): Movimentavel {
     val identificador: String = ""
     abstract val dataDeAquisicao: Date
     abstract val posicao: Posicao
     val x : Int = 0
     val y: Int = 0

     override fun toString(): String {
          return "Bicicleta | $identificador | $dataDeAquisicao |  $posicao | $x |$y"
     }
}