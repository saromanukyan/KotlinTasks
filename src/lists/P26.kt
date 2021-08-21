package lists

/**********************************************************************************************
 * Generate the combinations of K distinct objects chosen from the N elements of a list.
 * In how many ways can a committee of 3 be chosen from a group of 12 people?
 * There are C(12,3) = 220 possibilities, where C(N,K) denotes binomial coefficient.
 * For pure mathematicians, this result may be great.
 * But we want to really generate all the possibilities.
 ***********************************************************************************************/
fun <T> combinations(n: Int, list: List<T>): MutableList<List<T>> {
    val result: MutableList<List<T>> = ArrayList()

    val arrayOfIndices: IntArray = IntArray(n)
    var indexOfArray = 0
    var elementOfArray = 0
    while (indexOfArray >= 0) {
        if (elementOfArray <= list.size + (indexOfArray - n)) {
            arrayOfIndices[indexOfArray] = elementOfArray
            if (indexOfArray == n - 1) {
                val temp: MutableList<T> = ArrayList()
                for (index in 0 until n) {
                    temp.add(list[arrayOfIndices[index]])
                }
                result.add(temp)
                elementOfArray++
            } else {
                elementOfArray = arrayOfIndices[indexOfArray] + 1
                indexOfArray++
            }
        } else {
            indexOfArray--
            if (indexOfArray >= 0) elementOfArray = arrayOfIndices[indexOfArray] + 1
        }
    }
    return result
}

fun main() {
    val list: MutableList<List<Any>> = combinations(3, "abcde".toList())
    println(list) // [[a, b, c], [a, b, d], [a, b, e], [a, c, d], [a, c, e], [a, d, e], [b, c, d], [b, c, e], [b, d, e], [c, d, e]]

}