package conventions

/**********************************************************************************************
 * Operators overloading
 *
 * Implement date arithmetic. Support adding years, weeks, and days to a date.
 * You could write the code like this: date + YEAR * 2 + WEEK * 3 + DAY * 15.
 * First, add the extension function plus() to MyDate, taking the TimeInterval as an argument.
 * Use the utility function MyDate.addTimeIntervals() declared in DateUtil.kt
 * Then, try to support adding several time intervals to a date. You may need an extra class.
 ***********************************************************************************************/
data class _MyDate(val year: Int, val week: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun _MyDate.plus(timeInterval: TimeInterval): _MyDate {
    return addTimeIntervals(timeInterval,1)
}
class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)

operator fun TimeInterval.times(number: Int) =
    RepeatedTimeInterval(this, number)

operator fun _MyDate.plus(timeIntervals: RepeatedTimeInterval) =
    addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

fun task1(today: _MyDate): _MyDate {
    return today + TimeInterval.YEAR + TimeInterval.WEEK
}

fun task2(today: _MyDate): _MyDate {
    return today + TimeInterval.YEAR * 2 + TimeInterval.WEEK * 3 + TimeInterval.DAY * 5
}

fun main() {
    val test1=task1(_MyDate(2014, 5, 1))
    val test2=task2(_MyDate(2014, 0, 1))
    println(test1)  // _MyDate(year=2015, month=5, dayOfMonth=8)
    println(test2)  // _MyDate(year=2016, month=0, dayOfMonth=27)
}