package Day4

fun mostExpensiveCoffee(coffeeMap: Map<String, Double>) {
    val mostExpensive = coffeeMap.maxBy{ it.value }
    println("Most expensive: ${mostExpensive.key} - Rupees ${mostExpensive.value}")
}

fun main(){
    val coffeeMap = mapOf<String, Double>("Latte" to 250.0,"Frappucino" to 350.0,"Cappucino" to 400.0)
    mostExpensiveCoffee(coffeeMap)
}