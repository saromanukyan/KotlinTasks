package collections

/**********************************************************************************************
 * Introduction
 *
 * For example, operations that transform a collection into another one, starting with 'to': toSet or toList.
 * Implement the extension function Shop.getSetOfCustomers().
 ***********************************************************************************************/
fun Shop.getSetOfCustomers(): Set<Customer> =
    this.customers.toMutableSet()

fun main() {
    println(myShop.getSetOfCustomers())
    // [Aram from Yerevan, Hakob from Yerevan, Gohar from Yerevan,
    // Mane from Gyumri, Lilit from Dilijan, Suren from Vanadzor, Martin from Hrazdan]
}