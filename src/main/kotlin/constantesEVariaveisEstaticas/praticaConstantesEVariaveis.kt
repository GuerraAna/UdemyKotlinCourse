package constantesEVariaveisEstaticas

fun main() {
    Moeda.papel("papel")
}

private class Moeda() {
    companion object{
        fun papel(estado: String){
            println(estado)
        }
    }
}