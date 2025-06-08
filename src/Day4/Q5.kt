package Day4

class CoffeeShop(val name: String) {
    fun printOpeningHours() {
        println("$name is open from 8 AM to 8 PM.")
    }
}

fun main(){
    val obj = CoffeeShop("Habitat")
    obj.printOpeningHours()
}