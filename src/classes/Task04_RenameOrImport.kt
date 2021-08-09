package classes

/**********************************************************************************************
 * Rename on import
 *
 * Uncomment the code and make it compile.
 * Rename Random from the kotlin package to KRandom, and Random from the java package to JRandom.
 ***********************************************************************************************/
import kotlin.random.Random as KRandom
import java.util.Random as JRandom

fun useDifferentRandomClasses(): String {
    return "Kotlin random: " +
            KRandom.nextInt(2) +
            "\nJava random: " +
            JRandom().nextInt(2) +
            "."
}
fun main() {
    val myStringOfRandomNumbers = useDifferentRandomClasses()
    println(myStringOfRandomNumbers)
}