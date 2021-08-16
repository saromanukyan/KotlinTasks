package arithmetic

/**********************************************************************************************
 * Goldbach's conjecture.
 *
 * Goldbach's conjecture says that every positive even number
 * greater than 2 is the sum of two prime numbers.
 * E.g. 28 = 5 + 23. It is one of the most famous facts in number theory
 * that has not been proved to be correct in the general case.
 * It has been numerically confirmed up to very large numbers (much larger than Kotlin's Int can represent).
 * Write a function to find the two prime numbers that sum up to a given even integer.
 ***********************************************************************************************/
fun Int.goldbach(): Pair<Int, Int> {
    val list = listPrimesInRange(range = 2..this)
    for (first in list) {
        val second = this - first
        if (second.isPrime()) return first to second
    }

    return this to 0
}

fun main() {
    println(28.goldbach()) // (5, 23)
    println(4.goldbach()) // (2, 2)
    println(1000.goldbach()) // (3, 997)
}