package Day3

fun main(){
    for (order in 1..10) {
        if (order % 3 == 0) continue
        // nothing was mentioned about the decaf orders in the question so assuming orders div by 3 are decaf
        println("Processing order #$order")
    }
}