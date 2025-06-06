package Day3

fun main(){
    val price = 7
    when (price) {
        in 1..3 -> println("Low priced coffee!")
        in 4..6 -> println("Medium priced coffee!")
        in 7..10 -> println("High priced coffee!")
        else -> println("Invalid price!")
    }
}