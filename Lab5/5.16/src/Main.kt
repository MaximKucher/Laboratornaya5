fun main() {

    println("Введите число N:")
    val input = readLine()


    val N = input?.toIntOrNull()
    if (N == null || N <= 0) {
        println("Пожалуйста, введите положительное целое число.")
        return
    }

    val sumOfSquares = (1..N).sumOf { it * it }

    println("Сумма квадратов чисел от 1 до $N равна $sumOfSquares.")
}
