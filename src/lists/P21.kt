package lists

import java.text.FieldPosition

/**********************************************************************************************
 * Insert an element at a given position into a list.
 ***********************************************************************************************/
fun <T> insertAt(element: T, position: Int, list: List<T>): List<T> {
    val result: MutableList<T> = ArrayList()
    for (i in 0 until list.size) {
        if (i == position) result.add(element)
        result.add(list[i])
    }
    return result
}

fun main() {
    println(insertAt('X', 1, "abcd".toList())) // [a, X, b, c, d]
}