package classes

/**********************************************************************************************
 * Extension functions
 *
 * implement the extension functions Int.r() and Pair.r() and make them convert Int and Pair to a RationalNumber.
 *
 * Pair is a class defined in the standard library:
 *
 * data class Pair(
 * val first: A,
 * val second: B
 * )
 ***********************************************************************************************/
fun Int.r(): RationalNumber = RationalNumber(this,1)

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber( first,second)

data class RationalNumber(val numerator: Int, val denominator: Int)

fun main() {
    println(10.r()) // RationalNumber(numerator=10, denominator=1)
    println(Pair(15,22).r()) // RationalNumber(numerator=15, denominator=22)
}