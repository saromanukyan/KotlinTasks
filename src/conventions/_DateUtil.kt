package conventions

import java.util.*

/*
 * Returns the date after the given time interval.
 * The interval is specified as the given amount of days, weeks of years.
 * Usages:
 * 'date.addTimeIntervals(TimeInterval.DAY, 4)'
 * 'date.addTimeIntervals(TimeInterval.WEEK, 3)'
 */
fun _MyDate.addTimeIntervals(timeInterval: TimeInterval, amount: Int): _MyDate {
    val c = Calendar.getInstance()
    c.set(year + if (timeInterval == TimeInterval.YEAR) amount else 0, week, dayOfMonth)
    var timeInMillis = c.timeInMillis
    val millisecondsInADay = 24 * 60 * 60 * 1000L
    timeInMillis += amount * when (timeInterval) {
        TimeInterval.DAY -> millisecondsInADay
        TimeInterval.WEEK -> 7 * millisecondsInADay
        TimeInterval.YEAR -> 0L
    }
    val result = Calendar.getInstance()
    result.timeInMillis = timeInMillis
    return _MyDate(result.get(Calendar.YEAR), result.get(Calendar.MONTH), result.get(Calendar.DATE))
}