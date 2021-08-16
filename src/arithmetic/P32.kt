package arithmetic

/**********************************************************************************************
 * Determine whether a given integer number is prime.
 * Use Euclid's algorithm.
 ***********************************************************************************************/
fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun main() {
    println(gcd(36, 63))  // 9
}