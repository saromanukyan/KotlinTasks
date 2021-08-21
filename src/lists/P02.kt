package lists

/**********************************************************************************************
 * Find the last but one element of a list.
 ***********************************************************************************************/

fun <T> penultimate(list: List<T>) = list.get(index = list.size - 2)

fun main() {
    println(penultimate(listOf(1, 1, 2, 3, 5, 8)))  // 5
    println(penultimate(listOf("1", "1", "2", "3", "5", "8")))  // 5
}