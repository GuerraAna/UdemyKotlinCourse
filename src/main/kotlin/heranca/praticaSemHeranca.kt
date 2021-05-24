package heranca

fun main() {
    val primeiroAnimal = Cachorro()
    primeiroAnimal.latir()
    primeiroAnimal.comer()
    println()

    val segundoAnimal = Passaro()
    segundoAnimal.voar()
    segundoAnimal.comer()
}
class Cachorro {
    fun latir() {
        println("O cachorro está latindo.")
    }
    fun comer() {
        println("Agora comendo.")
    }
}

class Passaro {
    fun voar() {
        println("O pássaro está voando.")
    }
    fun comer() {
        println("Agora comendo.")
    }
}