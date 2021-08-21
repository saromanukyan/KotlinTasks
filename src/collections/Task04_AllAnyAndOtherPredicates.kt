package collections

/**********************************************************************************************
 * All, Any, and other predicates
 *
 * Return true if all customers are from a given city
 ***********************************************************************************************/
fun Shop.checkAllCustomersAreFrom(city: City): Boolean =
    this.customers.all { it.city.name == city.name }

/**********************************************************************************************
 * Return true if there is at least one customer from a given city
 ***********************************************************************************************/
fun Shop.hasCustomerFrom(city: City): Boolean =
    this.customers.any { it.city.name == city.name }

/**********************************************************************************************
 * Return the number of customers from a given city
 ***********************************************************************************************/
fun Shop.countCustomersFrom(city: City): Int =
    customers.count { it.city.name == city.name }

/**********************************************************************************************
 * Return a customer who lives in a given city, or null if there is none
 ***********************************************************************************************/
fun Shop.findCustomerFrom(city: City): Customer? =
    this.customers.find { it.city.name == city.name }

fun main() {
    println(myShop.checkAllCustomersAreFrom(Yerevan)) // false
    println(myShop.hasCustomerFrom(Yerevan)) // true
    println(myShop.countCustomersFrom(Yerevan)) // 3
    println(myShop.findCustomerFrom(Dilijan)) // Lilit from Dilijan
    println(myShop.findCustomerFrom(City("Goris"))) // null
}
