package objeto

fun main() {
    val primeiro_modelo = Carro()
    primeiro_modelo.modelo = "Quadrado"
        println("Modelo: ${primeiro_modelo.modelo}")
    primeiro_modelo.cor = "Vermelho"
        println("Cor: ${primeiro_modelo.cor}")
    primeiro_modelo.altura = 0.0
        println("Altura: ${primeiro_modelo.altura}")
    primeiro_modelo.largura = 0.0
        println("Largura: ${primeiro_modelo.largura}")
    primeiro_modelo.primeiraMarcha()
    primeiro_modelo.segundaMarcha()
    primeiro_modelo.marchas()
}

//Cria objeto carro:
class Carro {
    //Propriedades:
    var modelo: String = ""
    var cor: String = ""
    var altura: Double = 0.0
    var largura: Double = 0.0

    //Métodos:
    fun primeiraMarcha() {
        println("Primeira Marcha")
    }
    fun segundaMarcha() {
        println("Segunda Marcha")
    }
    fun marchas() {
        this.primeiraMarcha()
        this.segundaMarcha()
    }
}