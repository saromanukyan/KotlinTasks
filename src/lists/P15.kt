package lists

/**********************************************************************************************
 * Duplicate the elements of a list a given number of times.
 ***********************************************************************************************/
fun <T> duplicateN(n: Int, list: List<T>): List<T> {
    val result: MutableList<T> = ArrayList()
    for (i in list) {
        for (j in 1..n)
            result.add(i)
    }
    return result
}

fun main() {
    println(duplicateN(3, "abccd".toList())) // [a, a, a, b, b, b, c, c, c, c, c, c, d, d, d]
}