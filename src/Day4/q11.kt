package Day4

fun getCoffeePrice(size: String?): Double? {
    return size?.let {
        when (it) {
            "Small" -> 2.5
            "Medium" -> 3.5
            "Large" -> 4.5
            else -> null
        }
    }
}

fun main(){
    println(getCoffeePrice(null))
}