package Day4

class Customer(var loyaltyPoints: Int) {
    fun addPoints(points: Int) {
        loyaltyPoints += points
    }
}

fun main(){
    val obj = Customer(100)
    println("Current loyalty Points: ${obj.loyaltyPoints}")
    println("Adding 20 points..")
    obj.addPoints(20)
    println("Current loyalty Points: ${obj.loyaltyPoints}")
}