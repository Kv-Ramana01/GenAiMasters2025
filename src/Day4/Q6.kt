package Day4

fun highestPrice(prices: List<Double>): Double {
    return prices.max()
}

fun main(){
    val prices = listOf<Double>(1.0,2.0,3.0,4.0)
    println(highestPrice(prices))


}