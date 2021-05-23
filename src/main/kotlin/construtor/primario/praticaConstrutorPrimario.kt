package construtor.primario

fun main() {
    val primerioCarro = Carro("Vermelho", 90.0, 110.0)
    primerioCarro.detalhesCarro()
}

class Carro(cor: String, altura: Double, largura: Double) {

    var cor: String = ""
    var altura: Double = 0.0
    var largura: Double = 0.0

        init {
            this.cor = cor
            this.altura = altura
            this.largura = largura
        }

    fun detalhesCarro() {
        println("Cor: $cor, Altura: $altura, Largura: $largura")
    }
}