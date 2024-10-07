fun main() {

    println("Введите начальное число:")
    val start = readLine()?.toIntOrNull() ?: return println("Некорректный ввод начального числа.")

    println("Введите шаг:")
    val step = readLine()?.toIntOrNull() ?: return println("Некорректный ввод шага.")


    println("Сгенерированная числовая последовательность:")
    generateSequence(start, step).take(10).forEach { print("$it ") }
}


fun generateSequence(start: Int, step: Int): Sequence<Int> {
    return sequence {
        var current = start
        while (true) {
            yield(current)
            current += step
        }
    }
}