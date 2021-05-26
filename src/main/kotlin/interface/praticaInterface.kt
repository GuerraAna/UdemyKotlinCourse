package `interface`

fun main() {
    val limao = Limao()
    limao.vitaminaC()
    limao.vitaminaE()
    println()

    val jabuticaba = Jabuticaba()
    jabuticaba.vitaminaC()
    jabuticaba.vitaminaE()
}

interface Vitaminas {
    fun vitaminaE()
    fun vitaminaC()
}

open class Frutas() {
    fun vitamina() {
        println("Todas as frutas possuem vitamina")
    }
}

class Limao: Frutas(), Vitaminas {
    override fun vitaminaE() {
        println("A fruta limão NÃO tem vitamina E!")
    }

    override fun vitaminaC() {
        println("A fruta limão tem a vitamina C!")
    }
}

class Jabuticaba: Frutas(), Vitaminas {
    override fun vitaminaE() {
        println("A fruta Jabuticaba tem a vitamina E.")
    }
    override fun vitaminaC() {
        println("A fruta Jabuticaba NÃO tem a vitamina C!")
    }

}