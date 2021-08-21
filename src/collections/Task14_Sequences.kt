package collections

/**********************************************************************************************
 * Sequences
 *
 * Find the most expensive product among all the delivered products
 * ordered by the customer. Use `Order.isDelivered` flag.
 ***********************************************************************************************/
fun findMostExpensiveProductBySeq(customer: Customer): Product? =
    customer.orders.asSequence<Order>().filter { it.isDelivered }
        .flatMap<Order, Product> { it.products.asSequence<Product>() }.maxByOrNull { it.price }

/**********************************************************************************************
 * Count the amount of times a product was ordered.
 * Note that a customer may order the same product several times.
 ***********************************************************************************************/
fun Shop.getNumberOfTimesProductWasOrderedSeq(product: Product): Int =
    customers.asSequence<Customer>().flatMap<Customer, Product> { return@flatMap it.getOrderedProductsSeq() }
        .count<Product> { it == product }

fun Customer.getOrderedProductsSeq(): Sequence<Product> =
    this.orders.flatMap { it.products }.asSequence()

fun main() {
    println(findMostExpensiveProductBySeq(myShop.customers[2])) // 'Tea' for 120.0
    println(myShop.getNumberOfTimesProductWasOrderedSeq(milk)) // 8

}