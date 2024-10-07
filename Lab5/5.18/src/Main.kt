fun main() {

    println("Введите высоту лестницы:")
    val input = readLine()


    if (input != null) {
        val height = input.toIntOrNull()


        if (height != null && height > 0) {

            for (i in 1..height) {
                println("#".repeat(i))
            }
        } else {
            println("Пожалуйста, введите положительное целое число.")
        }
    } else {
        println("Вы не ввели значение.")
    }
}
