package conventions

/**********************************************************************************************
 * Ranges
 *
 * Using ranges implement a function that checks whether the date is
 * in the range between the first date and the last date (inclusive).
 ***********************************************************************************************/

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    val range = first..last
    return date in range
}

fun main() {
    val test1 = checkInRange(
        date = MyDate(1988, 5, 3),
        first = MyDate(1954, 6, 30),
        last = MyDate(2001, 12, 7)
    )
    val test2 = checkInRange(
        date = MyDate(2012, 5, 3),
        first = MyDate(1954, 6, 30),
        last = MyDate(2001, 12, 7)
    )
    println(test1) // true
    println(test2) // false
}