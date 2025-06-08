package Day4

fun filterKaffe(coffeetypes : List<String>) : List<String> {
    return coffeetypes.filter { it.startsWith("C") }
}

fun main(){
    val coffetypes = listOf<String>("Cappucino","Espresso","Cafe Latte","Black Kaffe")

    val new = filterKaffe(coffetypes)
    println(new)

}