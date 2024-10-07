fun main() {

    println("Введите первое число:")
    val a = readLine()?.toIntOrNull()

    println("Введите второе число:")
    val b = readLine()?.toIntOrNull()

    if (a == null || b == null || a < 0 || b < 0) {
        println("Пожалуйста, введите два положительных целых числа.")
        return
    }


    val gcd = euclideanAlgorithm(a, b)


    println("Наибольший общий делитель (НОД) чисел $a и $b равен $gcd.")
}


fun euclideanAlgorithm(a: Int, b: Int): Int {
    var x = a
    var y = b

    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }

    return x
}