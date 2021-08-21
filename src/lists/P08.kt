package lists

import java.util.stream.IntStream

/**********************************************************************************************
 * Eliminate consecutive duplicates of list elements.
 *
 * If a list contains repeated elements,
 * they should be replaced with a single copy of the element.
 * The order of the elements should not be changed.
 ***********************************************************************************************/

fun <T> compress(list: List<T>): MutableList<T> {
    val result: MutableList<T> = mutableListOf()
    result.add(list[0])
    for (i in 1 until list.size) if (list[i] != list[i - 1]) result += list[i]
    return result
}

fun main() {
    println(compress("aaaabccaadeeee".toList())) // [a, b, c, a, d, e]
    println(compress(listOf(1, 1, 1, 2, 2, 3, 4, 4, 4, 5))) // [1, 2, 3, 4, 5]
}