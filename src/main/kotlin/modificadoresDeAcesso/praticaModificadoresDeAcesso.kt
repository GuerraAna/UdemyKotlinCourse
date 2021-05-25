package modificadoresDeAcesso

fun main() {
    val primeiroCarro = Carro()
    primeiroCarro.detalhes()
    primeiroCarro.acelerar()
    primeiroCarro.parar()
    println()
}

open class Veiculo(
    val cor: String = "Rosa"
) {
    fun acelerar() {
        println("O veículo acelera.")
    }
    fun parar() {
        println("O veículo para.")
    }
}

class Carro: Veiculo() {
    fun detalhes() {
        println("Cor: $cor.")
    }
}