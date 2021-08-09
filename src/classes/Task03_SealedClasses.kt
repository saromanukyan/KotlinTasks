package classes

/**********************************************************************************************
 * Sealed classes
 *
 * Reuse your solution from the previous task, but replace the interface with the sealed class.
 * Then you no longer need the else branch in when.
 ***********************************************************************************************/
fun _eval(expr: _Expr): Int =
    when (expr) {
        is _Num -> expr.value
        is _Sum -> _eval(expr.left) + _eval(expr.right)
    }

sealed class _Expr
class _Num(val value: Int) : _Expr()
class _Sum(val left: _Expr, val right: _Expr) : _Expr()

fun main() {
    println(_eval(_Num(7)))  // 7
    println(_eval(_Sum(_Num(4), _Num(5))))  // 9
    println(_eval(_Sum(_Num(10), _Num(5))))  // 15
}