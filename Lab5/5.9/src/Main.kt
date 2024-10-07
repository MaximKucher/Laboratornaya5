fun main() {

    println("Введите строку:")
    val input = readLine()


    if (input != null) {

        val reversed = input.reversed()
        println("Обратный порядок: $reversed")
    } else {
        println("Пожалуйста, введите корректную строку.")
    }
}
