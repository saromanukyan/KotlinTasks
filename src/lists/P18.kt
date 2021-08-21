package lists

/**********************************************************************************************
 * Extract a slice from a list.
 *
 * Given two indices, I and K, the slice is the list containing the elements from
 * and including the Ith element up to but not including the Kth element of the original list.
 * Start counting the elements with 0.
 ***********************************************************************************************/
fun <T> slice(start: Int, end: Int, list: List<T>): List<T> {
    val result: MutableList<T> = ArrayList()
    for (i in 0 until list.size) {
        if (i in start until end)
            result.add(list[i])
    }
    return result
}

fun main() {
    println(slice(3, 7, "abcdefghijk".toList())) // [d, e, f, g]
    println(slice(3, 7, listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))) // [3, 4, 5, 6]
}