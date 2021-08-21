package lists

import kotlin.random.Random

/**********************************************************************************************
 * Extract a given number of randomly selected elements from a list.
 * Make sure there is a way to produce deterministic results.
 ***********************************************************************************************/
fun <T> randomSelect(n: Int, list: List<T>): List<T> {
    val result: MutableList<T> = ArrayList()
    val indexSet: MutableSet<Int> = mutableSetOf()

    for (i in 1..n) {
        var index: Int = Random.nextInt(0, list.size)
        while (indexSet.contains(index)) {
            index = Random.nextInt(0, list.size)
        }
        indexSet.add(index)
        result.add(list[index])
    }
    return result
}

fun main() {
    println(randomSelect(3, "abcdefgh".toList())) // [e, h, f]
    println(randomSelect(3, "abcdefgh".toList())) // [g, b, f]
    println(randomSelect(3, "abcdefgh".toList())) // [f, b, g]
}