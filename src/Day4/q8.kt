package Day4

data class Barista(val name: String, val favoriteCoffee: String?)

fun main(){
    val barista = Barista("ramana","latte")
    println("${barista.name}'s favorite coffee: ${barista.favoriteCoffee ?: "Unknown"}")
}