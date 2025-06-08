package Day4

fun applyDiscount(prices: List<Double>): List<Double> {
    val discounted = mutableListOf<Double>()
    for (price in prices) {
        discounted.add(price * 0.9)
    }

    /*alternate way of mapping
    discounted = prices.map { it * 0.9 }
     */
    return discounted
}

fun main() {
    val originalPrices = listOf(3.0, 4.5, 5.0)
    val discountedPrices = applyDiscount(originalPrices)

    println("Original Prices: $originalPrices")
    println("Discounted Prices: $discountedPrices")
}
