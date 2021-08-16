package arithmetic

/**********************************************************************************************
 * Determine the prime factors of a given positive integer (2).
 * Construct a list containing prime factors and their multiplicity.
 ***********************************************************************************************/

fun Int.primeFactorMultiplicity(): List<Pair<Int, Int>> {
    val list = this.primeFactors()
    var first = list[0]
    var second = 1

    val listOfPairs = ArrayList<Pair<Int, Int>>()

    var i = 0
    while (i < list.size - 1) {
        if (list[i + 1] == first) {
            second++
        } else {
            listOfPairs.add(first to second)
            first = list[i + 1]
            second = 1
        }
        i++
    }
    listOfPairs.add(first to second)

    return listOfPairs
}

fun main() {
    println(315.primeFactorMultiplicity())  // [(3, 2), (5, 1), (7, 1)]
    println(144.primeFactorMultiplicity())  // [(2, 4), (3, 2)]
    println(360.primeFactorMultiplicity())  // [(2, 3), (3, 2), (5, 1)]
    println(935.primeFactorMultiplicity())  // [(5, 1), (11, 1), (17, 1)]
}