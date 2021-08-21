package lists

/**********************************************************************************************
 * Find the number of elements of a list.
 ***********************************************************************************************/

fun <T> length(list: List<T>) = list.size

fun main() {
    val list = emptyList<Int>()
    println(length(listOf(1, 1, 2, 3, 5, 8)))  // 6
    println(length(listOf("1", "1", "2", "3", "5", "8")))  // 6
    println(length(list))  // 0
}