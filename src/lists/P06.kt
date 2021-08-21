package lists

/**********************************************************************************************
 * Find out whether a list is a palindrome.
 ***********************************************************************************************/

fun <T> isPalindrome(list: List<T>): Boolean {

    return reverse(list) == list
}

fun main() {
    println(isPalindrome(listOf(1, 1, 2, 3, 5, 8)))  // false
    println(isPalindrome(listOf("1", "1", "2", "3", "5", "8")))  // false
    println(isPalindrome(listOf(1, 2, 3, 2, 1)))  // true
}