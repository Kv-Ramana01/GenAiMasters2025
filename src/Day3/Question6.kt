package Day3

fun main(){
    val day = 3
    val recommendation = when(day) {
        1 -> "Espresso"
        2 -> "Latte"
        3 -> "Cappuccino"
        4 -> "Americano"
        5 -> "Mocha"
        6 -> "Flat White"
        7 -> "Macchiato"
        else -> "Chai Peelo"
    }
    println("Try a $recommendation today!")
}