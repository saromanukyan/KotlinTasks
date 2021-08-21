package lists

/**********************************************************************************************
 * Generate a random permutation of the elements of a list.
 * Make sure there is a way to produce deterministic results.
 ***********************************************************************************************/
fun <T> randomPermute(list: List<T>): List<T> = list.shuffled()
fun main() {
    println(randomPermute("abcdef".toList())) // [b, d, a, f, e, c]
}