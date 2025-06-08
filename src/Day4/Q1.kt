package Day4

fun kaffm(kaffe: String) : String {
    return "Enjoy your $kaffe!"
}

fun main(){
    print("Enter a coffee type: ")
    val kaffe = readLine()
    if (!kaffe.isNullOrBlank()) {
        println(kaffm(kaffe))
    } else {
        println("No coffee type entered! Please try again.")
    }
}