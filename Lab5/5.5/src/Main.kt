fun main() {
    println("Введите целое число для проверки на простоту:")
    val input = readLine()?.toIntOrNull()
    
    if (input != null && input > 0) {
        val isPrime = isPrime(input)
        if (isPrime) {
            println("Число $input является простым.")
        } else {
            println("Число $input не является простым.")
        }
    } else {
        println("Пожалуйста, введите положительное целое число.")
    }
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}