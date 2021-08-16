package conventions

/**********************************************************************************************
 * Comparison
 *
 * Add the function compareTo to the class MyDate to make it comparable.
 * After this the code below date1 < date2 should start to compile.
 ***********************************************************************************************/
data class MyDate_(val year: Int, val month: Int, val dayOfMonth: Int) :
    Comparable<MyDate_> {
    override fun compareTo(other: MyDate_): Int {
        return if (this.year != other.year) this.year-other.year
        else if (this.month!=month) this.month-other.month
        else this.dayOfMonth-other.dayOfMonth
    }
}

fun test(date1: MyDate_, date2: MyDate_) {
    // this code should compile:
    println(date1 < date2)
}
fun main() {
    val date1 = MyDate_(2021, 7, 12)
    val date2 = MyDate_(1998, 2, 4)
    test(date1,date2)  //  false
    test(date2,date1)  //  true
}