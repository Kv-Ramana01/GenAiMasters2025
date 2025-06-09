package Day5

import java.text.NumberFormat

fun main(){
    try{
        val number = "abc".toInt()
        println(number)
    }catch(e: NumberFormatException) {
        println("Invalid Number Format!")
    }
}