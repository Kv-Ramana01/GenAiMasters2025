package Day5

fun applytwice(x:Int,op: (Int) -> Int): Int{
    return op(op(x))
}

fun main(){
    val x = applytwice(2){it+3}
    println(x)
}