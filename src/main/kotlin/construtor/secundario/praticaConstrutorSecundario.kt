package construtor.secundario

fun main() {
    val motoca = Moto("Vermelho", "BMW")
    motoca.detalhesMoto()
}

class Moto {

    var cor: String = ""
    var modelo = ""

    constructor(
        cor: String,
        modelo: String,
    ){
        this.cor = cor
        this.modelo = modelo
    }
    fun detalhesMoto() {
        println("Cor: $cor, Modelo: $modelo")
    }
}