package lists

/**********************************************************************************************
 * Run-length encoding of a list (direct solution).
 * Implement the so-called run-length encoding data compression method directly.
 * I.e. don't use other methods you've written (like P09's pack); do all the work directly.
 ***********************************************************************************************/
fun <T> encodeDirect(list: List<T>): MutableList<Pair<Int, T>> {
    val result: MutableList<Pair<Int, T>> = ArrayList()
    var firstElement = 1
    var secondElement = list[0]
    for (i in 1 until list.size) {
        if (list[i] != list[i - 1]) {
            result.add(firstElement to secondElement)
            firstElement = 1
            secondElement = list[i]
        } else firstElement++
    }
    result.add(firstElement to secondElement)
    return result
}

fun main() {
    println(encodeDirect("aaaabccaadeeee".toList())) // [(4, a), (1, b), (2, c), (2, a), (1, d), (4, e)]
    println(encodeDirect(listOf(1, 1, 1, 2, 2, 3, 4, 4, 4, 5))) // [(3, 1), (2, 2), (1, 3), (3, 4), (1, 5)]
}
