fun main() {
 
    println("Введите строку:")
    val input = readLine()


    if (input != null) {

        for (char in input) {
            println(char)
        }
    } else {
        println("Вы не ввели строку.")
    }
}
