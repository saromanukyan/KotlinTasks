package arithmetic

/**********************************************************************************************
 * A list of prime numbers.
 * Given a range of integers by its lower and upper limit, construct a
 * list of all prime numbers in that range.
 ***********************************************************************************************/
fun listPrimesInRange(range: IntRange): List<Int> {
    val list: ArrayList<Int> = ArrayList()
    for (i in range)
        if (i.isPrime())
            list += i
    return list
}

fun main() {
    println(listPrimesInRange(7..31)) // [7, 11, 13, 17, 19, 23, 29, 31]
}