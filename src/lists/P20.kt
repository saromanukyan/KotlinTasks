package lists

/**********************************************************************************************
 * Remove the Kth element from a list.
 * Return the list and the removed element in a Tuple. Elements are numbered from 0.
 ***********************************************************************************************/
fun <T> removeAt(n: Int, list: List<T>): Pair<MutableList<T>, T?> {
    val firstList: MutableList<T> = ArrayList()
    var secondElement: T? = null
    for (i in 0 until list.size) {
        if (i == n) {
            secondElement = list[i]
            continue
        }
        firstList.add(list[i])
    }
    return firstList to secondElement
}

fun main() {
    println(removeAt(1, "abcd".toList())) // ([a, c, d], b)
    println(removeAt(3, listOf(0, 1, 2, 3, 4, 5))) // ([0, 1, 2, 4, 5], 3)
}