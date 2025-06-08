package Day4

fun sort(kaffeN : List<String>){
    /*var sorted = kaffeN.map { it.lowercase()}
    sorted = sorted.sorted()
    println(sorted)*/

    val first = kaffeN.sortedBy { it.lowercase() }.firstOrNull()

    if(first!=null){
        println("First coffee: $first")
    }else{
        println("No coffees available")
    }
}

fun main(){
    val kaffeN = listOf<String>("Latte","Cappucino","Black Coffee","Almond Kaffe")
    sort(kaffeN)
}