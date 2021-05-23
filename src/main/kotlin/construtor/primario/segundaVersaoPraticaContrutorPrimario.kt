package construtor.primario

fun main() {
    val primeiroCarro = ModeloCarro("Rosa", 143.0)
    primeiroCarro.detalhesModeloCarro()
}

class ModeloCarro(val cor: String = "", var altura: Double = 0.0) {

    fun detalhesModeloCarro() {
        println("Cor: $cor, Altura: $altura")
    }
}