package Day4

import com.sun.jdi.Type

data class CoffeeOrder(val type: String,val size: String){}


fun main(){
    val obj = CoffeeOrder("Latte","450ml")
    println("Order: ${obj.type} \n Size: ${obj.size}")
}