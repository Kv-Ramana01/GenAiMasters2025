package Day3

fun main(){
    val caffeine = 65
    val strength = when(caffeine) {
        in 1..33 -> "Mild"
        in 34..66 -> "Medium"
        in 67..100 -> "Strong"
        else -> "Unknown"
    }

    println("Your coffee strength is $strength")
}