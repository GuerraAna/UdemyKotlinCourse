package sobrescritaDeMetodos

fun main() {
    val primeiroAnimal = Cachorro()
    primeiroAnimal.comer()
    primeiroAnimal.dormir()
    primeiroAnimal.latir()
    println()

    val segundoAnimal = Passaro()
    segundoAnimal.comer()
    segundoAnimal.dormir()
    segundoAnimal.voar()

}

open class Animal {
    open fun comer() {
        println("Come:")
    }
    open fun dormir() {
        println("Dorme:")
    }
}

class Cachorro: Animal() {
    fun latir() {
        println("O Cachorro late.")
    }
    override fun comer() {
        super.comer()
        println("como um cachorro.")
    }
    override fun dormir() {
        super.dormir()
        println("como um cachorro.")
    }

}

class Passaro: Animal() {
    fun voar() {
        println("O Pássaro voa.")
    }
    override fun comer() {
        super.comer()
        println("como um pássaro.")
    }
    override fun dormir() {
        super.dormir()
        println("como um pássaro.")
    }
}