package lists

/**********************************************************************************************
 * Create a list containing all integers within a given range.
 ***********************************************************************************************/
fun range(start: Int, end: Int): List<Int> {
    val result: MutableList<Int> = ArrayList()
    for (i in start..end) {
        result.add(i)
    }
    return result
}

fun main() {
    println(range(4, 9)) // [4, 5, 6, 7, 8, 9]
}