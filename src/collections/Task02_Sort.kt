package collections

/**********************************************************************************************
 * Sort
 *
 * Return a list of customers, sorted in the descending by number of orders they have made
 ***********************************************************************************************/
fun Shop.getCustomersSortedByOrders(): List<Customer> =
    this.customers.sortedByDescending { it.orders.size }

fun main() {
    println(myShop.getCustomersSortedByOrders())
    // [Gohar from Yerevan, Suren from Vanadzor, Aram from Yerevan, Mane from Gyumri,
    // Martin from Hrazdan, Lilit from Dilijan, Hakob from Yerevan]
}