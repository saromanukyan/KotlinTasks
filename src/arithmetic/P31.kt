package arithmetic

/**********************************************************************************************
 * Determine whether a given integer number is prime.
 ***********************************************************************************************/
/*fun isPrime(number: Int): Boolean {
    if (number < 2) return false
    for (i in 2 until (number / 2)) if (number % i == 0) return false
    return true
}*/
fun Int.isPrime(): Boolean {
    if (this < 2) return false

    for (i in 2 until (this / 2)) {
        if (this % i == 0) return false
    }
    return true
}

fun main() {
    println((-7).isPrime())   // false
    println(0.isPrime())   // false
    println(7.isPrime())   // true
    println(115.isPrime())   // false
    println(877.isPrime())   // true
}