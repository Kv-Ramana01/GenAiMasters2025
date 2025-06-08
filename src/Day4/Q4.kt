package Day4


fun greets(name : String?) : String{
    return "Welcome to Sitara Bucks ${name?:"guest"}"
}
fun main(){
    val name = "Ramana"
    println(greets(name))

}