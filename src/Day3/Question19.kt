package Day3

fun main(){
    for(count in 1..5){
        if(count == 5){
            println("Rush Hour!")
            break
        }
        println("Order Number: $count")
    }
}