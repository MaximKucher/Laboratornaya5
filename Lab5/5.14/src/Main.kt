import kotlin.random.Random

fun main() {

    val randomNumbers = List(10) { Random.nextInt(1, 101) }

    println("Случайные числа:")
    for (number in randomNumbers) {
        println(number)
    }
}