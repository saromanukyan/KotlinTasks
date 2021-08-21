package collections

/**********************************************************************************************
 * FlatMap
 *
 * Return all products the given customer has ordered
 ***********************************************************************************************/
fun Customer.getOrderedProducts(): List<Product> =
    this.orders.flatMap { it.products.toList() }

/**********************************************************************************************
 * Return all products that were ordered by at least one customer
 ***********************************************************************************************/
fun Shop.getOrderedProducts(): Set<Product> =
    this.customers.flatMap(Customer::getOrderedProducts).toMutableSet()

fun main() {
    println(myShop.customers[2].getOrderedProducts())
    // ['IceCream' for 66.0, 'Milk' for 58.0, 'Waffles' for 320.0, 'Tea' for 120.0,
    // 'Coffee' for 28.0, 'Pizza' for 99.0, 'Beer' for 129.0]
    println(myShop.getOrderedProducts())
    // ['Sandwich' for 250.0, 'Milk' for 58.0, 'Beer' for 129.0, 'Waffles' for 320.0, 'IceCream' for 66.0,
    // 'Tea' for 120.0, 'Coffee' for 28.0, 'Pizza' for 99.0, 'Bread' for 370.0,
    // 'Cheese' for 49.0, 'Cake' for 500.0, 'Eggs' for 299.0]
}