package properties

/**********************************************************************************************
 * Lazy property
 *
 * Add a custom getter to make the val 'lazy' really lazy.
 * It should be initialized by invoking 'initializer()' during the first access.
 * Do not use delegated properties!
 ***********************************************************************************************/
class LazyProperty(val initializer: () -> Int) {
    private var param: Int? = null
    val lazy: Int
        get() {
            if (param == null) {
                param = initializer()
            }
            return param as Int
        }
}

fun main() {
    var myNumber = 0
    val lazyProperty = LazyProperty {
        myNumber += 10
        222
    }
    val lazyProperty2 = LazyProperty {
        myNumber += 20
        333
    }
    println(myNumber)  // 0
    lazyProperty.lazy
    println(myNumber)  // 10
    lazyProperty2.lazy
    println(myNumber)  // 30
    lazyProperty.lazy
    println(myNumber)  // 30
    lazyProperty2.lazy
    println(myNumber)  // 30

}