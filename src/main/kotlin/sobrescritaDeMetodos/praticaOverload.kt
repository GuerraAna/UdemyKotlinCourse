package sobrescritaDeMetodos

fun main() {
    val primeiraPessoa = Pessoa()
    primeiraPessoa.overload(12)
    primeiraPessoa.overload("Pedro")
    primeiraPessoa.overload(10,"Carlinha")
}

class Pessoa() {
    //Sobrecarga.
    fun overload (i: Int) = println("maria")
    fun overload (i: String) = println("carlos")
    fun overload (i: Int, p:String) = println("pedro")
}