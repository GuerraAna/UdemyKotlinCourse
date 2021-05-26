package abstracao

fun main() {
    testaCondicoes()
}

abstract class Mamifero(var nome: String) {

    var idade: Int = 0
    abstract fun falar()
    fun dormir() {
        println("Estou dormindo.")
    }

}

class Cachorro(nome: String, idade: Int): Mamifero(nome) {

    init {
        this.idade = idade
    }

    override fun falar() {
        println("Au Au!!!")
    }

}

class Gato(nome: String, idade: Int): Mamifero(nome) {

    init {
        this.idade = idade
    }

    override fun falar() {
        println("Miau Miau...")
    }

}

fun testaCondicoes() {
    val primeiroAnimal = Cachorro(nome = "Zac", idade = 20)

    println(primeiroAnimal.nome)
    println(primeiroAnimal.idade)
    println()
    println(primeiroAnimal.falar())
    println(primeiroAnimal.dormir())
    println()

    val segundoAnimal = Gato(nome = "Milow", idade = 10)

    println(segundoAnimal.nome)
    println(segundoAnimal.idade)
    println(segundoAnimal.falar())
    println(segundoAnimal.dormir())

}