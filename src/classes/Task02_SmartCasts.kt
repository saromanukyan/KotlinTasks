package classes

/**********************************************************************************************
 * Smart casts
 *
 * Rewrite the following Java code using smart casts and the when expression:
 *
 * public int eval(Expr expr) {
 * if (expr instanceof Num) {
 * return ((Num) expr).getValue();
 * }
 * if (expr instanceof Sum) {
 * Sum sum = (Sum) expr;
 * return eval(sum.getLeft()) + eval(sum.getRight());
 * }
 * throw new IllegalArgumentException("Unknown expression");
 * }
 ***********************************************************************************************/
fun eval(expr: Expr): Int {
    return when (expr) {
        is Num ->  expr.value
        is Sum -> {
            eval(expr.left)+eval(expr.right)
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }
}

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun main() {
    println(eval(Num(7)))  // 7
    println(eval(Sum(Num(4),Num(5))))  // 9
    println(eval(Sum(Num(10),Num(5))))  // 15
}
