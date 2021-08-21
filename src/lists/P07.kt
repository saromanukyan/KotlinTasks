package lists

/**********************************************************************************************
 * Flatten a nested list structure.
 ***********************************************************************************************/

fun flatten(list: List<Any>): List<Any> {
    val result: MutableList<Any> = ArrayList()
    for (element in list) {
        if (element is List<*>) result.addAll(flatten(element as List<Any>))
        else result.add(element)
    }
    return result
}

fun main() {
    println(flatten(listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8)))))  // [1, 1, 2, 3, 5, 8]
}