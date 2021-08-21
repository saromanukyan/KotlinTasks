package lists

/**********************************************************************************************
 * Find the Nth element of a list.
 ***********************************************************************************************/

fun <T> nth(index: Int, list: List<T>) = list.get(index)

fun main() {
    println(nth(2, listOf(1, 1, 2, 3, 5, 8)))  // 2
    println(nth(2, listOf("1", "1", "2", "3", "5", "8")))  // 2
}