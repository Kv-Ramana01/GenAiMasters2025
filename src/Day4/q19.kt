package Day4

class coffeeMachine(val status : String){
    fun start(){
        if(status == "On"){
            println("Coffee is brewing...")
        }else{
            println("Machine is off.")
        }
    }
}

fun main(){
    val obj = coffeeMachine("On")
    obj.start()
}