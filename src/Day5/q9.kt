package Day5

fun divide(a:Int,b:Int){
    try{
        val result = a/b
        println("Result: $result")
    }catch (e: ArithmeticException) {
        println("Math error!")
    }finally{
        println("Execution done")
    }
}


fun main(){
    divide(10,0)
}