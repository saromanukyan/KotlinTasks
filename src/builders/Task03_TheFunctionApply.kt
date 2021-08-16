package builders

/**********************************************************************************************
 * The function apply
 *
 * The previous examples can be rewritten using the library function apply.
 * Write your own implementation of this function named 'myApply'.
 ***********************************************************************************************/
fun <T> T.myApply(f: T.() -> Unit): T {
    f()
    return this
}

fun createString(): String {
    return StringBuilder().myApply {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }.toString()
}

fun createMap(): Map<Int, String> {
    return hashMapOf<Int, String>().myApply {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}

fun main() {
    println(createString())  // Numbers: 12345678910
    println(createMap())     // {0=0, 1=1, 2=2, 3=3, 4=4, 5=5, 6=6, 7=7, 8=8, 9=9, 10=10}
}