package collections

/**********************************************************************************************
 * Partition
 *
 * Return customers who have more undelivered orders than delivered
 ***********************************************************************************************/

fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> {
    val result = this.customers.filter {
        val (delivered, undelivered) = it.orders.partition { it.isDelivered }
        delivered.size < undelivered.size
    }
    return result.toSet()
}

fun main() {
    println(myShop.getCustomersWithMoreUndeliveredOrders()) // [Suren from Vanadzor]
}