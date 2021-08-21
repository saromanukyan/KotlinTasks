package lists

/**********************************************************************************************
 * Modified run-length encoding.
 * Modify the result of problem P10 in such a way that if an element has no duplicates
 * it is simply copied into the result list.
 * Only elements with duplicates are transferred as (N, E) terms.
 ***********************************************************************************************/
fun <T> encodeModified(list: List<T>): MutableList<Any> {
    val temp: MutableList<List<T>> = pack(list)
    val result: MutableList<Any> = ArrayList()

    for (element in temp) {
        when (element.size) {
            1 -> result.add(element[0]!!)
            else -> result.add(element.size to element[0])
        }
    }
    return result
}

fun main() {
    println(encodeModified("aaaabccaadeeee".toList())) // [(4, a), b, (2, c), (2, a), d, (4, e)]
    println(encodeModified(listOf(1, 1, 1, 2, 2, 3, 4, 4, 4, 5))) // [(3, 1), (2, 2), 3, (3, 4), 5]
}