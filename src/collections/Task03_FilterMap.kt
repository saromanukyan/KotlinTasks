package collections

/**********************************************************************************************
 * Filter; map
 *
 * Find all the different cities the customers are from
 ***********************************************************************************************/
fun Shop.getCustomerCities(): Set<City> {
    return customers
        .map { return@map it.city }
        .toMutableSet()
}

/**********************************************************************************************
 * Find the customers living in a given city
 ***********************************************************************************************/
fun Shop.getCustomersFrom(city: City): List<Customer> {
    return customers
        .filter { return@filter it.city == city }
        .toMutableList()
}

fun main() {
    println(myShop.getCustomerCities()) // [Yerevan, Gyumri, Dilijan, Vanadzor, Hrazdan]
    println(myShop.getCustomersFrom(Yerevan)) // [Aram from Yerevan, Hakob from Yerevan, Gohar from Yerevan]
}