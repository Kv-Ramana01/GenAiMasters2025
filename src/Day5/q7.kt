package Day5

fun readElement(index: Int,list: List<String>) {
    try{
        println("Element: ${list[index]}")
    }catch (e: IndexOutOfBoundsException) {
        println("Index is out of bounds!")
    }
}

fun main(){
    val list = listOf<String>("Latte","Mocha")
    readElement(3,list)
}