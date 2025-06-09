package Day5

//a higher order function is a function that takes another function as a parameter or returns  a function

fun applyfun(x: Int, op : (Int) -> Int): Int{
    return op(x)
}

fun main(){
    val square = applyfun(5) {it*it}
    println(square)
}