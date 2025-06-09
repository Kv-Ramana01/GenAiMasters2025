package Day5

class NegativeNumberException(message:String) : Exception(message)


fun checkNumber(num: Int){
    if(num < 0){
        throw NegativeNumberException("Number is negative: $num")
    }else{
        println("Number is valid: $num")
    }
}

fun main(){
    try{
        checkNumber(-5)
    }catch(e: NegativeNumberException){
        println(e.message)
    }
}