package Day5

fun main(){
    val names = listOf("latte","espresso","mocha")

    val uppercased = names.map{it.uppercase()}

    println(uppercased)

    println("Using forEach: ")
    names.forEach { println(it.uppercase()) }
}