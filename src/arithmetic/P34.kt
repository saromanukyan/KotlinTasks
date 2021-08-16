package arithmetic

/**********************************************************************************************
 * Calculate Euler's totient function phi(m).
 *
 * Euler's so-called totient function phi(m) is defined
 * as the number of positive integers r (1 <= r <= m) that are coprime to m.
 ***********************************************************************************************/
fun Int.totient(): Int {
    var countOfCoPrimes = 1
    for (i in 2..this)
        if (i isCoprimeTo this) countOfCoPrimes++
    return countOfCoPrimes
}

fun main() {
    println(10.totient())  // 4
    println(2.totient())  // 1
    println(6.totient())  // 2
}