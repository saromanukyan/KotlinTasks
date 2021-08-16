package logicAndCodes

/**********************************************************************************************
 * Truth tables for logical expressions (3).
 *
 * Generalize problem 46 in such a way that
 * the logical expression may contain any number of logical variables.
 ***********************************************************************************************/

fun Boolean.and_(vararg others: Boolean): Boolean {
    var result = this
    for (other in others) result = result.and_(other) //if (result) other else false
    return result
}

fun Boolean.or_(vararg others: Boolean): Boolean {
    var result = this
    for (other in others) result = if (result) true else other
    return result
}

fun Boolean.nand_(vararg others: Boolean): Boolean {
    var result = this
    for (other in others) result = !(result and_ other)
    return result
}

fun Boolean.nor_(vararg others: Boolean): Boolean {
    var result = this
    for (other in others) result = !(result or_ other)
    return result
}

fun Boolean.xor_(vararg others: Boolean): Boolean {
    var result = this
    for (other in others) result = if (result) !other else other
    return result
}

fun Boolean.impl_(vararg others: Boolean): Boolean {
    var result = this
    for (other in others) result = if (result) other else true
    return result
}

fun Boolean.equ_(vararg others: Boolean): Boolean {
    var result = this
    for (other in others) result = if (result) other else !other
    return result
}

fun main() {
    println(true.xor_(true, false, true))

}