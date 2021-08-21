package lists

/**********************************************************************************************
 * Run-length encoding of a list.
 * Use the result of problem P09 to implement the so-called run-length
 * encoding data compression method.
 * Consecutive duplicates of elements are encoded as tuples (N, E)
 * where N is the number of duplicates of the element E.
 ***********************************************************************************************/
fun <T> encode(list: List<T>): MutableList<Pair<Int, T>> {
    val temp: MutableList<List<T>> = pack(list)
    val result: MutableList<Pair<Int, T>> = ArrayList()

    for (element in temp) {
        result.add(element.size to element[0])
    }
    return result
}

fun main() {
    println(encode("aaaabccaadeeee".toList())) // [(4, a), (1, b), (2, c), (2, a), (1, d), (4, e)]
    println(encode(listOf(1, 1, 1, 2, 2, 3, 4, 4, 4, 5))) // [(3, 1), (2, 2), (1, 3), (3, 4), (1, 5)]
}