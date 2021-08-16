package properties

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**********************************************************************************************
 * Delegates
 *
 * You can declare your own delegates.
 * Implement the methods of the class EffectiveDate so you can delegate to it.
 * Store only the time in milliseconds in the timeInMillis property.
 * Use the extension functions MyDate.toMillis() and Long.toDate(), defined in MyDate.kt.
 ***********************************************************************************************/
class D {
    var date: MyDate by EffectiveDate()
}

class EffectiveDate<R> : ReadWriteProperty<R, MyDate> {

    var timeInMillis: Long? = null

    override fun getValue(thisRef: R, property: KProperty<*>): MyDate {
        return timeInMillis!!.toDate()
    }

    override fun setValue(thisRef: R, property: KProperty<*>, value: MyDate) {
        timeInMillis = value.toMillis()
    }
}

fun main() {
    val myBirthDay = D()
    myBirthDay.date = MyDate(1984, 11, 26)
    println( 1984 == myBirthDay.date.year)  // true
    println( 2021 == myBirthDay.date.year)  // false
    println( 11 == myBirthDay.date.month)  // true
    println( 15 == myBirthDay.date.month)  // false
    println( 26 == myBirthDay.date.dayOfMonth)  // true
    println( 11 == myBirthDay.date.dayOfMonth)  // false
}