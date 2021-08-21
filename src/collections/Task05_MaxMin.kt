package collections

/**********************************************************************************************
 * Max min
 *
 * Return a customer who has placed the maximum amount of orders
 ***********************************************************************************************/
fun Shop.getCustomerWithMaxOrders(): Customer? =
    this.customers.maxByOrNull { it.orders.size }

/**********************************************************************************************
 * Return the most expensive product that has been ordered by the given customer
 ***********************************************************************************************/
fun getMostExpensiveProductBy(customer: Customer): Product? {
    val orders = customer.orders
    val expensiveProductList = mutableListOf<Product>()
    for (order in orders) {
        expensiveProductList.add(order.products.maxByOrNull { it.price }!!)
    }
    return expensiveProductList.maxByOrNull { it.price }
}

fun main() {
    println(myShop.getCustomerWithMaxOrders()) // Gohar from Yerevan
    println(getMostExpensiveProductBy(myShop.customers[2])) // 'Waffles' for 320.0
}