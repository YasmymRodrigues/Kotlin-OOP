package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*
import javax.xml.crypto.Data

abstract class Bicicleta(identificador: String):Veiculo(identificador), Movimentavel {
     val dataDeNascimento: Date = TODO()
     abstract val posicao: Posicao
     override fun moverPara(x:Int, y:Int) {}

     override fun toString(): String {
          return "Bicicleta | "
          //return "Bicicleta | $identificador | $dataDeAquisicao |  $posicao | $x |$y"
     }
}