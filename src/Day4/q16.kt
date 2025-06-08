package Day4

fun check(type:String?,list: List<String>){
    if ((type in list) && (type != null)){
        println("Valid")
    }else{
        println("Invalid")
    }
}

fun main(){
    val coffelist = listOf<String>("Latte","Cappucino","Espresso","Frappucino")
    check(null,coffelist)
}