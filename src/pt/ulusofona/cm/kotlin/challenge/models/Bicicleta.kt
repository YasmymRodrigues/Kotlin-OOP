package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import javax.xml.crypto.Data

abstract class Bicicleta(identificador: String) {


     override fun toString(): String {
          return "Bicicleta | "
          //return "Bicicleta | $identificador | $dataDeAquisicao |  $posicao | $x |$y"
     }
}