package Day4

fun calculateTotal(quantity: Int, pricePerCup: Double?): Double {
    return quantity * (pricePerCup ?: 0.0)
}

fun main(){
    val quantity = 100
    val price : Double? = null

    println(calculateTotal(quantity,price))
}