package Day4

class CoffeeCup constructor(temp: Int) {
    val temperature: Int

    init {
        this.temperature = temp
    }

    fun isTooHot(): Boolean {
        return temperature > 70
    }
}

fun main(){
    val obj = CoffeeCup(75)

    if(obj.isTooHot()){
        println("coffee is too hot")
    }else{
        println("coffee is just fine")
    }

}