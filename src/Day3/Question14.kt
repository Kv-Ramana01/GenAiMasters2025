package Day3

fun main(){
    val temperature = 75
    val category = when {
        temperature < 60 -> "Too Cold"
        temperature in 60..80 -> "Perfect"
        else -> "Too Hot"
    }
    println("Coffee is $category.")
}