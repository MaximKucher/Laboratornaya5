fun main() {
 
    val numbers = arrayOf(34, 12, 45, 23, 67, 89, 10, 56)


    for (i in numbers.indices) {
        for (j in 0 until numbers.size - 1 - i) {
            if (numbers[j] > numbers[j + 1]) {

                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }


    println("Отсортированный массив: ${numbers.joinToString(", ")}")
}
