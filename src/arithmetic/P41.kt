package arithmetic

/**********************************************************************************************
 * A list of Goldbach compositions.
 *
 * Given a range of integers by its lower and upper limit,
 * print a list of all even numbers and their Goldbach composition.
 ***********************************************************************************************/
fun printGoldbachList(range: IntRange) {
    for (i in range) {
        if (i % 2 == 0) {
            val pair = i.goldbach()
            println("$i = ${pair.first} + ${pair.second}")
        }
    }
}

/**********************************************************************************************
 * In most cases, if an even number is written as the sum of two prime numbers,
 * one of them is very small. Very rarely, the primes are both bigger than, say, 50.
 * Example (minimum value of 50 for the primes):
 ***********************************************************************************************/
fun printGoldbachListLimited(range: IntRange, limit: Int) {
    var start = range.first
    if (start < limit) start = limit
    for (i in start..range.last) {
        if (i % 2 == 0) {
            val pair = i.goldbach()
            if (pair.first < limit) continue
            println("$i = ${pair.first} + ${pair.second}")
        }
    }
}


fun main() {
    printGoldbachList(9..20)
    printGoldbachListLimited(2..3000, 50)

}