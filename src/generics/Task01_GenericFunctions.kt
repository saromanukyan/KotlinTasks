package generics

import java.util.HashSet
import kotlin.collections.ArrayList

/**********************************************************************************************
 * Generic functions
 *
 * Make the code compile by implementing a partitionTo function
 * that splits a collection into two collections according to the predicate.
 ***********************************************************************************************/
fun <T, C : MutableCollection<T>> Collection<T>.partitionTo(t1: C, t2: C, lambda: (T) -> Boolean): Pair<C, C> {
    for (element in this) if (lambda(element)) t1.add(element) else t2.add(element)
    return Pair(t1, t2)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e")
        .partitionTo(ArrayList(), ArrayList()) { s -> !s.contains(" ") }
    check(words == listOf("a", "c"))
    check(lines == listOf("a b", "d e"))
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}')
        .partitionTo(HashSet(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    check(letters == setOf('a', 'r'))
    check(other == setOf('%', '}'))
}
fun partitionLetterAChecker(){
    val (listWithoutLetterA, listWithLetterA) = listOf("abcd", "a---b", "ddd", "d e","addd").
    partitionTo(ArrayList(), ArrayList(), { s -> !s.contains("a") })
    println("listWithoutLetterA = ${listOf(listWithoutLetterA)}")
    println("listWithLetterA = ${listOf(listWithLetterA)}")
}
fun main() {
    partitionLetterAChecker()

}