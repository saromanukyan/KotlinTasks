package arithmetic

/**********************************************************************************************
 * Determine whether two positive integer numbers are coprime.
 * Two numbers are coprime if their greatest common divisor equals 1.
 ***********************************************************************************************/
infix fun Int.isCoprimeTo(n: Int): Boolean {
    return gcd(this, n) == 1
}

fun main() {
    println(35 isCoprimeTo 64)  // true
    println(2.isCoprimeTo(10))  // false
}