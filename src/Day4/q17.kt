package Day4

data class CoffeeBean(val name: String, val roastLevel: String)

fun main() {
    val beans = listOf(
        CoffeeBean("Ar", "Light"),
        CoffeeBean("Ro", "Dark"),
        CoffeeBean("Li", "Medium")
    )

    for (bean in beans) {
        println("Name: ${bean.name}, Roast: ${bean.roastLevel}")
    }
}
