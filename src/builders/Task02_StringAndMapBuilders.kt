package builders

/**********************************************************************************************
 * String and map builders
 *
 * unction literals with receiver are very useful for creating builders, for example:
 *
 * fun buildString(build: StringBuilder.() -> Unit): String {
 * val stringBuilder = StringBuilder()
 * stringBuilder.build()
 * return stringBuilder.toString()
 * }
 *
 * val s = buildString {
 * this.append("Numbers: ")
 * for (i in 1..3) {
 * // 'this' can be omitted
 * append(i)
 * }
 * }
 *
 * s == "Numbers: 123"
 * Implement the function 'buildMap' that takes a parameter (of extension function type)
 * creates a new HashMap, builds it, and returns it as a result.
 ***********************************************************************************************/

fun <Int, String> buildMap(build: HashMap<Int, String>.() -> Unit): Map<Int,String> {
    val map = HashMap<Int, String>()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
fun main() {
    println(usage()) // {0=0, 1=1, 2=2, 3=3, 4=4, 5=5, 6=6, 7=7, 8=8, 9=9, 10=10}
}