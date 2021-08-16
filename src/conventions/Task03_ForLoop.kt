package conventions

/**********************************************************************************************
 * For loop
 *
 * Make the class DateRange implement Iterable, so that it can be iterated over.
 * Use the function MyDate.followingDate() defined in DateUtil.kt;
 * you don't have to implement the logic for finding the following date on your own.
 * Use an object expression which plays the same role in Kotlin as an anonymous class in Java.
 ***********************************************************************************************/
class DateRange(var start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            override fun hasNext(): Boolean {
                return start <= end
            }

            override fun next(): MyDate {
                if (!hasNext()) throw NoSuchElementException()
                val temp = start
                start = start.followingDate()
                return temp
            }
        }
    }

}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
fun main() {
    val actualDateRange = arrayListOf<MyDate>()
    iterateOverDateRange(
        MyDate(2020, 7, 12),
        MyDate(2020, 7, 15)
    ){date->actualDateRange.add(date)}

    println(actualDateRange) // [MyDate(year=2020, month=7, dayOfMonth=12), MyDate(year=2020, month=7, dayOfMonth=13), MyDate(year=2020, month=7, dayOfMonth=14), MyDate(year=2020, month=7, dayOfMonth=15)]
}