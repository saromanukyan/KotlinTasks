package arithmetic

/**********************************************************************************************
 * Determine prime factors of a given positive integer.
 * Construct a list containing prime factors in ascending order.
 ***********************************************************************************************/

fun Int.primeFactors(): List<Int> {
    var n = this
    // val mutableList= emptyList<Int>()
    val list: ArrayList<Int> = ArrayList()
    for (i in 2 until n) {
        while (n % i == 0) {
            list.add(i)
            n /= i
        }
    }
    if (n > 2) list.add(n)
    return list
}

fun main() {
    println(315.primeFactors())  // [3, 3, 5, 7]
    println(144.primeFactors())  // [2, 2, 2, 2, 3, 3]
    println(360.primeFactors())  // [2, 2, 2, 3, 3, 5]
    println(935.primeFactors())  // [5, 11, 17]
    println(32.primeFactors())  // [2, 2, 2, 2, 2]
}