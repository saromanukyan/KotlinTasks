package collections

/**********************************************************************************************
 * Sum
 *
 * Return the sum of prices for all the products ordered by a given customer
 ***********************************************************************************************/
fun moneySpentBy(customer: Customer): Double {
    return customer.orders.flatMap(Order::products).sumByDouble { it.price }
}
fun main() {
    println(moneySpentBy(myShop.customers.get(2)))  // 820.0
}