package Day5

fun oper(list: List<Int>, op: (Int) -> Int): List<Int>{
    val res = mutableListOf<Int>()
    for(item in list){
        res.add(op(item))
    }
    return res
}


fun main(){
    val num = listOf<Int>(1,2,3,5,7)

    val res = oper(num){it*2}
    println(res)
}
