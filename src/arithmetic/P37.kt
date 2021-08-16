package arithmetic

/**********************************************************************************************
 * Calculate Euler's totient function phi(m) (improved).
 *
 * See problem P34 for the definition of Euler's totient function.
 * If the list of the prime factors of a number m is known in the form of problem P36,
 * then the function phi(m) can be efficiently calculated as follows:
 * Let [[p1, m1], [p2, m2], [p3, m3], ...] be the list of prime factors (and their multiplicities) of a given number m.
 * Then phi(m) can be calculated with the following formula:
 * phi(m) = (p1-1)*p1^(m1-1) * (p2-1)*p2^(m2-1) * (p3-1)*p3^(m3-1) * ...
 ***********************************************************************************************/
import kotlin.math.pow

fun phi(m: Int): Double {
    var result = 1.0
    val listOfPrimeFactors = m.primeFactorMultiplicity()
    for ((i, j) in listOfPrimeFactors) {
        val first = i.toDouble()
        val second = j.toDouble()
        result *= (first - 1) * (first.pow(second))
    }
    return result
}

fun main() {
    println(phi(315))  // 15120.0
    println(phi(144))  // 288.0
    println(phi(360))  // 2880.0
    println(phi(935))  // 598400.0
}