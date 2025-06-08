package Day4

data class CoffeeMenu(val items: List<String>) {
    fun printMenu() {
        items.forEach { println(it) }
    }
}

fun main(){
    val items = listOf<String>("Frappucino","Latte","Espresso","Cappucino")
    val obj = CoffeeMenu(items)
    obj.printMenu()
}