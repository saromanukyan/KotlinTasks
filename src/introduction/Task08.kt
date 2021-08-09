package introduction

/**********************************************************************************************
 * Lambdas
 *
 * Pass a lambda to the any function to check if the collection contains an even number.
 * The any function gets a predicate as an argument and
 * returns true if there is at least one element satisfying the predicate.
 ***********************************************************************************************/

fun containsEven(collection: Collection<Int>): Boolean =
    collection.any { it%2==0 }