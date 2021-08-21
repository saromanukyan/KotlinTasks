package lists

import kotlin.random.Random

/**********************************************************************************************
 * Lotto: Draw N different random numbers from the set 1..M.
 * Make sure there is a way to produce deterministic results.
 ***********************************************************************************************/
fun lotto(n: Int, m: Int): List<Int> {
    val result: MutableList<Int> = ArrayList()
    val repeatedNumbers: MutableSet<Int> = mutableSetOf()
    for (i in 1..n) {
        var number: Int = Random.nextInt(0, m)
        while (repeatedNumbers.contains(number)) {
            number = Random.nextInt(0, m)
        }
        repeatedNumbers.add(number)
        result.add(number)
    }
    return result
}

fun main() {
    println(lotto(3, 49)) // [16, 18, 2]
    println(lotto(3, 49)) // [8, 11, 3]
    println(lotto(3, 49)) // [20, 1, 45]
}
