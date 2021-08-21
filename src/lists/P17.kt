package lists

/**********************************************************************************************
 * Split a list into two parts.
 * The length of the first part is given. Use a Pair for your result.
 ***********************************************************************************************/
fun <T> split(n: Int, list: List<T>): Pair<List<T>, List<T>> {
    val firstList: MutableList<T> = ArrayList()
    val secondList: MutableList<T> = ArrayList()
    for (i in 0 until list.size) {
        if (i < n) {
            firstList.add(list[i])
        } else secondList.add(list[i])
    }
    return firstList to secondList
}

fun main() {
    println(split(3, "abcdefghijk".toList())) // ([a, b, c], [d, e, f, g, h, i, j, k])
    println(split(3, listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))) // ([1, 2, 3], [4, 5, 6, 7, 8, 9, 10])
}