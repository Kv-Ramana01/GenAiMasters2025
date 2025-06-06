package Day3

//I could have used the primitive way to swap, but I wanted to learn how to do it using functions, so I used
//chatgpt to find this way of swapping 2 variables which is returning the var in pair in opposite slots
fun swap(s: Int, l: Int): Pair<Int, Int> {
    return Pair(l, s)
}

fun main(){
    val small = 10
    val large = 30
    println("Before Swap Small: $small and Large: $large")

    val(newSmall , newLarge) = swap(small,large)

    println("After Swap Small: $newSmall and Large: $newLarge")
}