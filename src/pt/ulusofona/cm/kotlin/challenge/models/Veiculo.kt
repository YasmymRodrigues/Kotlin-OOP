package pt.ulusofona.cm.kotlin.challenge.models

import javax.xml.crypto.Data

open class Veiculo(val identificador: String,val posicao: Posicao, val dataDeAquisicao: Data) {

    open fun requerCarta(): Boolean{ return false}


}
