package collections

fun main() {
    val listaMusicas = listOf("Ana Gabriela", "Cazuza", "Alok")
        println(listaMusicas)
        println(listaMusicas[2])
        println(listaMusicas.size)
        println(listaMusicas.isEmpty())
    //listaMusicas.add("Luan")
    //listaMusicas.remove("Ana Gabriela")
    //listaMusicas[2] = "Michael Jackson"

    val listaMusicas1 = arrayOf("Ana Gabriela", "Cazuza", "Alok")
        println(listaMusicas1)
        println(listaMusicas1[1])
        println(listaMusicas1.size)
        println(listaMusicas1.isEmpty())
    //listaMusicas1.add("Luan")
    //listaMusicas1.remove("Ana Gabriela")
    //listaMusicas1[2] = "Michael Jackson"

    val listaMusicas2 = arrayListOf("Ana Gabriela", "Cazuza", "Alok")
        println(listaMusicas2)
    listaMusicas2.add("Luan")
        println(listaMusicas2)
    listaMusicas2.remove(element = "Ana Gabriela")
        println(listaMusicas2)
    listaMusicas2[2] = "The Beatles"
        println(listaMusicas2)

    val listaMusicas3 = mutableListOf("Ana Gabriela", "Cazuza", "Alok")
        println(listaMusicas3)
    listaMusicas3.add("Shawn Mendes")
        println(listaMusicas3)
    listaMusicas3.remove(element = "Cazuza")
        println(listaMusicas3)
    listaMusicas3[2] = "Michael Jackson"
        println(listaMusicas3)
}