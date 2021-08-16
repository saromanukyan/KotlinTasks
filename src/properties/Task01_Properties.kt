package properties

/**********************************************************************************************
 * Properties
 *
 * dd a custom setter to PropertyExample.propertyWithCounter so that
 * the counter property is incremented every time a propertyWithCounter is assigned to it.
 ***********************************************************************************************/
class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(value){
            field=value
            counter++
        }
}

fun main() {
    val propertyExample1 =PropertyExample()
    propertyExample1.propertyWithCounter=50
    propertyExample1.propertyWithCounter=2
    propertyExample1.propertyWithCounter=140
    propertyExample1.propertyWithCounter=12
    propertyExample1.propertyWithCounter=88
    println(propertyExample1.counter)  // 5
}