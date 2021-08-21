package collections

/**********************************************************************************************
 * Getting used to new style
 *
 * We can rewrite and simplify the following code using lambdas and operations on collections.
 * Fill in the gaps in doSomethingWithCollection, the simplified version of the
 * doSomethingWithCollectionOldStyle function, so that its behavior stays the same and isn't modified in any way.
 *
 * fun doSomethingWithCollectionOldStyle(
 * collection: Collection
 * ): Collection<String>? {
 * val groupsByLength = mutableMapOf<Int, MutableList<String>>()
 * for (s in collection) {
 * var strings: MutableList<String>? = groupsByLength[s.length]
 * if (strings == null) {
 * strings = mutableListOf()
 * groupsByLength[s.length] = strings
 * }
 * strings.add(s)
 * }
 *
 * var maximumSizeOfGroup = 0
 * for (group in groupsByLength.values) {
 * if (group.size > maximumSizeOfGroup) {
 * maximumSizeOfGroup = group.size
 * }
 * }
 *
 * for (group in groupsByLength.values) {
 * if (group.size == maximumSizeOfGroup) {
 * return group
 * }
 * }
 * return null
 * }
 ***********************************************************************************************/
fun doSomethingWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection.groupBy { s -> s.length }
    println("groupsByLength $groupsByLength")
    val maximumSizeOfGroup = groupsByLength.values.map { group -> group.size }.maxOrNull()
    println("maximumSizeOfGroup = $maximumSizeOfGroup")
    return groupsByLength.values.firstOrNull { group -> group.size == maximumSizeOfGroup }
}

fun main() {
    val list = mutableListOf("aaa", "bb", "cccccc", "ddd", "eeee", "f", "gg", "hhh", "iiiiii", "jjj", "kkkkk")
    println(doSomethingWithCollection(list))
    //  groupsByLength {3=[aaa, ddd, hhh, jjj], 2=[bb, gg], 6=[cccccc, iiiiii], 4=[eeee], 1=[f], 5=[kkkkk]}
    //  maximumSizeOfGroup = 4
    //  [aaa, ddd, hhh, jjj]
}