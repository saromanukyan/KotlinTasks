package introduction

/**********************************************************************************************
 * Named arguments
 *
 * Make the function joinOptions() return the list in a JSON format
 * (e.g., "[a, b, c]") by specifying only two arguments.
 ***********************************************************************************************/

fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[",postfix = "]")
fun main() {
    val list= listOf<String>("a","b","c","d")
    println(joinOptions(list))
}