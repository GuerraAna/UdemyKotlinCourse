package polimorfismo

fun main(){
    val primeiroCachorro = Pintcher()
    primeiroCachorro.comer(10)
        println(primeiroCachorro.comida)

    val segundoCachorro = PastorAlemao()
    segundoCachorro.comer(20)
        println(segundoCachorro.comida)
}

open class Cachorro(
    var comida: Int = 0
) {
    open fun comer(racao: Int) {
        comida = racao
    }
}

class Pintcher(): Cachorro() {

    override fun comer(racao: Int) {
      comida = racao * 2
    }
}

class PastorAlemao(): Cachorro() {

    override fun comer(racao: Int){
        comida = racao * 5
    }
}