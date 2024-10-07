fun main() {5
    println("Введите число:")
    val input = readLine()


    if (input != null && input.all { it.isDigit() }) {
        val number = input.toInt()
        val sum = sumOfDigits(number)

        println("Сумма цифр числа $number равна $sum.")
    } else {
        println("Пожалуйста, введите корректное целое число.")
    }
}


fun sumOfDigits(number: Int): Int {
    var sum = 0
    var num = number

    while (num > 0) {
        sum += num % 10
        num /= 10
    }

    return sum
}