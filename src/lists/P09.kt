package lists

/**********************************************************************************************
 * Pack consecutive duplicates of list elements into sublists.
 * If a list contains repeated elements, they should be placed in separate sublists.
 ***********************************************************************************************/
fun <T> pack(list: List<T>): MutableList<List<T>> {
    val result: MutableList<List<T>> = ArrayList()
    var temp: MutableList<T> = mutableListOf()
    temp.add(list[0])
    for (i in 1 until list.size) {
        if (list[i] != list[i - 1]) {
            result.add(temp)
            temp = mutableListOf()
            temp.add(list[i])
        } else temp.add(list[i])
    }
    result.add(temp)
    return result
}

fun main() {
    println(pack("aaaabccaadeeee".toList())) // [[a, a, a, a], [b], [c, c], [a, a], [d], [e, e, e, e]]
    println(pack(listOf(1, 1, 1, 2, 2, 3, 4, 4, 4, 5))) // [[1, 1, 1], [2, 2], [3], [4, 4, 4], [5]]
}