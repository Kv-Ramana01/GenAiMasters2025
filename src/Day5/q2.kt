package Day5

fun main(){
    val num = listOf<Int>(1,2,3,4,5,6)

    val evens = num.filter { it % 2 == 0 }
    println("Even numbers(filter) : $evens")

    fun customFilter(list: List<Int> , p : (Int) -> Boolean): List<Int> {
        val result = mutableListOf<Int>()
        for(num in list){
            if(p(num)) result.add(num)
        }

        return result
    }

    val evenC = customFilter(num){it % 2 == 0}
    println("Even nunmbers(custom): $evenC")
}