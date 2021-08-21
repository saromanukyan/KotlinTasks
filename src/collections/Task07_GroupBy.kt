package collections

/**********************************************************************************************
 * Group By
 *
 * Build a map that stores the customers living in a given city
 ***********************************************************************************************/
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> {
    val result: Map<City, List<Customer>> = this.customers.groupBy { it.city }
    return result
}

fun main() {
    println(myShop.groupCustomersByCity())
    // {{Yerevan=[Aram from Yerevan, Hakob from Yerevan, Gohar from Yerevan],
    // Gyumri=[Mane from Gyumri],
    // Dilijan=[Lilit from Dilijan],
    // Vanadzor=[Suren from Vanadzor],
    // Hrazdan=[Martin from Hrazdan]}
}