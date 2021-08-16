package conventions

/**********************************************************************************************
 * Invoke
 *
 * Implement the function Invokable.invoke() so it can count the number of times it is invoked.
 ***********************************************************************************************/
class Invokable {
    var numberOfInvocations: Int = 0
        private set

    operator fun invoke(): Invokable {
        numberOfInvocations++
        return this
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()

fun main() {

    println(Invokable().numberOfInvocations)  // 0
    println(Invokable()().numberOfInvocations)  // 1
    println(Invokable()()().numberOfInvocations)  // 2
    println(Invokable()()()().numberOfInvocations)  // 3
    println(Invokable()()()()().numberOfInvocations)  // 4

}

