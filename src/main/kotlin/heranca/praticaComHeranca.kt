package heranca

fun main() {
    val firstAnimal = Lagarto()
    firstAnimal.camuflar()
    firstAnimal.comer()
    println()

    val secondAnimal = Cobra()
    secondAnimal.descamar()
    secondAnimal.comer()
}
open class Animal() {
    fun comer() {
        println("Este animal come.")
    }
}
class Lagarto: Animal() {
    fun camuflar() {
        println("O Lagarto se camufla.")
    }
}
class Cobra: Animal() {
    fun descamar() {
        println("A Cobra troca de pele.")
    }
}