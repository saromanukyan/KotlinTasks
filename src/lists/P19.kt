package lists

import kotlin.math.abs

/**********************************************************************************************
 * Rotate a list N places to the left.
 ***********************************************************************************************/
fun <T> rotate(n: Int, list: List<T>): List<T> {
    val result: MutableList<T> = ArrayList()
    val firstIndex: Int
    when {
        n == 0 || abs(n) == 0 -> return list
        n > 0 -> {
            if (n > list.size) firstIndex = n % list.size else firstIndex = n
        }
        else -> {
            if ((abs(n) > list.size)) firstIndex = list.size + n % list.size else firstIndex = n + list.size
        }
    }

    for (i in firstIndex until list.size) {
        result.add(list[i])
    }
    for (i in 0 until firstIndex) {
        result.add(list[i])
    }
    return result
}

fun main() {
    println(rotate(3, "abcdefghijk".toList())) // [d, e, f, g, h, i, j, k, a, b, c]
    println(rotate(-2, "abcdefghijk".toList())) // [j, k, a, b, c, d, e, f, g, h, i]
}