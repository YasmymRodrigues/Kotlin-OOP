package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import javax.xml.crypto.Data

abstract class Bicicleta(identificador: String): Veiculo(identificador) {
     val x : Int = 0
     val y: Int = 0

     abstract override fun requerCarta(): Boolean


     override fun toString(): String {
          return "Bicicleta | $identificador"
          //return "Bicicleta | $identificador | $dataDeAquisicao |  $posicao | $x |$y"
     }
}