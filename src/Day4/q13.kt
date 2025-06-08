package Day4

import java.io.StringReader

fun countUniqueOrders(orders: Set<String>) {
    println("Unique orders: ${orders.size}")
}


fun main(){
    val orders = setOf<String>("Ar","Ar","Br","Cr")
    countUniqueOrders(orders)
}