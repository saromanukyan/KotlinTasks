package lists

/**********************************************************************************************
 * Decode a run-length encoded list.
 *
 * Given a run-length code list generated as specified in the problem P10,
 * construct its uncompressed version.
 ***********************************************************************************************/
fun <T> decode(list: List<Pair<Int, T>>): List<T> {
    val result: MutableList<T> = ArrayList()
    for (index in list) {
        val temp: MutableList<T> = ArrayList()
        var countOfElements = index.first
        while (countOfElements > 0) {
            temp.add(index.second)
            countOfElements--
        }
        result.addAll(temp)
    }
    return result
}

fun main() {
    println(decode(listOf(
        4 to 'a',
        1 to 'b',
        2 to 'c',
        2 to 'a',
        1 to 'd',
        4 to 'e'
    )))   // [a, a, a, a, b, c, c, a, a, d, e, e, e, e]

}