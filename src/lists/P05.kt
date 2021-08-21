package lists

/**********************************************************************************************
 * Reverse a list.
 ***********************************************************************************************/

fun <T> reverse(list: List<T>) = list.reversed()

fun main() {
    println(reverse(listOf(1, 1, 2, 3, 5, 8)))  // [8, 5, 3, 2, 1, 1]
    println(reverse(listOf("1", "1", "2", "3", "5", "8")))  // [8, 5, 3, 2, 1, 1]
}