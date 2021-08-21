package lists

/**********************************************************************************************
 * Drop every Nth element from a list.
 ***********************************************************************************************/
fun <T> drop(n: Int, list: List<T>): List<T> {
    if (n == 0) return list
    val result: MutableList<T> = ArrayList()
    for (i in 0 until list.size) {
        if ((i + 1) % n == 0) continue
        result.add(list[i])
    }
    return result
}

fun main() {
    println(drop(3, "abcdefghijk".toList())) // [a, b, d, e, g, h, j, k]
    println(drop(3, listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))) // [1, 2, 4, 5, 7, 8, 10]
}