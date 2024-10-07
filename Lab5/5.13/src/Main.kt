fun main() {

    println("Число\tКвадрат")
    println("------------------")

    for (i in 1..20) {
        val square = i * i
        println("$i\t$square")
    }
}