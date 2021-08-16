package logicAndCodes

/**********************************************************************************************
 * Gray code.
 *
 * An n-bit Gray code is a sequence of n-bit strings constructed according to certain rules.
 * Find out the construction rules and write a function to generate Gray codes.
 ***********************************************************************************************/
fun grayCodes(bits: Int): ArrayList<String> {
    val list: ArrayList<Int> = ArrayList()
    list.add(0)
    for (i in 0 until bits) {
        val highestBit = 1.shl(i)
        for (j in (list.size - 1) downTo 0) {
            val num = list[j].or(highestBit)
            list.add(num)
        }
    }

    val result: ArrayList<String> = ArrayList()
    for (numbers in list) {
        result.add(String.format("%${bits}s", Integer.toBinaryString(numbers))
            .replace(" ", "0"))
    }
    return result
}

fun main() {
    println(grayCodes(bits = 1)) // [0, 1]
    println(grayCodes(bits = 2)) // [00, 01, 11, 10]
    println(grayCodes(bits = 3)) // [000, 001, 011, 010, 110, 111, 101, 100]

}