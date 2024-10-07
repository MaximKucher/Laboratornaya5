fun main() {
  5
    println("Введите количество чисел Фибоначчи:")
    val n = readLine()?.toIntOrNull()

    if (n == null || n <= 0) {
        println("Пожалуйста, введите положительное целое число.")
        return
    }


    val fibonacci = mutableListOf<Int>()
    for (i in 0 until n) {
        when (i) {
            0 -> fibonacci.add(0)
            1 -> fibonacci.add(1)
            else -> {
                val nextFib = fibonacci[i - 1] + fibonacci[i - 2]
                fibonacci.add(nextFib)
            }
        }
    }

    println("Первые $n чисел Фибоначчи: $fibonacci")
}