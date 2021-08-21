package lists

/**********************************************************************************************
 * Sorting a list of lists according to length of sublists.
 * a) We suppose that a list contains elements that are lists themselves.
 * The objective is to sort elements of the list according to their length.
 * E.g. short lists first, longer lists later, or vice versa.
 ***********************************************************************************************/
fun <T> lengthSort(list: List<List<T>>): List<List<T>> {
    return list.sortedBy(List<T>::size)
}

/**********************************************************************************************
 * b) Again, we suppose that a list contains elements that are lists themselves.
 * But this time the objective is to sort elements according to their length frequency;
 * i.e. lists with rare lengths are placed first, others with more frequent lengths come later.
 ***********************************************************************************************/
fun <T> lengthFreqSort(list: List<List<T>>): List<List<T>> {
    val tempList = lengthSort(list)
    val pairList: MutableList<Pair<Int, List<List<T>>>> = mutableListOf()

    var secondList: MutableList<List<T>> = ArrayList()
    secondList.add(tempList[0])
    var frequency = 1
    val pair = Pair(frequency, secondList)
    pairList.add(pair)

    for (indexOfList in 1 until tempList.size) {
        if (tempList[indexOfList].size != tempList[indexOfList - 1].size) {
            pairList.add(pair)
            secondList = mutableListOf()
            secondList.add(tempList[indexOfList])
            frequency = 1
        } else {
            secondList.add(tempList[indexOfList])
            frequency++
        }
        pairList[pairList.size - 1] = frequency to secondList
    }
    val sortedPairList = pairList.sortedBy { it.first }

    val result: MutableList<List<T>> = ArrayList()
    for (element in sortedPairList) {
        result.addAll(element.second)
    }

    return result
}


fun main() {
    val list = listOf(
        "abc".toList(),
        "de".toList(),
        "fgh".toList(),
        "de".toList(),
        "ijkl".toList(),
        "mn".toList(),
        "o".toList(),
        "a".toList(),
    )
    println(lengthSort(list)) // [[o], [a], [d, e], [d, e], [m, n], [a, b, c], [f, g, h], [i, j, k, l]]
    println(lengthFreqSort(list))  // [[i, j, k, l], [o], [a], [a, b, c], [f, g, h], [d, e], [d, e], [m, n]]
}