package pt.ulusofona.cm.kotlin.challenge.models

open class Veiculo(val identificador: String,val posicao: Posicao, val dataDeAquisicao: Date) {

    open fun requerCarta(): Boolean{ return false}


}
