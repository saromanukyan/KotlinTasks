package introduction

/**********************************************************************************************
 * Nothing type
 *
 * Specify Nothing return type for the failWithWrongAge function.
 * Note that without the Nothing type the checkAge function doesn't
 * compile because the compiler assumes the age can be null.
 ***********************************************************************************************/

import java.lang.IllegalArgumentException

fun failWithWrongAge(age: Int?): Nothing {
    throw IllegalArgumentException("Wrong age: $age")
}

fun checkAge(age: Int?) {
    if (age == null || age !in 0..150) failWithWrongAge(age)
    println("Congrats! Next year you'll be ${age + 1}.")
}

fun main() {
    checkAge(18)
    checkAge(-52)
}