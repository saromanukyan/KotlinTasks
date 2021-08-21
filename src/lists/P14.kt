package lists

/**********************************************************************************************
 * Duplicate the elements of a list.
 ***********************************************************************************************/
fun <T> duplicate(list: List<T>): List<T> {
    val result: MutableList<T> = ArrayList()
    list.forEach { i ->
        with(result) {
            add(i)
            add(i)
        }
    }
    return result
}

fun main() {
    println(duplicate("abccd".toList())) // [a, a, b, b, c, c, c, c, d, d]
}