package properties

/**********************************************************************************************
 * Delegates example
 *
 * Learn about delegated properties and make the property lazy using delegates.
 ***********************************************************************************************/

class LazyProperty_(private val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}

fun main() {
    var myNumber = 0
    val lazyProperty = LazyProperty_ {
        myNumber += 10
        222
    }
    val lazyProperty2 = LazyProperty_ {
        myNumber += 20
        333
    }
    println(myNumber)  // 0
    lazyProperty.lazyValue
    println(myNumber)  // 10
    lazyProperty2.lazyValue
    println(myNumber)  // 30
    lazyProperty.lazyValue
    println(myNumber)  // 30
    lazyProperty2.lazyValue
    println(myNumber)  // 30

}
