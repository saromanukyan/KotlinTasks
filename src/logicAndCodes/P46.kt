package logicAndCodes

/**********************************************************************************************
 * Truth tables for logical expressions.
 *
 * Define functions and_, or_, nand_, nor_, xor_, impl_, and equ_
 * (for logical equivalence) which return true or false according to the result of their respective operations.
 ***********************************************************************************************/

infix fun Boolean.and_(other: Boolean): Boolean {
    return if (this) other else false
}

infix fun Boolean.or_(other: Boolean): Boolean {
    return if (this) true else other
}

infix fun Boolean.nand_(other: Boolean): Boolean {
    return !(this and_ other)
}

infix fun Boolean.nor_(other: Boolean): Boolean {
    return !(this or_ other)
}

infix fun Boolean.xor_(other: Boolean): Boolean {
    return if (this) !other else other
}

infix fun Boolean.impl_(other: Boolean): Boolean {
    return if (this) other else true
}

infix fun Boolean.equ_(other: Boolean): Boolean {
    return if (this) other else !other
}

fun Boolean.not_(): Boolean {
    return !this
}

fun printTruthTable(op: (Boolean, Boolean) -> Boolean) {
    println("a\t\tb \t\tresult")
    val first = true
    val second = false
    println("$first\t$first\t" + op(first, first))
    println("$first\t$second\t" + op(first, second))
    println("$second\t$first\t" + op(second, first))
    println("$second\t$second\t" + op(second, second))
}

fun main() {
    printTruthTable { a, b -> a.and_(a.or_(b.not_())) }
    printTruthTable { a, b -> a and_ b }
}
