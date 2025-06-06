package Day3

fun main(){
    val tipNumber = 3
    val tip = when (tipNumber) {
        1 -> "Stir well first!"
        2 -> "Try adding some sugar but not too much!"
        3 -> "Don’t spill the beans!"
        4 -> "A latte a day keeps the yawns away!"
        else -> "Enjoy your coffee!"
    }
    println("Tip: $tip")
}